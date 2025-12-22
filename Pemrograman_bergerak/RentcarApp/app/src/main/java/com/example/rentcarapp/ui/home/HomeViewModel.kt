package com.example.rentcar.ui.home
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import android.util.Log
import com.example.rentcar.ui.home.UserModel
class HomeViewModel : ViewModel() {

    private val _userData = MutableLiveData<UserModel?>()
    val userData: LiveData<UserModel?> get() = _userData

    private val databaseRef: DatabaseReference = FirebaseDatabase.getInstance().reference
        .child("auth") // Sesuaikan dengan path data Anda di Firebase Console
        .child("KLOgLy252hER8mVfwafR")// Ganti dengan ID user yang spesifik atau kunci data
    init {
        fetchUserDataFromFirebase()
    }

    private fun fetchUserDataFromFirebase() {
        databaseRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // Metode ini dipanggil setiap kali data di path referensi berubah
                val user = snapshot.getValue(UserModel::class.java)
                _userData.postValue(user)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error di sini
                _userData.postValue(null)
                 Log.e("ERORRRR BAIII", "ERRORR KONTOLLLLL", error.toException())
            }
        })
    }
}
package com.example.rentcar.ui.gallery

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rentcar.ui.home.UserModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class GalleryViewModel : ViewModel() {
    private val _userData = MutableLiveData<auth?>()
    val userData: LiveData<auth?> get() = _userData
    private val db = FirebaseFirestore.getInstance()
    // Referensi LANGSUNG ke dokumen
    private val documentRef: DocumentReference = db
        .collection("auth") // Nama Collection Anda
        .document("KLOgLy252hER8mVfwafR") // ID Document Anda
    init {
        fetchUserDataFromFirebase()
    }
    private fun fetchUserDataFromFirebase() {
        documentRef.get() // Mengambil data sekali (lebih efisien jika data tidak sering berubah)
            .addOnSuccessListener { documentSnapshot ->
                if (documentSnapshot.exists()) {
                    // Gunakan documentSnapshot.toObject() untuk pemetaan
                    val user = documentSnapshot.toObject(auth::class.java)

                    // Pastikan nama-nama field di Firestore (email, username, password)
                    // sama persis dengan nama-nama properti di data class auth

                    _userData.postValue( user)
                } else {
                    Log.e("Firestore", "Dokumen tidak ditemukan")
                    _userData.postValue( null)
                }
            }
            .addOnFailureListener { exception ->
                Log.e("Firestore", "ERRORR KONTOLLLLL", exception)
                _userData.postValue(null)
            }
    }
}
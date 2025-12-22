package com.example.rentcar.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.rentcar.R
import com.example.rentcar.databinding.FragmentHomeBinding

// app/src/main/java/com/yourpackage/home/HomeViewModel.kt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rentcar.ui.gallery.GalleryViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
// Import UserModel Anda

// app/src/main/java/com/yourpackage/home/HomeFragment.kt


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val homeViewModel: GalleryViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView: TextView = view.findViewById(R.id.text_home) // Menggunakan ID dari XML Anda
        homeViewModel.userData.observe(viewLifecycleOwner,{ authObject ->
            // LOGGING untuk memastikan objek auth tidak null dan punya username
            Log.d("GalleryFragment", "Observed auth object: $authObject")
            // Pastikan authObject tidak null sebelum mengakses username
            textView.text = authObject?.username ?: "Data Pengguna Kosong"
        })
    }
}


//private val HomeFragment.it: Any
//private val HomeViewModel.text: Any

//class HomeFragment : Fragment() {
//
//    private var _binding: FragmentHomeBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val Tampilan: TextView = binding.textHome
////       textView.text="haloo semua"
//        homeViewModel.userData.observe(viewLifecycleOwner, Observer { user ->
//            if (user != null) {
//                // Data berhasil dimuat, tampilkan username di TextView
//                Tampilan.text = "Selamat datang,!"
//            } else {
//                // Terjadi kesalahan atau data tidak ditemukan
//                Tampilan.text = "Gagal memuat data pengguna."
//            }
//        })
//        return root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}
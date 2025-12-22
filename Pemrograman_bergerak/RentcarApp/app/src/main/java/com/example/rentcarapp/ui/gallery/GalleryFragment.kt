package com.example.rentcar.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.rentcar.R
import com.example.rentcar.databinding.FragmentGalleryBinding
import kotlin.getValue

class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private val GalleryViewModel: GalleryViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtUsername: TextView = view.findViewById(R.id.text_username) // Menggunakan ID dari XML Anda
        val txtEmail: TextView = view.findViewById(R.id.text_email) // Menggunakan ID dari XML Anda
        GalleryViewModel.userData.observe(viewLifecycleOwner,{ authObject ->
            // LOGGING untuk memastikan objek auth tidak null dan punya username
            Log.d("GalleryFragment", "Observed auth object: $authObject")
            // Pastikan authObject tidak null sebelum mengakses username
            txtUsername.text = authObject?.username ?: "Data Pengguna Kosong "
            txtEmail.text = authObject?.email ?: " "

        })
    }
}
package com.example.pbfunction


import android.widget.ImageView
import android.widget.Toast

class FuncImg(private val imageView: ImageView) : FunctionalityInterface {
    override fun show() {
        imageView.setImageResource(R.drawable.ic_google) // ganti dengan gambar di drawable
        Toast.makeText(imageView.context, "Menampilkan gambar", Toast.LENGTH_SHORT).show()
    }
}

package com.example.pbfunction


import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class FuncCam(private val activity: Activity) : FunctionalityInterface {
    override fun show() {
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.CAMERA), 101)
        } else {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            activity.startActivity(intent)
            Toast.makeText(activity, "Membuka kamera", Toast.LENGTH_SHORT).show()
        }
    }
}

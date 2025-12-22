package com.example.pbfunction


import android.view.View
import android.widget.Button
import android.widget.Toast

class FuncBtn(private val button: Button) : FunctionalityInterface {
    override fun show() {
        button.visibility = View.VISIBLE
        Toast.makeText(button.context, "Button tambahan muncul", Toast.LENGTH_SHORT).show()
    }
}

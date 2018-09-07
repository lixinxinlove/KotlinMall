package com.kotlin.user.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.user.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor

import org.jetbrains.anko.toast


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mBtnRegister.setOnClickListener {
            toast("ll")
            startActivity(intentFor<TestActivity>("id" to "oo"))
        }


    }
}

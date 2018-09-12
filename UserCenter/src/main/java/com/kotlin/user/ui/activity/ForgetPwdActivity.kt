package com.kotlin.user.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.user.R
import kotlinx.android.synthetic.main.activity_forget_pwd.*
import org.jetbrains.anko.clearTop
import org.jetbrains.anko.singleTop

class ForgetPwdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pwd)

        mForget.setOnClickListener{
            var intent=Intent(this,RegisterActivity::class.java)
            intent.singleTop().clearTop()
            startActivity(intent)
        }

    }
}

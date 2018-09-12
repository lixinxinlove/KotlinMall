package com.kotlin.base.ui.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open class BaseActivity:AppCompatActivity() {

    lateinit var mContent:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContent=this
    }


}
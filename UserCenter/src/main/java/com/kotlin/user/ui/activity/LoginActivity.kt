package com.kotlin.user.ui.activity

import android.content.Intent
import android.os.Bundle
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.presenter.LoginPresenter
import com.kotlin.user.presenter.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {

    override fun start() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mPresenter = LoginPresenter()
        mPresenter.mView = this

        mLogin.setOnClickListener {
            mPresenter.login()
        }
    }

    override  fun startForgetPwd() {
        startActivity(Intent(this, ForgetPwdActivity::class.java))


    }
}

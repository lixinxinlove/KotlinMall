package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.LoginView

class LoginPresenter : BasePresenter<LoginView>() {

    fun register() {
        mView.showLoading()
//        mView.hideLoading()
        mView.start()

        mView.hideLoading()
    }

    fun login() {
        mView.startForgetPwd()
    }


}
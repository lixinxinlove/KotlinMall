package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register() {
        mView.showLoading()
//        mView.hideLoading()
        mView.start()

        mView.hideLoading()
    }
}
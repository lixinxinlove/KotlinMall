package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.ForgetPwdView

class ForgetPwdPresenter : BasePresenter<ForgetPwdView>() {

    fun register() {
        mView.showLoading()
//        mView.hideLoading()
        mView.start()

        mView.hideLoading()
    }
}
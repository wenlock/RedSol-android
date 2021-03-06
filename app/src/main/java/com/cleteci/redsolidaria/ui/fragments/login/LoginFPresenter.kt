package com.cleteci.redsolidaria.ui.fragments.login

import android.text.TextUtils
import com.cleteci.redsolidaria.BaseApp
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ogulcan on 07/02/2018.
 */
class LoginFPresenter : LoginFContract.Presenter {


    private val subscriptions = CompositeDisposable()
    private lateinit var view: LoginFContract.View

    override fun subscribe() {

    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: LoginFContract.View) {
        this.view = view
        view.init() // as default
    }

    override fun validateEmailPass(email: String, pass: String) {
        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email.replace(" ","")).matches()) {

            view.errorEmailPass("Correo incorrecto")
        } else if (pass.length<1){
            view.errorEmailPass("Contraseña incorrecta")
        } else {
           view.validEmailPass()
        }

    }


}
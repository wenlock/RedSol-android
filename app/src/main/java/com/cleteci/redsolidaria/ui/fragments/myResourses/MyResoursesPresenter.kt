package com.cleteci.redsolidaria.ui.fragments.myResourses

import com.cleteci.redsolidaria.R
import com.cleteci.redsolidaria.models.Resourse
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ogulcan on 07/02/2018.
 */
class MyResoursesPresenter: MyResoursesContract.Presenter {


    private val subscriptions = CompositeDisposable()
    private lateinit var view: MyResoursesContract.View

    override fun subscribe() {

    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: MyResoursesContract.View) {
        this.view = view
        view.init() // as default
    }

    override fun getData() {
        val arrayList = ArrayList<Resourse>()//Creating an empty arraylist
        val tipo1 = Resourse(1,"Justice International","Salud",  R.drawable.ic_emergency)//Creating an empty arraylist
        arrayList.add(tipo1)//Adding object in arraylist

        val tipo2 = Resourse(2, "Justice International","Educación",  R.drawable.ic_education)//Creating an empty arraylist
        arrayList.add(tipo2)//Adding object in arraylist


        view.loadDataSuccess(arrayList,arrayList,arrayList,arrayList)
    }


}
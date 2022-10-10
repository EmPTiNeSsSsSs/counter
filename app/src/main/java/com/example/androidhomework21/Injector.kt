package com.example.androidhomework21

import com.example.androidhomework21.models.CounterModel
import com.example.androidhomework21.presenter.Presenter

class Injector {
    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getCounterModel(): CounterModel {
            return CounterModel()
        }
    }
}
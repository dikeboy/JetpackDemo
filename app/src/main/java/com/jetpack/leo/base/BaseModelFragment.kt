package com.jetpack.leo.base

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.SavedStateVMFactory
import androidx.lifecycle.ViewModelProviders

/**
 *   author : leo
 *   date   : 2019/6/168:39
 */
 abstract  class BaseModelFragment<T: BaseViewModel>: BaseFragment() {

    lateinit var viewModel: T



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val factory = SavedStateVMFactory(this)
        viewModel = ViewModelProviders.of(this,factory).get(getViewModelClass())
        doPostExecute(savedInstanceState)
    }

    abstract  fun getViewModelClass(): Class<T>

    abstract  fun doPostExecute(savedInstanceState: Bundle?)

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lin","destroy="+javaClass::getSimpleName)
    }
}
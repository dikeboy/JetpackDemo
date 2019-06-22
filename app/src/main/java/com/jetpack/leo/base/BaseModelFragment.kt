package com.jetpack.leo.base

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.SavedStateVMFactory
import androidx.lifecycle.ViewModelProviders
import java.lang.reflect.ParameterizedType

/**
 *   author : leo
 *   date   : 2019/6/168:39
 */
 abstract  class BaseModelFragment<T: BaseViewModel>: BaseFragment() {

    lateinit var viewModel: T



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val factory = SavedStateVMFactory(this)
        viewModel = ViewModelProviders.of(this,factory).get((this.javaClass
            .genericSuperclass as ParameterizedType)
            .actualTypeArguments[0] as Class<T>)
        doPostExecute(savedInstanceState)
    }


    abstract  fun doPostExecute(savedInstanceState: Bundle?)

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lin","destroy="+javaClass::getSimpleName)
    }
}
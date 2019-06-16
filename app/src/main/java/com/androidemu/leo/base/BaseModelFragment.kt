package com.androidemu.leo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.SavedStateVMFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.androidemu.leo.R
import com.androidemu.leo.rom.NativeViewModel

/**
 *   author : leo
 *   date   : 2019/6/168:39
 */
 abstract  class BaseModelFragment<T: BaseViewModel>: BaseFragment() {

    private lateinit var viewModel: T



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val factory = SavedStateVMFactory(this)
        viewModel = ViewModelProviders.of(this,factory).get(getViewModelClass())
    }

    abstract  fun getViewModelClass(): Class<T>
}
package com.androidemu.leo.rom

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.androidemu.leo.R

import com.androidemu.leo.base.BaseModelFragment



class NativeFragment : BaseModelFragment<NativeViewModel>() {

    companion object {
        fun newInstance(isTab: Boolean): NativeFragment{
            val bundle = Bundle()
            bundle.putBoolean("isTab", isTab)
          return  with(NativeFragment()){
               setArguments(bundle)
                this
            }
        }
    }

    override fun doBeforeCreate(inflater: LayoutInflater, savedInstanceState: Bundle?) {
        super.doBeforeCreate(inflater, savedInstanceState)
        arguments?.let {
            if(it.getBoolean("isTab")){
                barConfig.show  = false
                barConfig.showBack =  false
            }
        }
    }
    override fun getFragmentView(inflater: LayoutInflater, savedInstanceState: Bundle?): View {
        Log.e("lin","NaviteFragment oncreate" +arguments?.getBoolean("isTab"))
        var view = inflater.inflate(R.layout.native_fragment, null, false)
        view.findViewById<Button>(R.id.goToNext).setOnClickListener {
            findNavController().navigate(R.id.rom_list, null)
        }
        return view;
    }


    override fun getViewModelClass(): Class<NativeViewModel> {
        return NativeViewModel::class.java
    }

    override fun getTitle(): String {
        return "Navite"
    }
}

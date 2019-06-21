package com.androidemu.leo.module.rom

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController

import com.androidemu.leo.R
import com.androidemu.leo.base.BaseModelFragment
import kotlinx.android.synthetic.main.rom_list_fragment.*

class RomDetailFragment : BaseModelFragment<RomDetailViewModel>() {

    companion object {
        fun newInstance() = RomListFragment()
    }

    override fun getFragmentView(inflater: LayoutInflater, savedInstanceState: Bundle?): View {
        var view = inflater.inflate(R.layout.rom_detail_fragment,null,false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToMain.setOnClickListener {
            findNavController().navigate(R.id.pop_up_todetail)
        }
    }

    override fun getViewModelClass(): Class<RomDetailViewModel> {
        return RomDetailViewModel::class.java
    }


    override fun getTitle(): String {
        return "Detail"
    }

    override fun doPostExecute(savedInstanceState: Bundle?) {

    }
}

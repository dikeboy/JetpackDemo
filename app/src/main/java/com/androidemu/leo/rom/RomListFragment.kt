package com.androidemu.leo.rom

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

import com.androidemu.leo.R
import com.androidemu.leo.base.BaseModelFragment
import kotlinx.android.synthetic.main.rom_list_fragment.*

class RomListFragment  : BaseModelFragment<RomListViewModel>() {

    companion object {
        fun newInstance() = RomListFragment()
    }

    override fun getFragmentView(inflater: LayoutInflater, savedInstanceState: Bundle?): View {
        var view = inflater.inflate(R.layout.rom_list_fragment,null,false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goToMain.setOnClickListener {
            findNavController().navigate(R.id.action_rom_list_to_rom_detail, null)
        }
        goToUri.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.example.com/lesi"))
            startActivity(intent)
        }
    }

    override fun getViewModelClass(): Class<RomListViewModel> {
        return RomListViewModel::class.java
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("lin","onDestroyView")
    }

    override fun getTitle(): String {
        return "List"
    }
}

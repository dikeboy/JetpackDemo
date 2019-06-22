package com.jetpack.leo.module.rom

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController

import com.jetpack.leo.R
import com.jetpack.leo.base.BaseModelFragment
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
            findNavController().navigate(R.id.action_match_to_in_game_nav_graph, null)
        }
        goToUri.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.example.com/lesi"))
            startActivity(intent)
        }



    }

    override fun getTitle(): String {
        return "List"
    }

    override fun doPostExecute(savedInstanceState: Bundle?) {
        viewModel.saveData()
    }
}

package com.jetpack.leo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jetpack.leo.R
import com.jetpack.leo.module.toolbar.ToolBarConfig


/**
 *   author : leo
 *   date   : 2019/6/168:39
 */
 abstract  class BaseFragment: Fragment(){
    lateinit var  toolBar: Toolbar
    var  barConfig = ToolBarConfig()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        doBeforeCreate(inflater,savedInstanceState)
        var view = inflater.inflate(R.layout.base_content,null,false) as LinearLayout
         toolBar = view.findViewById<Toolbar>(R.id.toolbar)
        view.findViewById<LinearLayout>(R.id.containerLayout).addView(getFragmentView(inflater,savedInstanceState))

        initToolBar()
         return view
    }


    abstract  fun  getFragmentView(inflater: LayoutInflater, savedInstanceState: Bundle?): View

      open fun  doBeforeCreate(inflater: LayoutInflater, savedInstanceState: Bundle?){

      }

    fun setToolBarConfig(config : ToolBarConfig){
       this.barConfig = config
    }

    fun initToolBar(){
        if(barConfig.show){
            setHasOptionsMenu(true)
            if(activity is AppCompatActivity){
                (activity as AppCompatActivity).setSupportActionBar(toolBar)
            }
        }
        else{
            (activity as AppCompatActivity).setSupportActionBar(null)
            toolBar.visibility = View.GONE
        }
        toolBar.findViewById<ImageView>(R.id.tb_left_btn).setOnClickListener {
            findNavController().popBackStack()
        }
        toolBar.findViewById<TextView>(R.id.tbTitleTv).setText(getTitle())
        if(barConfig.showBack){
            toolBar.findViewById<ImageView>(R.id.tb_left_btn).visibility = View.VISIBLE
        }
        else{
            toolBar.findViewById<ImageView>(R.id.tb_left_btn).visibility = View.GONE
        }
    }
   abstract fun getTitle(): String
}
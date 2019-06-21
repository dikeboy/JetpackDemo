package com.androidemu.leo.module.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.androidemu.leo.R
import com.androidemu.leo.base.BaseFragment
import com.androidemu.leo.module.rom.NativeFragment
import com.androidemu.leo.module.toolbar.ToolBarConfig
import com.google.android.material.tabs.TabLayout
/**
 *   author : leo
 *   date   : 2019/6/1620:48
 */
class MainFragment: BaseFragment() {

    val tabTitles = listOf<String>("本地","分类","下载")
    private val fragmentList = arrayOf<BaseFragment>(
        NativeFragment.newInstance(true),
        NativeFragment.newInstance(true),
        NativeFragment.newInstance(true)
    )

    override fun getFragmentView(inflater: LayoutInflater, savedInstanceState: Bundle?): View {
        var view = inflater.inflate(R.layout.fragment_main, null, false)
        var viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        var tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        Log.e("lin",javaClass.simpleName+"  createView")
        with(viewPager){
            adapter = ViewPagerAdapter(childFragmentManager,fragmentList,tabTitles)
            offscreenPageLimit = 3
        }
        setToolBarConfig(ToolBarConfig(true,false))
        with(tabLayout) {
            tabMode = TabLayout.MODE_FIXED
            setupWithViewPager(viewPager)
            addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabSelected(tab: TabLayout.Tab) {
                }
            })
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("lin",javaClass.simpleName+" destroy")
    }

    override fun getTitle(): String {
        return "主页"
    }
}
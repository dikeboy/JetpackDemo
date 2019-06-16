package com.androidemu.leo.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.androidemu.leo.base.BaseFragment

/**
 *   author : leo
 *   date   : 2019/6/169:26
 */
class ViewPagerAdapter(var fm: FragmentManager, var fragmentList: Array<BaseFragment>, var tabTitleList:List<String>): FragmentStatePagerAdapter(fm) {

   override fun getItem(arg0: Int): Fragment{
        return  fragmentList[arg0]
    }

    override  fun getPageTitle(position: Int): CharSequence {
        return tabTitleList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

}
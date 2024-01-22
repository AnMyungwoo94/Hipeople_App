package com.myungwoo.hipeople.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.myungwoo.hipeople.view.fragment.ChatFragment
import com.myungwoo.hipeople.view.fragment.CommunityFragment
import com.myungwoo.hipeople.view.fragment.CardsteckFragment
import com.myungwoo.hipeople.view.fragment.MapFragment

class CustomAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragmentList = ArrayList<Fragment>()
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CardsteckFragment()
            1 -> ChatFragment()
            2 -> MapFragment()
            3 -> CommunityFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    fun addListFragment(fragment: Fragment) {
        this.fragmentList.add(fragment)
    }
}
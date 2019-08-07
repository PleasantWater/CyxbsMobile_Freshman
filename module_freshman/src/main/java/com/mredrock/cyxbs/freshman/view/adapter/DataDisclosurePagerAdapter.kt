package com.mredrock.cyxbs.freshman.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mredrock.cyxbs.freshman.view.fragment.SexRatoFragment
import com.mredrock.cyxbs.freshman.view.fragment.SubjectDataFragment

/**
 * Create by yuanbing
 * on 2019/8/5
 */
class DataDisclosurePagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    private val mPages = listOf(
            SubjectDataFragment(),
            SexRatoFragment()
    )

    override fun getItem(position: Int) = mPages[position]

    override fun getCount() = mPages.size
}
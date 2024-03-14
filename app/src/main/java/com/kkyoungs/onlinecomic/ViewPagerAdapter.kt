package com.kkyoungs.onlinecomic

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val mainActivity : MainActivity):FragmentStateAdapter(mainActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                return WebViewFragment(position, "https://m.comic.naver.com/webtoon/detail?titleId=774862&no=123\"").apply {
                    listener = mainActivity
                }
            }

            1->{
                WebViewFragment(position,"https://m.comic.naver.com/webtoon/detail?titleId=774862&no=124\"").apply {
                    listener = mainActivity
                }
            }

            else->{
                WebViewFragment(position, "https://m.comic.naver.com/webtoon/detail?titleId=774862&no=125\"").apply {
                    listener = mainActivity
                }
            }
        }
    }
}
package com.example.mycourse

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val tombol = view.findViewById<AppCompatButton>(
            R.id.btnLihatMateri
        )

        tombol.setOnClickListener {
            val viewPager = requireActivity()
                .findViewById<ViewPager2>(R.id.view_pager)

            viewPager.setCurrentItem(1, true)
        }
    }
}
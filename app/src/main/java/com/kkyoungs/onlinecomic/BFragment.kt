package com.kkyoungs.onlinecomic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.kkyoungs.onlinecomic.databinding.FragmentSecondWebviewBinding
import com.kkyoungs.onlinecomic.databinding.FragmentWebviewBinding

class BFragment: Fragment() {
    private lateinit var binding :FragmentSecondWebviewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondWebviewBinding.inflate(inflater)

        return binding.root
    }
}
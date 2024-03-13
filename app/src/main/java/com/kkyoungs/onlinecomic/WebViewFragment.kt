package com.kkyoungs.onlinecomic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.kkyoungs.onlinecomic.databinding.FragmentWebviewBinding

class WebViewFragment : Fragment() {
    private lateinit var binding :FragmentWebviewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWebviewBinding.inflate(inflater)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webView = binding.webView
        webView.webViewClient = WebttonWebViewClient(binding.progressBar)
        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://m.comic.naver.com/webtoon/detail?titleId=774862&no=123")
    }

    fun canGoBack() : Boolean{
        return binding.webView.canGoBack()
    }

    fun goBack(){
        binding.webView.goBack()
    }
}
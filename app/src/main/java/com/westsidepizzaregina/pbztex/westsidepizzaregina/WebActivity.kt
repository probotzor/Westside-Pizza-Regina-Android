package com.westsidepizzaregina.pbztex.westsidepizzaregina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var mywebview: WebView? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        mywebview = findViewById<WebView>(R.id.webview)
        val webSettings = mywebview.getSettings()
        webSettings.setJavaScriptEnabled(true)
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                view.loadUrl(request.url.toString())
                return true
            }
        }
        mywebview!!.loadUrl("https://www.foodbooking.com/mobile/menu?company_uid=4ec22e51-91ba-4ae4-a526-c4c86d5cdcc3&restaurant_uid=40d3fce9-6c04-4a54-8702-275b9688700b")
    }
}

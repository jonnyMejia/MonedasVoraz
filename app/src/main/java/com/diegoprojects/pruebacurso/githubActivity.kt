package com.diegoprojects.pruebacurso

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class githubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)
        val webView = findViewById(R.id.idweb) as WebView
        webView.loadUrl("https://github.com/jonnyMejia/MonedasVoraz")
        webView.setWebViewClient(WebViewClient())
        val webSettings: WebSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true);
    }
}

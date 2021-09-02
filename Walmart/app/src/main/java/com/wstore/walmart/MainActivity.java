package com.wstore.walmart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = findViewById(R.id.webView);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setDisplayZoomControls(false);
        webview.setWebChromeClient(new WebChromeClient() {

        });
        webview.loadData("https://www.figma.com/proto/IqjkZRx6GRY0Uadbl8RUE0/walmart?node-id=22%3A35&scaling=scale-down&page-id=17%3A25&starting-point-node-id=22%3A2", "text/html", "utf-8");
    }
}
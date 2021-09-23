package com.example.pythonuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webview = (WebView)findViewById(R.id.webview);
        webview.loadUrl("http://192.168.219.111:5000/");
    }
}
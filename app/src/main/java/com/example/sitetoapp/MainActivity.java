package com.example.sitetoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    WebView web;

    String ur ="https://techgeekershack.blogspot.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        web = findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
       web.getSettings().setJavaScriptEnabled(true);


        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==btn){

            web.loadUrl(ur);
        }

    }
}
package com.example.a503_12.androidwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebApp1012 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app1012);
        WebView webview = (WebView)findViewById(R.id.webview);

        //리다이렉트가 있는 경우
        //크롬으로 가지 않고 현재 앱에서 이동하도록 설정
        webview.setWebViewClient(new WebViewClient());


        //자바 스크립트 사용 설정
        WebSettings set = webview.getSettings();
        set.setJavaScriptEnabled(true);

        //확대 축소 버튼을 추가
        set.setBuiltInZoomControls(true);


        webview.loadUrl("http://192.168.0.13:8080/mobileweb");
    }
}

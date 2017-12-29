package com.Dream11.Winning.tips;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by HP on 30-10-2017.
 */
public class MyWebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        WebView webView = (WebView)findViewById(R.id.web);
        setContentView(webView);
        webView.loadUrl("https://dream11winningtips2andpredictions.blogspot.in/p/todays-cricket-match-1.html");
    }

}
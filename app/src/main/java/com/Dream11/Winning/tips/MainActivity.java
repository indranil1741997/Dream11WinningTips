package com.Dream11.Winning.tips;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

// Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });
    }

    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    public void button1(View view) {
        Intent activityChangeIntent = new Intent(MainActivity.this,MyWebViewActivity.class);
        startActivity(activityChangeIntent);
    }

    public void button2(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/todays-cricket-match-2.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button3(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/todays-cricket-match-3.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button4(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/todays-cricket-match.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    public void button5(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/todays-cricket-match-5.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button6(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/todays-cricket-match-6.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button7(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/football-matches.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button8(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/football-match-2.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button9(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/football-match-3.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button10(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/kabaddi-matches.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button11(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/kabaddi-match-2.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void button12(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/kabaddi-match-3.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    public void support(View view){
        String url = "https://dream11winningtipsandpredictions.blogspot.in/p/support.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}

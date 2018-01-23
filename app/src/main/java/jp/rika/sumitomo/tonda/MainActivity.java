package jp.rika.sumitomo.tonda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.buttonL);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.buttonR);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button_back);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button_sa);
        button4.setOnClickListener(this);

        MobileAds.initialize(this, "pub-3276822368410513");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    @Override
    public void onClick(View v){

        switch (v.getId()) {
            case R.id.buttonL:
                Log.d("UI_PARTS", "大学へ行く高槻駅からタップ");
                Intent intent = new Intent(this,FromTktkActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonR:
                Log.d("UI_PARTS", "大学へ行く富田駅からタップ");
                Intent intent2 = new Intent(this,FromTndActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_back:
                Log.d("UI_PARTS", "大学から帰る高槻駅へタップ");
                Intent intent3 = new Intent(this,ToTktkActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_sa:
                Log.d("UI_PARTS", "大学から帰る富田駅へタップ");
                Intent intent4 = new Intent(this,ToTndActivity.class);
                startActivity(intent4);
                break;
        }


    }



}

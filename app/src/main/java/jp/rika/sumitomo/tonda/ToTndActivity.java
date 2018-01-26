package jp.rika.sumitomo.tonda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ToTndActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totnd);

        Button button1 = (Button) findViewById(R.id.buttonDoyoTTon);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.buttonNitiTTon);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.buttonHeiTTon);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonDoyoTTon:
                Log.d("UI_PARTS", "土曜ボタンタップ");
                setContentView(R.layout.activity_totnd_doyo);

                Button button1 = (Button) findViewById(R.id.buttonDoyoTTon);
                button1.setOnClickListener(this);

                Button button2 = (Button) findViewById(R.id.buttonNitiTTon);
                button2.setOnClickListener(this);

                Button button3 = (Button) findViewById(R.id.buttonHeiTTon);
                button3.setOnClickListener(this);
                break;


            case R.id.buttonNitiTTon:
                Log.d("UI_PARTS", "日曜ボタンタップ");
                setContentView(R.layout.activity_totnd_niti);
                Button button1_1 = (Button) findViewById(R.id.buttonDoyoTTon);
                button1_1.setOnClickListener(this);

                Button button1_2 = (Button) findViewById(R.id.buttonNitiTTon);
                button1_2.setOnClickListener(this);

                Button button1_3 = (Button) findViewById(R.id.buttonHeiTTon);
                button1_3.setOnClickListener(this);
                break;


            case R.id.buttonHeiTTon:
                Log.d("UI_PARTS", "平日ボタンタップ");
                setContentView(R.layout.activity_totnd);
                Button button2_1 = (Button) findViewById(R.id.buttonDoyoTTon);
                button2_1.setOnClickListener(this);

                Button button2_2 = (Button) findViewById(R.id.buttonNitiTTon);
                button2_2.setOnClickListener(this);

                Button button2_3 = (Button) findViewById(R.id.buttonHeiTTon);
                button2_3.setOnClickListener(this);

                break;
        }

    }
}

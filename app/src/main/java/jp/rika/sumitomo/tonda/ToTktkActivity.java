package jp.rika.sumitomo.tonda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ToTktkActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totktk);

        Button button1 = (Button) findViewById(R.id.buttonDoyoTTk);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.buttonNitiTTk);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.buttonHeiTTk);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonDoyoTTk:
                Log.d("UI_PARTS", "土曜ボタンタップ");
                setContentView(R.layout.activity_totktk_doyo);

                Button button1 = (Button) findViewById(R.id.buttonDoyoTTk);
                button1.setOnClickListener(this);

                Button button2 = (Button) findViewById(R.id.buttonNitiTTk);
                button2.setOnClickListener(this);

                Button button3 = (Button) findViewById(R.id.buttonHeiTTk);
                button3.setOnClickListener(this);
                break;


            case R.id.buttonNitiTTk:
                Log.d("UI_PARTS", "日曜ボタンタップ");
                setContentView(R.layout.activity_totktk_niti);
                Button button1_1 = (Button) findViewById(R.id.buttonDoyoTTk);
                button1_1.setOnClickListener(this);

                Button button1_2 = (Button) findViewById(R.id.buttonNitiTTk);
                button1_2.setOnClickListener(this);

                Button button1_3 = (Button) findViewById(R.id.buttonHeiTTk);
                button1_3.setOnClickListener(this);
                break;


            case R.id.buttonHeiTTk:
                Log.d("UI_PARTS", "平日ボタンタップ");
                setContentView(R.layout.activity_totktk);
                Button button2_1 = (Button) findViewById(R.id.buttonDoyoTTk);
                button2_1.setOnClickListener(this);

                Button button2_2 = (Button) findViewById(R.id.buttonNitiTTk);
                button2_2.setOnClickListener(this);

                Button button2_3 = (Button) findViewById(R.id.buttonHeiTTk);
                button2_3.setOnClickListener(this);

                break;
        }

    }


}

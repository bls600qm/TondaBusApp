package jp.rika.sumitomo.tonda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class FromTndActivity extends AppCompatActivity  implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fromtnd);

        Button button1 = (Button) findViewById(R.id.buttonDoyoFTon);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.buttonNitiFTon);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.buttonHeiFTon);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonDoyoFTon:
                Log.d("UI_PARTS", "土曜ボタンタップ");
                setContentView(R.layout.activity_fromtnd_doyo);

                Button button1 = (Button) findViewById(R.id.buttonDoyoFTon);
                button1.setOnClickListener(this);

                Button button2 = (Button) findViewById(R.id.buttonNitiFTon);
                button2.setOnClickListener(this);

                Button button3 = (Button) findViewById(R.id.buttonHeiFTon);
                button3.setOnClickListener(this);
                break;


            case R.id.buttonNitiFTon:
                Log.d("UI_PARTS", "日曜ボタンタップ");
                setContentView(R.layout.activity_fromtnd_niti);
                Button button1_1 = (Button) findViewById(R.id.buttonDoyoFTon);
                button1_1.setOnClickListener(this);

                Button button1_2 = (Button) findViewById(R.id.buttonNitiFTon);
                button1_2.setOnClickListener(this);

                Button button1_3 = (Button) findViewById(R.id.buttonHeiFTon);
                button1_3.setOnClickListener(this);
                break;


            case R.id.buttonHeiFTon:
                Log.d("UI_PARTS", "平日ボタンタップ");
                setContentView(R.layout.activity_fromtnd);
                Button button2_1 = (Button) findViewById(R.id.buttonDoyoFTon);
                button2_1.setOnClickListener(this);

                Button button2_2 = (Button) findViewById(R.id.buttonNitiFTon);
                button2_2.setOnClickListener(this);

                Button button2_3 = (Button) findViewById(R.id.buttonHeiFTon);
                button2_3.setOnClickListener(this);

                break;
        }
    }
}

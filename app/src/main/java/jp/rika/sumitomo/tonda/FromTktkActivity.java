package jp.rika.sumitomo.tonda;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FromTktkActivity extends AppCompatActivity implements View.OnClickListener{ //クリック処理つけるから



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fromtktk);

        Button button1 = (Button) findViewById(R.id.buttonDoyoFTk);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.buttonNitiFTk);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.buttonHeiFTk);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonDoyoFTk:
                Log.d("UI_PARTS", "土曜ボタンタップ");
                setContentView(R.layout.activity_fromtktk_doyo);

                Button button1 = (Button) findViewById(R.id.buttonDoyoFTk);
                button1.setOnClickListener(this);

                Button button2 = (Button) findViewById(R.id.buttonNitiFTk);
                button2.setOnClickListener(this);

                Button button3 = (Button) findViewById(R.id.buttonHeiFTk);
                button3.setOnClickListener(this);
                break;


            case R.id.buttonNitiFTk:
                Log.d("UI_PARTS", "日曜ボタンタップ");
                setContentView(R.layout.activity_fromtktk_niti);
                Button button1_1 = (Button) findViewById(R.id.buttonDoyoFTk);
                button1_1.setOnClickListener(this);

                Button button1_2 = (Button) findViewById(R.id.buttonNitiFTk);
                button1_2.setOnClickListener(this);

                Button button1_3 = (Button) findViewById(R.id.buttonHeiFTk);
                button1_3.setOnClickListener(this);
                break;


            case R.id.buttonHeiFTk:
                Log.d("UI_PARTS", "平日ボタンタップ");
                setContentView(R.layout.activity_fromtktk);
                Button button2_1 = (Button) findViewById(R.id.buttonDoyoFTk);
                button2_1.setOnClickListener(this);

                Button button2_2 = (Button) findViewById(R.id.buttonNitiFTk);
                button2_2.setOnClickListener(this);

                Button button2_3 = (Button) findViewById(R.id.buttonHeiFTk);
                button2_3.setOnClickListener(this);

                break;
        }

    }

}

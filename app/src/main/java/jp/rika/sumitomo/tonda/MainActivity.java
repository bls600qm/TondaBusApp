package jp.rika.sumitomo.tonda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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


    }
    @Override
    public void onClick(View v){

        switch (v.getId()) {
            case R.id.buttonL:
                Log.d("UI_PARTS", "From富田GOタップしました");
                Intent intent = new Intent(this,WeekdayActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonR:
                Log.d("UI_PARTS", "From高槻GOタップしました");
             //   Intent intent2 = new Intent(this,SaturdayActivity.class);
             //   startActivity(intent2);
                break;
            case R.id.button_back:
                Log.d("UI_PARTS", "BACKタップしました");
                //   Intent intent2 = new Intent(this,SaturdayActivity.class);
                //   startActivity(intent2);
                break;
            case R.id.button_sa:
                Log.d("UI_PARTS", "土日タップしました");
                //   Intent intent2 = new Intent(this,SaturdayActivity.class);
                //   startActivity(intent2);
                break;
        }


    }



}

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

        Button button1 = (Button) findViewById(R.id.button_go);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button_back);
        button2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        
        Log.d("UI_PARTS", "行くボタンをタップしました");
        Intent intent = new Intent(this,WeekdayActivity.class);
        startActivity(intent);
    }


}

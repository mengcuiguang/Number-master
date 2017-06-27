package com.meng.number_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv_main_num);
        NumAnimUtil.startAnim(tv, (float) 2000, 1000);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("0");

                int max = 3000;
                int min = 1000;
                random = new Random();
                int num = random.nextInt(max) % (max - min + 1) + min;

                NumAnimUtil.startAnim(tv, (float) num, 1000);  //设置滚动动画持续1秒
            }
        });
    }
}

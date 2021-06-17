package com.example.practice07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// Intent : Android에서 컴포넌트끼리 통신하기 위한 message system
// 주로 Activity간의 데이터 전송을 위해서 많이 사용.
// Intent는 다른 Activity를 호출하는 용도로 사용
// Intent를 사용하여 다른 Activity를 호출한 후 message를 전달
// 명시적 인텐트 : 인텐트에 호출할 컴포넌트(Activity)의 이름을 분명히 명시
// 암시적 인텐트 : 호출할 대상이 분명히 정해지지 않은것 (알아서 호출)

public class MainActivity extends AppCompatActivity {
    Button btnPractice1, btnPractice2;
    Intent intentPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPractice1 = (Button)findViewById(R.id.main_button1);
        btnPractice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Activity 호출 : 현재 Activity, 호출할 Activity(class file)
                intentPractice = new Intent(MainActivity.this, PracticeActivity1.class);
                startActivity(intentPractice); // Activity start
            }
        });
        btnPractice2 = (Button)findViewById(R.id.main_button2);
        btnPractice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPractice = new Intent(MainActivity.this, PracticeActivity2.class);
                startActivity(intentPractice);
            }
        });
    }
}
package com.example.practice07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class PracticeActivity1 extends AppCompatActivity {
    TextView txtDisplay;
    RadioButton rdoLeft, rdoCenter, rdoRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);
        setTitle("Practice1");

        txtDisplay = (TextView)findViewById(R.id.p1_textView);
        rdoLeft = (RadioButton)findViewById(R.id.p1_radioButton1);
        rdoCenter = (RadioButton)findViewById(R.id.p1_radioButton2);
        rdoRight = (RadioButton)findViewById(R.id.p1_radioButton3);
        rdoCenter.setChecked(true); // 가운데 기본 선택

        rdoLeft.setOnClickListener(new SettingGravityListener());
        rdoCenter.setOnClickListener(new SettingGravityListener());
        rdoRight.setOnClickListener(new SettingGravityListener());
    }

    //라디오버튼 리스너 클래스
    public class SettingGravityListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // v : 클릭한 라디오버튼 객체
            switch (v.getId()) {
                case R.id.p1_radioButton1:
                    txtDisplay.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
                    rdoCenter.setChecked(false);
                    rdoRight.setChecked(false);
                break;
                case R.id.p1_radioButton2:
                    txtDisplay.setGravity(Gravity.CENTER);
                    rdoLeft.setChecked(false);
                    rdoRight.setChecked(false);
                break;
                case R.id.p1_radioButton3:
                    rdoLeft.setChecked(false);
                    rdoCenter.setChecked(false);
                    txtDisplay.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
                break;
            }
        }
    }
}
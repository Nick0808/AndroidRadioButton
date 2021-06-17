package com.example.practice07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PracticeActivity2 extends AppCompatActivity {
    TextView txtDisplay;
    RadioGroup grpColor;
    // 그룹으로 묶을 경우 각각의 라디오버튼은 따로 정의하지 않음

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);
        setTitle("Practice2");

        txtDisplay = (TextView)findViewById(R.id.p2_textView);
        grpColor = (RadioGroup)findViewById(R.id.p2_radioGroup);
        grpColor.setOnCheckedChangeListener(new SettingColorListener());
    }

    // 라디오그룹내의 체크의 상태가 바뀔때 발생하는 이벤트
    // CheckedChangeListener 사용
    public class SettingColorListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            // group : 이벤트가 수행되는 그룹
            // checkedId : 그룹안에서 선택된 버튼의 ID
            if(group == grpColor) {
                //eventTest1(checkedId);
                //eventTest2();
                eventTest3();
            }
        }
    }

    public void eventTest1(int checkedId) {
        // 체크된 버튼에 따라 동작을 구현
        if(checkedId == R.id.p2_radioButton1)
            txtDisplay.setBackgroundColor(Color.RED);
        else if(checkedId == R.id.p2_radioButton2)
            txtDisplay.setBackgroundColor(Color.GREEN);
        else if(checkedId == R.id.p2_radioButton3)
            txtDisplay.setBackgroundColor(Color.BLUE);
    }

    public void eventTest2() {
        // 현재 체크된 라디오버튼의 정보를 직접 가져옴
        // getCheckedRadioButtonId() 체크된 라디오버튼의 정보를 얻어옴
        int id = grpColor.getCheckedRadioButtonId();
        if(id == R.id.p2_radioButton1)
            txtDisplay.setBackgroundColor(Color.RED);
        else if(id == R.id.p2_radioButton2)
            txtDisplay.setBackgroundColor(Color.GREEN);
        else if(id == R.id.p2_radioButton3)
            txtDisplay.setBackgroundColor(Color.BLUE);
    }

    public void eventTest3() {
        int id = grpColor.getCheckedRadioButtonId();
        // 라디오버튼 텍스트 정보에 접근
        // 임시로 라디오버튼 객체를 정의한 후
        // 선택된 라디오 버튼의 아이디를 할당
        RadioButton rdoSelect = (RadioButton)findViewById(id);
        txtDisplay.setText(rdoSelect.getText().toString());
    }
}
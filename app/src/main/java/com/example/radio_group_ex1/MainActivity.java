package com.example.radio_group_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout screen;
    Switch sw;
    RadioButton btn1;
    RadioButton btn2;
    RadioButton btn3;
    RadioButton btn4;
    Button check_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen1);
        sw = findViewById(R.id.switch1);

        btn1 = findViewById(R.id.radioButton);
        btn2 = findViewById(R.id.radioButton2);
        btn3 = findViewById(R.id.radioButton3);
        btn4 = findViewById(R.id.radioButton4);
        check_button = findViewById(R.id.button);


    }

    public void red(View view) {
        if (sw.isChecked()) {
            screen.setBackgroundColor(Color.RED);
        }
    }

    public void green(View view) {
        if (sw.isChecked()) {
            screen.setBackgroundColor(Color.GREEN);
        }
    }

    public void blue(View view) {
        if (sw.isChecked()) {
            screen.setBackgroundColor(Color.BLUE);
        }
    }

    public void yellow(View view) {
        if (sw.isChecked()) {
            screen.setBackgroundColor(Color.YELLOW);
        }
    }

    public void click(View view) {
        if (btn1.isChecked()) {
            screen.setBackgroundColor(Color.RED);
        }

        if (btn2.isChecked()) {
            screen.setBackgroundColor(Color.GREEN);
        }

        if (btn3.isChecked()) {
            screen.setBackgroundColor(Color.BLUE);
        }

        if (btn4.isChecked()) {
            screen.setBackgroundColor(Color.YELLOW);
        }
    }
}

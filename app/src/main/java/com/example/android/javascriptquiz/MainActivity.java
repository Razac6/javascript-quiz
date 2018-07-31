package com.example.android.javascriptquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    RadioGroup radioGroup;

    public static final String Q1 = "Question 1";
    public static final String Q2 = "Question 2";
    public static final String Q3 = "Question 3";

    public void checkAnswer(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioButton question1Answer1 = (RadioButton) findViewById(R.id.question1Answer1);
        RadioButton question1Answer2 = (RadioButton) findViewById(R.id.question1Answer2);
        RadioButton question1Answer3 = (RadioButton) findViewById(R.id.question1Answer3);

        String success = "Yea success! :)";
        String Wrong = "Wrong answer ";

        boolean question1Answer1Checked = question1Answer1.isChecked();
        boolean question1Answer2Checked = question1Answer2.isChecked();
        boolean question1Answer3Checked = question1Answer3.isChecked();

        if (!question1Answer1Checked) {
            toaster(Wrong + Q1);
        }
        if (!question1Answer2Checked) {
            toaster(Wrong + Q2);
        }
        if (!question1Answer3Checked) {
            toaster(Wrong + Q3);
        } else if (question1Answer1Checked && question1Answer2Checked && question1Answer3Checked) {
            toaster(success);
        }
    }

    public void toaster(String question) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, question, duration);
        toast.show();
    }

}

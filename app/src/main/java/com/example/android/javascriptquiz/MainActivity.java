package com.example.android.javascriptquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
    public Integer score = 0;

    public void checkAnswer(View view) {
        EditText textInput = (EditText) findViewById(R.id.plain_text_input);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton question2Answer1 = (RadioButton) findViewById(R.id.question1Answer1);
        CheckBox checkbox1Answer1 = (CheckBox) findViewById(R.id.chkIos);
        CheckBox checkbox2Answer2 = (CheckBox) findViewById(R.id.chkIos2);
        CheckBox checkbox3Answer3 = (CheckBox) findViewById(R.id.chkIos3);

        if (textInput.getText().toString().equals("2")) {
            setPoint(1);
        }

        if (question2Answer1.isChecked()) {
            setPoint(1);
        }

        if (checkbox1Answer1.isChecked() && !checkbox2Answer2.isChecked() && !checkbox3Answer3.isChecked()) {
            setPoint(1);
        }
        toaster("Your score: " + score.toString());
    }

    public Integer setPoint(Integer point) {
        return score = score + point;
    }

    public Integer resetScore() {
        return score = 0;
    }

    public void toaster(String result) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, result, duration);
        toast.show();
        resetScore();
    }

}

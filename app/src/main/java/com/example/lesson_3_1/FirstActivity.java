package com.example.lesson_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewLastname;
    TextView textViewAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViews();
        setTextToTextView();
    }

    private void findViews() {
        textViewName = findViewById(R.id.text_view_name);
        textViewLastname = findViewById(R.id.text_view_lastname);
        textViewAge = findViewById(R.id.text_view_age);
    }

    private void setTextToTextView() {
        String name = getIntent().getStringExtra("name");
        String lastname = getIntent().getStringExtra("lastname");
        Integer age = getIntent().getIntExtra("age", 10);
        textViewName.setText(name);
        textViewLastname.setText(lastname);
        textViewAge.setText(age.toString());
    }
}
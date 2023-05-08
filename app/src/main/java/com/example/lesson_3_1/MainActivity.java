package com.example.lesson_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextLastname;
    EditText editTextAge;
    Button button;

    String name;
    String lastname;
    Integer age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClick();
    }

    private void findViews() {
        editTextName = findViewById(R.id.edit_text_name);
        editTextLastname = findViewById(R.id.edit_text_lastname);
        editTextAge = findViewById(R.id.edit_text_age);
        button = findViewById(R.id.btn_to_first_activity);
    }

    private void setClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initEditText();
                navigationToFirstActivity();
            }
        });
    }

    private void initEditText() {
        name = editTextName.getText().toString();
        lastname = editTextLastname.getText().toString();
        age = Integer.valueOf(editTextAge.getText().toString());

    }

    private void navigationToFirstActivity() {
    Intent intent = new Intent(MainActivity.this, FirstActivity.class);
    intent.putExtra("name", name);
    intent.putExtra("lastname", lastname);
    intent.putExtra("age", age);

    startActivity(intent);
    }
}
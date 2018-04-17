package com.example.keyboardwithemoji;

import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private EditText edit_text;
    private FrameLayout keyboard_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text = findViewById(R.id.et);
        keyboard_parent = findViewById(R.id.keyboard_parent);
        initData();
    }

    private void initData() {
        edit_text.setInputType(InputType.TYPE_NULL);
        edit_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CustomKeyboardUtil(MainActivity.this,keyboard_parent).showNumKeyboard();
            }
        });
    }
}

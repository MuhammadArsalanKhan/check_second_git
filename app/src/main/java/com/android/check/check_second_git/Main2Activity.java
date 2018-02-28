package com.android.check.check_second_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void khan(){
        Toast.makeText(this, "hello khan", Toast.LENGTH_SHORT).show();
    }
}

package com.agesa.agesa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar tool;
    EditText edit;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tool=findViewById(R.id.toolbar);
        edit=findViewById(R.id.edt_1);
        text=findViewById(R.id.head_1);

       String name= edit.getText().toString();
        text.setText(name);


    }

}

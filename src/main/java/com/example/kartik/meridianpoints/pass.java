package com.example.kartik.meridianpoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pass extends AppCompatActivity {
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        e1=(EditText)findViewById(R.id.editText2);
       // String 11e1.getText()
    }
    public void vv(View view)
    {

        String ee=e1.getText().toString();
        if(ee.equals("4163"))

        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}

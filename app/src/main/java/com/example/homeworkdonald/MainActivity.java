package com.example.homeworkdonald;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText Password;
    public EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void MyFirstButton(View view){

        EditText Password = (EditText)  findViewById(R.id.passwordMy);

        EditText name = (EditText) findViewById(R.id.myEdit);

        Toast.makeText(this,   " the username is " + name.getText().toString() + " and the password is " + Password.getText().toString() , Toast.LENGTH_SHORT).show();
    }
}

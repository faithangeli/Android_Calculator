package com.example.mcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, buttton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttoncalc);
        buttton = (Button) findViewById(R.id.buttontodo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculator();
            }
        });
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTodoList();
            }
        });
    }
    public void openCalculator(){
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public  void openTodoList(){
        Intent intent = new Intent(this, TodoList.class);
        startActivity(intent);
    }
}
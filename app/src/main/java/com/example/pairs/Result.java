package com.example.pairs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle arguments = getIntent().getExtras();
        int steps=0;
        int board=0;
        if (arguments != null) {
            steps = arguments.getInt("steps");
            board = arguments.getInt("board");
        }
        if (board>0){
            board++;
        }
        TextView tA4 = findViewById(R.id.textView4);
        tA4.setText(String.valueOf(steps));
        TextView tA5 = findViewById(R.id.textView6);
        tA5.setText(String.valueOf(board));
    }

    public void NewGame(View view) {

        int steps = 0;
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("steps",steps);
        startActivity(intent);
    }
}
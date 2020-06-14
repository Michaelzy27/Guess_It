package com.michael.guessit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int number = random.nextInt(20) + 1;

    public void Guess(View view) {
        EditText editText1 = findViewById(R.id.editText1);
        String input = editText1.getText().toString();
        int input2= Integer.parseInt(input);
        if (input2<number){
            Toast.makeText(this, "Guess higher", Toast.LENGTH_SHORT).show();
        }else if (input2>number){
            Toast.makeText(this, "Guess lower", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "You got it. Try again", Toast.LENGTH_SHORT).show();
            number = random.nextInt(20) + 1;
        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

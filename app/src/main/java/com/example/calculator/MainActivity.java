package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView calcView = findViewById(R.id.calcView);

        /*
            Equals Button
         */
        Button buttonEql = findViewById(R.id.buttonEqu);
        buttonEql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // action for Divide
            }
        });

        /*
            All Clear Button
         */
        Button buttonAC = findViewById(R.id.buttonAllClear);
        buttonAC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // action for All Clear
            }
        });

        /*
            Clear Button
         */
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calcView.setText("");
            }
        });

        /*
            Left Parentheses Button
         */
        Button buttonLParen = findViewById(R.id.buttonLParen);
        buttonLParen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("(");
            }
        });

        /*
            Right Parentheses Button
         */
        Button buttonRParen = findViewById(R.id.buttonRParen);
        buttonRParen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append(")");
            }
        });

        /*
            Divide Button
         */
        Button buttonDiv = findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("/");
            }
        });

        /*
            Multiply Button
         */
        Button buttonMult = findViewById(R.id.buttonMult);
        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("*");
            }
        });

        /*
            Addition Button
         */
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("+");
            }
        });

        /*
            Subtraction Button
         */
        Button buttonSub = findViewById(R.id.buttonSub);
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("-");
            }
        });

        /*
            7 Digit Button
         */
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("7");
            }
        });

        /*
            8 Digit Button
         */
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("8");
            }
        });

        /*
            9 Digit Button
         */
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("9");
            }
        });

        /*
            4 Digit Button
         */
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("4");
            }
        });

        /*
            5 Digit Button
         */
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("5");
            }
        });

        /*
            6 Digit Button
         */
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("6");
            }
        });

        /*
            1 Digit Button
         */
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("1");
            }
        });

        /*
            2 Digit Button
         */
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("2");
            }
        });

        /*
            3 Digit Button
         */
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("3");
            }
        });

        /*
            0 Digit Button
         */
        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calcView.append("0");
            }
        });
    }
}
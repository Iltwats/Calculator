package com.atul.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.atul.calculator.databinding.ActivityMainBinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        b.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button.getText());
            }
        });

        b.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button2.getText());
            }
        });

        b.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button3.getText());
            }
        });

        b.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button4.getText());
            }
        });

        b.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button5.getText());
            }
        });

        b.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button6.getText());
            }
        });

        b.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button7.getText());
            }
        });

        b.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button8.getText());
            }
        });

        b.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button9.getText());
            }
        });

        b.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button10.getText());
            }
        });
        b.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button11.getText());
            }
        });

        b.button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button12.getText());
            }
        });

        b.button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button13.getText());
            }
        });

        b.button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button14.getText());
            }
        });

        // Calculation part Using Script Engine
        b.button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("js");
                String text = b.editTextTextPersonName.getText().toString().trim();

                if (scriptEngine == null) {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }else{
                    try {
                        Double result = (Double) scriptEngine.eval(text + "");
                        b.editTextTextPersonName.setText(String.valueOf(result));
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }}

            }
        });
        b.button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText(b.editTextTextPersonName.getText().toString().trim() + b.button16.getText());
            }
        });

        b.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.editTextTextPersonName.setText("");
            }
        });
    }


}
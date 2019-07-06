package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mode;
    private Button calc;
    private TextView res;
    private EditText field1;
    private EditText field2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mode=findViewById(R.id.mode);
        calc=findViewById(R.id.calc);
        res=findViewById(R.id.result_tv);
        field1=findViewById(R.id.field1_et);
        field2=findViewById(R.id.field2_et);
    }


    public void modeChange(View view){
        String operand=mode.getText().toString();
        if(operand.equals("+")){
            mode.setText("-");
        }else if(operand.equals("-")){
            mode.setText("*");
        }else if(operand.equals("*")){
            mode.setText("/");
        }else
            mode.setText("+");
    }
    public void calculate(View view){
        String val1=field1.getText().toString();
        String operand=mode.getText().toString();
        String val2=field2.getText().toString();
        if(val1.equals("") || val2.equals("")){
            Toast.makeText(this, "Plese enter both values", Toast.LENGTH_SHORT).show();
        }else{
            if(operand.equals("+")){
                res.setText( String.valueOf(Integer.parseInt(val1) + Integer.parseInt(val2)) );
            }else if(operand.equals("-")){
                res.setText( String.valueOf(Integer.parseInt(val1) - Integer.parseInt(val2)) );
            }else if(operand.equals("*")){
                res.setText( String.valueOf(Integer.parseInt(val1) * Integer.parseInt(val2)) );
            }else{
                if(val2.equals("0")){
                    Toast.makeText(this, "Field 2 can not be zero for division!", Toast.LENGTH_SHORT).show();
                }else{
                    res.setText( String.valueOf(Integer.parseInt(val1) / Integer.parseInt(val2)) );
                }
            }
        }
    }
}



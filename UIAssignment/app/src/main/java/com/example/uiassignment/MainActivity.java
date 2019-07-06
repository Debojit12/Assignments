package com.example.uiassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    ImageButton i;
    Switch s;
    ImageView img;
    RadioButton r1,r2;
    RadioGroup rg;
    CheckBox c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        i=findViewById(R.id.imgButton);
        s=findViewById(R.id.switch1);
        img=findViewById(R.id.imageView);
        r1=findViewById(R.id.radioButton2);
        r2=findViewById(R.id.radioButton3);
        rg=findViewById(R.id.radioGroup);
        c=findViewById(R.id.checkBox);
    }

    public void imgBtnClick(View v){
        t1=findViewById(R.id.text1);
        if(t1.getVisibility()==View.VISIBLE)
            t1.setVisibility(View.INVISIBLE);
        else
            t1.setVisibility(View.VISIBLE);
    }

    public void switchClick(View v){
        if(s.isChecked())
            img.setVisibility(View.VISIBLE);
        else
            img.setVisibility(View.INVISIBLE);
    }

    public void radioClick(View v){
        int radio = rg.getCheckedRadioButtonId();
        if(radio==R.id.radioButton2)
            s.setClickable(false);
        else
            s.setClickable(true);
    }

    public void checkboxClick(View v){
        if(!c.isChecked())
        {
            i.setVisibility(View.INVISIBLE);
            i.setClickable(false);
        }
        else
        {
            i.setClickable(true);
            i.setVisibility(View.VISIBLE);
        }
    }

    public void btnClick(View v)
    {
        t1.setVisibility(View.VISIBLE);
        s.setChecked(true);
        img.setVisibility(View.VISIBLE);
        r1.setChecked(false);
        r2.setChecked(true);
        s.setClickable(true);
        c.setChecked(true);
        i.setVisibility(View.VISIBLE);
        i.setClickable(true);
    }
}

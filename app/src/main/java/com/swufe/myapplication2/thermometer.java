package com.swufe.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class thermometer extends AppCompatActivity implements View.OnClickListener {
TextView temperature;
EditText imp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        temperature=(TextView) findViewById(R.id.temprature);
        imp=(EditText) findViewById(R.id.editText2);
        Button btnTransform=(Button)findViewById(R.id.btnTransformation);
        btnTransform.setOnClickListener(this);
    }
    public void btnTransformation(){
        String centigrade1= imp.getText().toString();
        double centigrade=Double.parseDouble(centigrade1);
        showTemperature(centigrade);
    }
    private void showTemperature(double tmp){
        double fahrenheitDegree =tmp*1.8+32;
    }


    @Override
    public void onClick(View v) {

        btnTransformation();
    }
}

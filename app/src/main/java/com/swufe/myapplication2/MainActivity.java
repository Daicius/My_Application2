package com.swufe.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnAdd1=(Button)findViewById(R.id.btnTransformation);
        Button btnAdd2=(Button)findViewById(R.id.btnTransformation);
        Button btnAdd3=(Button)findViewById(R.id.btnTransformation);
        Button btnReset=(Button)findViewById(R.id.btnTransformation);
        super.onCreate(savedInstanceState);
       btnAdd1.setOnClickListener(this);
        btnAdd2.setOnClickListener(this);
        btnAdd3.setOnClickListener(this);
        btnReset.setOnClickListener(this);
       score = (TextView) findViewById(R.id.score);

    }
public void btnAdd1(View btn){
    showscore(1);
    }
    public void btnAdd2(View btn){
    showscore(2);
    }
    public void btnAdd3(View btn){
    showscore(3);
    }
    public void btnReset(View btn){
    score.setText(""+0);
    }
private  void showscore(int sco){
        String oldScore=(String) score.getText();
        int newScore=Integer.parseInt(oldScore)+sco;
        score.setText(""+newScore);
}


    @Override
    public void onClick(View v) {
        Log.i("click","click...");

    }
}

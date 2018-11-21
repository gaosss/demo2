package com.example.robbin.demo;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Application app = (Application) getApplication();
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("gogogo3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("gogogo2");
    }

    @Override
    public void onClick(View view) {
        System.out.println("gogogo4");

        //gogogog

        if(view.getId()==R.id.button)
        {

            System.out.println("gogogo");
            this.finish();

        }
    }
}

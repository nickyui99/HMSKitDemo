package com.nicholas.hmskitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAccountKit, btnPushKit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        btnAccountKit = findViewById(R.id.buttonHomeAccountKit);
        btnAccountKit.setOnClickListener(this);
        btnPushKit = findViewById(R.id.buttonHomePushKit);
        btnPushKit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonHomeAccountKit:
                Intent accKitActivityIntent = new Intent(getApplicationContext(), AccountKitActivity.class);
                startActivity(accKitActivityIntent);
                break;
            case R.id.buttonHomePushKit:
                Intent pushKitActivityIntent  = new Intent(getApplicationContext(), PushKitActivity.class);
                startActivity(pushKitActivityIntent);
                break;
            default:
                break;
        }
    }
}
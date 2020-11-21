package com.google.firebase.canteenapp;
import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mRunnable;
    

    @Override
    protected void  onCreate( Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,MainActivity.class));

    }

}

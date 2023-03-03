package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MyActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Create");
    }
    @Override
    protected void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Resume activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Resume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Pause activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Pause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Stop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Restart activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Restart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Destroy activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info,message,duration);
        toast.show();
        Log.d(TAG,"Destroy");
    }
}
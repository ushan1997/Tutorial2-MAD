package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtview= findViewById(R.id.textView2);
        txtview.setText(R.string.Msg2);

        Log.i("Lifecycle",  "Oncreate called");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle" ,"Onstarted called" );
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle" , "Onresume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle" , "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle" , "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle" , "onDestroy called");
    }


}
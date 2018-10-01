package com.mizusaki.yuu;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITB", "onCreate has executed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB", "onStart has executed.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB", "onResume has executed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB", "onPause has executed.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB", "onStop has executed.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITB", "onDestroy has executed.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITB", "onRestart has executed.");
    }

    public void showMessage1(View view){
        Toast.makeText(this, "Go to the previous page.", Toast.LENGTH_LONG).show();
    }

    public void showMessage2(View view){
        Snackbar.make(view, "Go to the next page.", Snackbar.LENGTH_LONG).show();
    }
}
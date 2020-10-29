package com.example.projectakhirlagi;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TodayActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView move_minute_today, steps_today, calories_today, distances_today;

    public static final String mypreferences = "mypref";
    public static final String Move_minute_today = "move_minute_today";
    public static final String Steps_today = "steps_today";
    public static final String Calories_today = "calories_today";
    public static final String Distances_today = "distances_today";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        move_minute_today = (TextView) findViewById(R.id.edt_move_minute_today);
        steps_today = (TextView) findViewById(R.id.edt_steps_today);
        calories_today = (TextView) findViewById(R.id.edt_calories_today);
        distances_today = (TextView) findViewById(R.id.edt_distances_today);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Move_minute_today)){
            move_minute_today.setText(sharedPreferences.getString(Move_minute_today, ""));
        }
        if(sharedPreferences.contains(Steps_today)){
            steps_today.setText(sharedPreferences.getString(Steps_today, ""));
        }
        if(sharedPreferences.contains(Calories_today)) {
            calories_today.setText(sharedPreferences.getString(Calories_today, ""));
        }
        if(sharedPreferences.contains(Distances_today)) {
            distances_today.setText(sharedPreferences.getString(Distances_today, ""));
        }
    }

    public void Save(View view) {
        String m = move_minute_today.getText().toString();
        String s = steps_today.getText().toString();
        String c = calories_today.getText().toString();
        String d = distances_today.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Move_minute_today, m);
        editor.putString(Steps_today, s);
        editor.putString(Calories_today, c);
        editor.putString(Distances_today, d);
        editor.commit();
    }

    public void Clear(View view) {
        move_minute_today = (TextView) findViewById(R.id.edt_move_minute_today);
        steps_today = (TextView) findViewById(R.id.edt_steps_today);
        calories_today = (TextView) findViewById(R.id.edt_calories_today);
        distances_today = (TextView) findViewById(R.id.edt_distances_today);
        move_minute_today.setText("");
        steps_today.setText("");
        calories_today.setText("");
        distances_today.setText("");
    }

    public void Get(View view) {
        move_minute_today = (TextView) findViewById(R.id.edt_move_minute_today);
        steps_today = (TextView) findViewById(R.id.edt_steps_today);
        calories_today = (TextView) findViewById(R.id.edt_calories_today);
        distances_today = (TextView) findViewById(R.id.edt_distances_today);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Move_minute_today)){
            move_minute_today.setText(sharedPreferences.getString(Move_minute_today, ""));
        }
        if(sharedPreferences.contains(Steps_today)){
            steps_today.setText(sharedPreferences.getString(Steps_today, ""));
        }
        if(sharedPreferences.contains(Calories_today)) {
            calories_today.setText(sharedPreferences.getString(Calories_today, ""));
        }
        if(sharedPreferences.contains(Distances_today)) {
            distances_today.setText(sharedPreferences.getString(Distances_today, ""));
        }
    }
}
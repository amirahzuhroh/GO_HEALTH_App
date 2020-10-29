package com.example.projectakhirlagi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView move_minute_target, steps_target, calories_target, distances_target;

    public static final String mypreferences = "mypref";
    public static final String Move_minute_target = "move_minute_target";
    public static final String Steps_target = "steps_target";
    public static final String Calories_target = "calories_target";
    public static final String Distances_target = "distances_taret";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        move_minute_target = (TextView) findViewById(R.id.edt_move_minute_target);
        steps_target = (TextView) findViewById(R.id.edt_steps_target);
        calories_target = (TextView) findViewById(R.id.edt_calories_target);
        distances_target = (TextView) findViewById(R.id.edt_distances_target);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Move_minute_target)){
            move_minute_target.setText(sharedPreferences.getString(Move_minute_target, ""));
        }
        if(sharedPreferences.contains(Steps_target)){
            steps_target.setText(sharedPreferences.getString(Steps_target, ""));
        }
        if(sharedPreferences.contains(Calories_target)) {
            calories_target.setText(sharedPreferences.getString(Calories_target, ""));
        }
        if(sharedPreferences.contains(Distances_target)) {
            distances_target.setText(sharedPreferences.getString(Distances_target, ""));
        }
    }

    public void Save(View view) {
        String m = move_minute_target.getText().toString();
        String s = steps_target.getText().toString();
        String c = calories_target.getText().toString();
        String d = distances_target.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Move_minute_target, m);
        editor.putString(Steps_target, s);
        editor.putString(Calories_target, c);
        editor.putString(Distances_target, d);
        editor.commit();
    }

    public void Clear(View view) {
        move_minute_target = (TextView) findViewById(R.id.edt_move_minute_target);
        steps_target = (TextView) findViewById(R.id.edt_steps_target);
        calories_target = (TextView) findViewById(R.id.edt_calories_target);
        distances_target = (TextView) findViewById(R.id.edt_distances_target);
        move_minute_target.setText("");
        steps_target.setText("");
        calories_target.setText("");
        distances_target.setText("");
    }

    public void Get(View view) {
        move_minute_target = (TextView) findViewById(R.id.edt_move_minute_target);
        steps_target = (TextView) findViewById(R.id.edt_steps_target);
        calories_target = (TextView) findViewById(R.id.edt_calories_target);
        distances_target = (TextView) findViewById(R.id.edt_distances_target);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Move_minute_target)){
            move_minute_target.setText(sharedPreferences.getString(Move_minute_target, ""));
        }
        if(sharedPreferences.contains(Steps_target)){
            steps_target.setText(sharedPreferences.getString(Steps_target, ""));
        }
        if(sharedPreferences.contains(Calories_target)) {
            calories_target.setText(sharedPreferences.getString(Calories_target, ""));
        }
        if(sharedPreferences.contains(Distances_target)) {
            distances_target.setText(sharedPreferences.getString(Distances_target, ""));
        }
    }
}
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

public class ActActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView moTime, moMin, moKil, moStep, moCal;
    TextView lunTime, lunMin, lunKil, lunStep, lunCal;
    TextView afTime, afMin, afKil, afStep, afCal;

    public static final String mypreferences = "mypref";
    public static final String Morning_time = "moTime";
    public static final String Morning_minute = "moMin";
    public static final String Morning_kilometers = "moKil";
    public static final String Morning_steps = "moStep";
    public static final String Morning_calories = "moCal";

    public static final String Lunch_time = "lunTime";
    public static final String Lunch_minute = "lunMin";
    public static final String Lunch_kilometers = "lunKil";
    public static final String Lunch_steps = "lunStep";
    public static final String Lunch_calories = "lunCal";

    public static final String Afternoon_time = "afTime";
    public static final String Afternoon_minute = "afMin";
    public static final String Afternoon_kilometers = "afKil";
    public static final String Afternoon_steps = "afStep";
    public static final String Afternoon_calories = "afCal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);

        moTime = (TextView) findViewById(R.id.txtMoTime);
        moMin = (TextView) findViewById(R.id.txtMoMin);
        moKil = (TextView) findViewById(R.id.txtMoKil);
        moStep = (TextView) findViewById(R.id.txtMoStep);
        moCal = (TextView) findViewById(R.id.txtMoCal);

        lunTime = (TextView) findViewById(R.id.txtLunTime);
        lunMin = (TextView) findViewById(R.id.txtLunMin);
        lunKil = (TextView) findViewById(R.id.txtLunKil);
        lunStep = (TextView) findViewById(R.id.txtLunStep);
        lunCal = (TextView) findViewById(R.id.txtLunCal);

        afTime = (TextView) findViewById(R.id.txtAfTime);
        afMin = (TextView) findViewById(R.id.txtAfMin);
        afKil = (TextView) findViewById(R.id.txtAfKil);
        afStep = (TextView) findViewById(R.id.txtAfStep);
        afCal = (TextView) findViewById(R.id.txtAfCal);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Morning_time)){
            moTime.setText(sharedPreferences.getString(Morning_time, ""));
        }
        if(sharedPreferences.contains(Morning_minute)){
            moMin.setText(sharedPreferences.getString(Morning_minute, ""));
        }
        if(sharedPreferences.contains(Morning_kilometers)){
            moKil.setText(sharedPreferences.getString(Morning_kilometers, ""));
        }
        if(sharedPreferences.contains(Morning_steps)){
            moStep.setText(sharedPreferences.getString(Morning_steps, ""));
        }
        if(sharedPreferences.contains(Morning_calories)){
            moCal.setText(sharedPreferences.getString(Morning_calories, ""));
        }

        if(sharedPreferences.contains(Lunch_time)){
            lunTime.setText(sharedPreferences.getString(Lunch_time, ""));
        }
        if(sharedPreferences.contains(Lunch_minute)){
            lunMin.setText(sharedPreferences.getString(Lunch_minute, ""));
        }
        if(sharedPreferences.contains(Lunch_kilometers)){
            lunKil.setText(sharedPreferences.getString(Lunch_kilometers, ""));
        }
        if(sharedPreferences.contains(Lunch_steps)){
            lunStep.setText(sharedPreferences.getString(Lunch_steps, ""));
        }
        if(sharedPreferences.contains(Lunch_calories)){
            lunCal.setText(sharedPreferences.getString(Lunch_calories, ""));
        }

        if(sharedPreferences.contains(Afternoon_time)){
            afTime.setText(sharedPreferences.getString(Afternoon_time, ""));
        }
        if(sharedPreferences.contains(Afternoon_minute)){
            afMin.setText(sharedPreferences.getString(Afternoon_minute, ""));
        }
        if(sharedPreferences.contains(Afternoon_kilometers)){
            afKil.setText(sharedPreferences.getString(Afternoon_kilometers, ""));
        }
        if(sharedPreferences.contains(Afternoon_steps)){
            afStep.setText(sharedPreferences.getString(Afternoon_steps, ""));
        }
        if(sharedPreferences.contains(Afternoon_calories)){
            afCal.setText(sharedPreferences.getString(Afternoon_calories, ""));
        }
    }

    public void Save (View view) {
        String mt = moTime.getText().toString();
        String mm = moMin.getText().toString();
        String mk = moKil.getText().toString();
        String ms = moStep.getText().toString();
        String mc = moCal.getText().toString();

        String lt = lunTime.getText().toString();
        String lm = lunMin.getText().toString();
        String lk = lunKil.getText().toString();
        String ls = lunStep.getText().toString();
        String lc = lunCal.getText().toString();

        String at = afTime.getText().toString();
        String am = afMin.getText().toString();
        String ak = afKil.getText().toString();
        String as = afStep.getText().toString();
        String ac = afCal.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Morning_time, mt);
        editor.putString(Morning_minute, mm);
        editor.putString(Morning_kilometers, mk);
        editor.putString(Morning_steps, ms);
        editor.putString(Morning_calories, mc);

        editor.putString(Lunch_time, lt);
        editor.putString(Lunch_minute, lm);
        editor.putString(Lunch_kilometers, lk);
        editor.putString(Lunch_steps, ls);
        editor.putString(Lunch_calories, lc);

        editor.putString(Afternoon_time, at);
        editor.putString(Afternoon_minute, am);
        editor.putString(Afternoon_kilometers, ak);
        editor.putString(Afternoon_steps, as);
        editor.putString(Afternoon_calories, ac);
        editor.commit();
    }

    public void Clear (View view) {
        moTime = (TextView) findViewById(R.id.txtMoTime);
        moMin = (TextView) findViewById(R.id.txtMoMin);
        moKil = (TextView) findViewById(R.id.txtMoKil);
        moStep = (TextView) findViewById(R.id.txtMoStep);
        moCal = (TextView) findViewById(R.id.txtMoCal);
        moTime.setText("");
        moMin.setText("");
        moKil.setText("");
        moStep.setText("");
        moCal.setText("");

        lunTime = (TextView) findViewById(R.id.txtLunTime);
        lunMin = (TextView) findViewById(R.id.txtLunMin);
        lunKil = (TextView) findViewById(R.id.txtLunKil);
        lunStep = (TextView) findViewById(R.id.txtLunStep);
        lunCal = (TextView) findViewById(R.id.txtLunCal);
        lunTime.setText("");
        lunMin.setText("");
        lunKil.setText("");
        lunStep.setText("");
        lunCal.setText("");

        afTime = (TextView) findViewById(R.id.txtAfTime);
        afMin = (TextView) findViewById(R.id.txtAfMin);
        afKil = (TextView) findViewById(R.id.txtAfKil);
        afStep = (TextView) findViewById(R.id.txtAfStep);
        afCal = (TextView) findViewById(R.id.txtAfCal);
        afTime.setText("");
        afMin.setText("");
        afKil.setText("");
        afStep.setText("");
        afCal.setText("");
    }

    public void Get (View view) {
        moTime = (TextView) findViewById(R.id.txtMoTime);
        moMin = (TextView) findViewById(R.id.txtMoMin);
        moKil = (TextView) findViewById(R.id.txtMoKil);
        moStep = (TextView) findViewById(R.id.txtMoStep);
        moCal = (TextView) findViewById(R.id.txtMoCal);

        lunTime = (TextView) findViewById(R.id.txtLunTime);
        lunMin = (TextView) findViewById(R.id.txtLunMin);
        lunKil = (TextView) findViewById(R.id.txtLunKil);
        lunStep = (TextView) findViewById(R.id.txtLunStep);
        lunCal = (TextView) findViewById(R.id.txtLunCal);

        afTime = (TextView) findViewById(R.id.txtAfTime);
        afMin = (TextView) findViewById(R.id.txtAfMin);
        afKil = (TextView) findViewById(R.id.txtAfKil);
        afStep = (TextView) findViewById(R.id.txtAfStep);
        afCal = (TextView) findViewById(R.id.txtAfCal);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Morning_time)){
            moTime.setText(sharedPreferences.getString(Morning_time, ""));
        }
        if(sharedPreferences.contains(Morning_minute)){
            moMin.setText(sharedPreferences.getString(Morning_minute, ""));
        }
        if(sharedPreferences.contains(Morning_kilometers)){
            moKil.setText(sharedPreferences.getString(Morning_kilometers, ""));
        }
        if(sharedPreferences.contains(Morning_steps)){
            moStep.setText(sharedPreferences.getString(Morning_steps, ""));
        }
        if(sharedPreferences.contains(Morning_calories)){
            moCal.setText(sharedPreferences.getString(Morning_calories, ""));
        }

        if(sharedPreferences.contains(Lunch_time)){
            lunTime.setText(sharedPreferences.getString(Lunch_time, ""));
        }
        if(sharedPreferences.contains(Lunch_minute)){
            lunMin.setText(sharedPreferences.getString(Lunch_minute, ""));
        }
        if(sharedPreferences.contains(Lunch_kilometers)){
            lunKil.setText(sharedPreferences.getString(Lunch_kilometers, ""));
        }
        if(sharedPreferences.contains(Lunch_steps)){
            lunStep.setText(sharedPreferences.getString(Lunch_steps, ""));
        }
        if(sharedPreferences.contains(Lunch_calories)){
            lunCal.setText(sharedPreferences.getString(Lunch_calories, ""));
        }

        if(sharedPreferences.contains(Afternoon_time)){
            afTime.setText(sharedPreferences.getString(Afternoon_time, ""));
        }
        if(sharedPreferences.contains(Afternoon_minute)){
            afMin.setText(sharedPreferences.getString(Afternoon_minute, ""));
        }
        if(sharedPreferences.contains(Afternoon_kilometers)){
            afKil.setText(sharedPreferences.getString(Afternoon_kilometers, ""));
        }
        if(sharedPreferences.contains(Afternoon_steps)){
            afStep.setText(sharedPreferences.getString(Afternoon_steps, ""));
        }
        if(sharedPreferences.contains(Afternoon_calories)){
            afCal.setText(sharedPreferences.getString(Afternoon_calories, ""));
        }

    }
}
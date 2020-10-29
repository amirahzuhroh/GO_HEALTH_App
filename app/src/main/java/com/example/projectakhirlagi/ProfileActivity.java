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

public class ProfileActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView weight_profile, height_profile, bmi_profile;

    public static final String mypreferences = "mypref";
    public static final String WeightProfile = "weight_profile";
    public static final String HeightProfile = "height_profile";
    public static final String BMIProfile = "bmi_profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        weight_profile = (TextView) findViewById(R.id.edt_weight_profile);
        height_profile = (TextView) findViewById(R.id.edt_height_profile);
        bmi_profile = (TextView) findViewById(R.id.edt_BMI_profile);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(WeightProfile)){
            weight_profile.setText(sharedPreferences.getString(WeightProfile, ""));
        }
        if(sharedPreferences.contains(HeightProfile)){
            height_profile.setText(sharedPreferences.getString(HeightProfile, ""));
        }
        if(sharedPreferences.contains(BMIProfile)){
            bmi_profile.setText(sharedPreferences.getString(BMIProfile, ""));
        }
    }

    public void Save (View view) {
        String w = weight_profile.getText().toString();
        String h = height_profile.getText().toString();
        String b = bmi_profile.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(WeightProfile, w);
        editor.putString(HeightProfile, h);
        editor.putString(BMIProfile, b);
        editor.commit();
    }

    public void Clear (View view) {
        weight_profile = (TextView) findViewById(R.id.edt_weight_profile);
        height_profile = (TextView) findViewById(R.id.edt_height_profile);
        bmi_profile = (TextView) findViewById(R.id.edt_BMI_profile);
        weight_profile.setText("");
        height_profile.setText("");
        bmi_profile.setText("");
    }

    public void Get (View view) {
        weight_profile = (TextView) findViewById(R.id.edt_weight_profile);
        height_profile = (TextView) findViewById(R.id.edt_height_profile);
        bmi_profile = (TextView) findViewById(R.id.edt_BMI_profile);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(WeightProfile)){
            weight_profile.setText(sharedPreferences.getString(WeightProfile, ""));
        }
        if(sharedPreferences.contains(HeightProfile)){
            height_profile.setText(sharedPreferences.getString(HeightProfile, ""));
        }
        if(sharedPreferences.contains(BMIProfile)){
            bmi_profile.setText(sharedPreferences.getString(BMIProfile, ""));
        }
    }
}
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

public class JournalActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView start_date, end_date, start_weight, goal_weight, start_BMI, goal_BMI;
    TextView nhstart1, nhstart2, nhstart3, nhbreak1, nhbreak2, nhbreak3;
    TextView end_date2, final_weight, final_BMI;

    public static final String mypreferences = "mypref";
    public static final String Start_date = "start_date";
    public static final String End_date = "end_date";
    public static final String Start_weight = "start_weight";
    public static final String Goal_weight = "goal_weight";
    public static final String Start_BMI = "start_BMI";
    public static final String Goal_BMI = "goal_BMI";

    public static final String Nhstart1 = "nhstart1";
    public static final String Nhstart2 = "nhstart2";
    public static final String Nhstart3 = "nhstart3";
    public static final String Nhbreak1 = "nhbreak1";
    public static final String Nhbreak2 = "nhbreak2";
    public static final String Nhbreak3 = "nhbreak3";

    public static final String End_date2 = "end_date2";
    public static final String Final_weight = "final_weight";
    public static final String Final_BMI = "final_BMI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        start_date = (TextView) findViewById(R.id.txt_start_date);
        end_date = (TextView) findViewById(R.id.txt_end_date);
        start_weight = (TextView) findViewById(R.id.txt_start_weight);
        goal_weight = (TextView) findViewById(R.id.txt_goal_weight);
        start_BMI = (TextView) findViewById(R.id.txt_start_BMI);
        goal_BMI = (TextView) findViewById(R.id.txt_goal_BMI);

        nhstart1 = (TextView) findViewById(R.id.txt_nhstart1);
        nhstart2 = (TextView) findViewById(R.id.txt_nhstart2);
        nhstart3 = (TextView) findViewById(R.id.txt_nhstart3);
        nhbreak1 = (TextView) findViewById(R.id.txt_nhbreak1);
        nhbreak2 = (TextView) findViewById(R.id.txt_nhbreak2);
        nhbreak3 = (TextView) findViewById(R.id.txt_nhbreak3);

        end_date2 = (TextView) findViewById(R.id.txt_end_date2);
        final_weight = (TextView) findViewById(R.id.txt_final_weight);
        final_BMI = (TextView) findViewById(R.id.txt_final_BMI);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Start_date)){
            start_date.setText(sharedPreferences.getString(Start_date, ""));
        }
        if(sharedPreferences.contains(End_date)){
            end_date.setText(sharedPreferences.getString(End_date, ""));
        }
        if(sharedPreferences.contains(Start_weight)){
            start_weight.setText(sharedPreferences.getString(Start_weight, ""));
        }
        if(sharedPreferences.contains(Goal_weight)){
            goal_weight.setText(sharedPreferences.getString(Goal_weight, ""));
        }
        if(sharedPreferences.contains(Start_BMI)){
            start_BMI.setText(sharedPreferences.getString(Start_BMI, ""));
        }
        if(sharedPreferences.contains(Goal_BMI)){
            goal_BMI.setText(sharedPreferences.getString(Goal_BMI, ""));
        }

        if(sharedPreferences.contains(Nhstart1)){
            nhstart1.setText(sharedPreferences.getString(Nhstart1, ""));
        }
        if(sharedPreferences.contains(Nhstart2)){
            nhstart2.setText(sharedPreferences.getString(Nhstart2, ""));
        }
        if(sharedPreferences.contains(Nhstart3)){
            nhstart3.setText(sharedPreferences.getString(Nhstart3, ""));
        }
        if(sharedPreferences.contains(Nhbreak1)){
            nhbreak1.setText(sharedPreferences.getString(Nhbreak1, ""));
        }
        if(sharedPreferences.contains(Nhbreak2)){
            nhbreak2.setText(sharedPreferences.getString(Nhbreak2, ""));
        }
        if(sharedPreferences.contains(Nhbreak3)){
            nhbreak3.setText(sharedPreferences.getString(Nhbreak3, ""));
        }

        if(sharedPreferences.contains(End_date2)){
            end_date2.setText(sharedPreferences.getString(End_date2, ""));
        }
        if(sharedPreferences.contains(Final_weight)){
            final_weight.setText(sharedPreferences.getString(Final_weight, ""));
        }
        if(sharedPreferences.contains(Final_BMI)){
            final_BMI.setText(sharedPreferences.getString(Final_BMI, ""));
        }
    }

    public void Save (View view) {
        String sd = start_date.getText().toString();
        String ed = end_date.getText().toString();
        String sw = start_weight.getText().toString();
        String gw = goal_weight.getText().toString();
        String sb = start_BMI.getText().toString();
        String gb = goal_BMI.getText().toString();

        String nhs1 = nhstart1.getText().toString();
        String nhs2 = nhstart2.getText().toString();
        String nhs3 = nhstart3.getText().toString();
        String nhb1 = nhbreak1.getText().toString();
        String nhb2 = nhbreak2.getText().toString();
        String nhb3 = nhbreak3.getText().toString();

        String ed2 = end_date2.getText().toString();
        String fw = final_weight.getText().toString();
        String fb = final_BMI.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Start_date, sd);
        editor.putString(End_date, ed);
        editor.putString(Start_weight, sw);
        editor.putString(Goal_weight, gw);
        editor.putString(Start_BMI, sb);
        editor.putString(Goal_BMI, gb);

        editor.putString(Nhstart1, nhs1);
        editor.putString(Nhstart2, nhs2);
        editor.putString(Nhstart3, nhs3);
        editor.putString(Nhbreak1, nhb1);
        editor.putString(Nhbreak2, nhb2);
        editor.putString(Nhbreak3, nhb3);

        editor.putString(End_date2, ed2);
        editor.putString(Final_weight, fw);
        editor.putString(Final_BMI, fb);
        editor.commit();
    }

    public void Clear (View view) {
        start_date = (TextView) findViewById(R.id.txt_start_date);
        end_date = (TextView) findViewById(R.id.txt_end_date);
        start_weight = (TextView) findViewById(R.id.txt_start_weight);
        goal_weight = (TextView) findViewById(R.id.txt_goal_weight);
        start_BMI = (TextView) findViewById(R.id.txt_start_BMI);
        goal_BMI = (TextView) findViewById(R.id.txt_goal_BMI);
        start_date.setText("");
        end_date.setText("");
        start_weight.setText("");
        goal_weight.setText("");
        start_BMI.setText("");
        goal_BMI.setText("");

        nhstart1 = (TextView) findViewById(R.id.txt_nhstart1);
        nhstart2 = (TextView) findViewById(R.id.txt_nhstart2);
        nhstart3 = (TextView) findViewById(R.id.txt_nhstart3);
        nhbreak1 = (TextView) findViewById(R.id.txt_nhbreak1);
        nhbreak2 = (TextView) findViewById(R.id.txt_nhbreak2);
        nhbreak3 = (TextView) findViewById(R.id.txt_nhbreak3);
        nhstart1.setText("");
        nhstart2.setText("");
        nhstart3.setText("");
        nhbreak1.setText("");
        nhbreak2.setText("");
        nhbreak3.setText("");

        end_date2 = (TextView) findViewById(R.id.txt_end_date2);
        final_weight = (TextView) findViewById(R.id.txt_final_weight);
        final_BMI = (TextView) findViewById(R.id.txt_final_BMI);
        end_date2.setText("");
        final_weight.setText("");
        final_BMI.setText("");
    }

    public void Get (View view) {
        start_date = (TextView) findViewById(R.id.txt_start_date);
        end_date = (TextView) findViewById(R.id.txt_end_date);
        start_weight = (TextView) findViewById(R.id.txt_start_weight);
        goal_weight = (TextView) findViewById(R.id.txt_goal_weight);
        start_BMI = (TextView) findViewById(R.id.txt_start_BMI);
        goal_BMI = (TextView) findViewById(R.id.txt_goal_BMI);

        nhstart1 = (TextView) findViewById(R.id.txt_nhstart1);
        nhstart2 = (TextView) findViewById(R.id.txt_nhstart2);
        nhstart3 = (TextView) findViewById(R.id.txt_nhstart3);
        nhbreak1 = (TextView) findViewById(R.id.txt_nhbreak1);
        nhbreak2 = (TextView) findViewById(R.id.txt_nhbreak2);
        nhbreak3 = (TextView) findViewById(R.id.txt_nhbreak3);

        end_date2 = (TextView) findViewById(R.id.txt_end_date2);
        final_weight = (TextView) findViewById(R.id.txt_final_weight);
        final_BMI = (TextView) findViewById(R.id.txt_final_BMI);
        sharedPreferences = getSharedPreferences(mypreferences, Context.MODE_PRIVATE);

        if(sharedPreferences.contains(Start_date)){
            start_date.setText(sharedPreferences.getString(Start_date, ""));
        }
        if(sharedPreferences.contains(End_date)){
            end_date.setText(sharedPreferences.getString(End_date, ""));
        }
        if(sharedPreferences.contains(Start_weight)){
            start_weight.setText(sharedPreferences.getString(Start_weight, ""));
        }
        if(sharedPreferences.contains(Goal_weight)){
            goal_weight.setText(sharedPreferences.getString(Goal_weight, ""));
        }
        if(sharedPreferences.contains(Start_BMI)){
            start_BMI.setText(sharedPreferences.getString(Start_BMI, ""));
        }
        if(sharedPreferences.contains(Goal_BMI)){
            goal_BMI.setText(sharedPreferences.getString(Goal_BMI, ""));
        }

        if(sharedPreferences.contains(Nhstart1)){
            nhstart1.setText(sharedPreferences.getString(Nhstart1, ""));
        }
        if(sharedPreferences.contains(Nhstart2)){
            nhstart2.setText(sharedPreferences.getString(Nhstart2, ""));
        }
        if(sharedPreferences.contains(Nhstart3)){
            nhstart3.setText(sharedPreferences.getString(Nhstart3, ""));
        }
        if(sharedPreferences.contains(Nhbreak1)){
            nhbreak1.setText(sharedPreferences.getString(Nhbreak1, ""));
        }
        if(sharedPreferences.contains(Nhbreak2)){
            nhbreak2.setText(sharedPreferences.getString(Nhbreak2, ""));
        }
        if(sharedPreferences.contains(Nhbreak3)){
            nhbreak3.setText(sharedPreferences.getString(Nhbreak3, ""));
        }

        if(sharedPreferences.contains(End_date2)){
            end_date2.setText(sharedPreferences.getString(End_date2, ""));
        }
        if(sharedPreferences.contains(Final_weight)){
            final_weight.setText(sharedPreferences.getString(Final_weight, ""));
        }
        if(sharedPreferences.contains(Final_BMI)){
            final_BMI.setText(sharedPreferences.getString(Final_BMI, ""));
        }

    }
}
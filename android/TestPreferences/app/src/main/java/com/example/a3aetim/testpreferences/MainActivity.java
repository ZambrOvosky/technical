package com.example.a3aetim.testpreferences;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PREFERENCIAS_RED = "color_red";
    public static final String PREFERENCIAS_GREEN = "color_green";
    public static final String PREFERENCIAS_BLUE = "color_blue";
    EditText edT_red, edT_green, edT_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        edT_red = (EditText)findViewById(R.id.edT_red);
        edT_green = (EditText)findViewById(R.id.edT_green);
        edT_blue = (EditText)findViewById(R.id.edT_blue);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getValues(View view) {
        //String color = R.
        String red_value = edT_red.getText().toString();
        String green_value = edT_green.getText().toString();
        String blue_value = edT_blue.getText().toString();
        save(view, red_value, green_value, blue_value);

    }

    public void changeBackground(View view) {
        SharedPreferences settings_r = getSharedPreferences(PREFERENCIAS_RED, 0);
        String red = settings_r.getString("red", "00");

        SharedPreferences setting_g = getSharedPreferences(PREFERENCIAS_GREEN, 0);
        String green = setting_g.getString("green", "00");

        SharedPreferences setting_b = getSharedPreferences(PREFERENCIAS_BLUE, 0);
        String blue = setting_b.getString("blue", "00");

        int rv = Integer.parseInt(red);
        int gv = Integer.parseInt(green);
        int bv = Integer.parseInt(blue);

        view.setBackgroundColor(Color.rgb(rv, gv, bv));
    }

    public void save(View view, String red, String green, String blue) {
        SharedPreferences settings = getSharedPreferences(PREFERENCIAS_RED, 0);
        SharedPreferences.Editor editor_r = settings.edit();
        editor_r.putString(PREFERENCIAS_RED, red);
        editor_r.commit();

        SharedPreferences settings_g = getSharedPreferences(PREFERENCIAS_GREEN, 0);
        SharedPreferences.Editor editor_g = settings_g.edit();
        editor_g.putString(PREFERENCIAS_GREEN, green);
        editor_g.commit();

        SharedPreferences settings_b = getSharedPreferences(PREFERENCIAS_BLUE, 0);
        SharedPreferences.Editor editor_b = settings_b.edit();
        editor_b.putString(PREFERENCIAS_BLUE, blue);
        editor_b.commit();

        changeBackground(view);
    }
}

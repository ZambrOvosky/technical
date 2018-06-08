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

    public void change(View view) {
        //String color = R.
        int red_value = Integer.parseInt(edT_red.getText().toString());
        int green_value = Integer.parseInt(edT_green.getText().toString());
        int blue_value = Integer.parseInt(edT_blue.getText().toString());
        view.setBackgroundColor(Color.rgb(red_value, green_value, blue_value));
    }

    public void save(View view, String red, String green, String blue) {

        SharedPreferences settings = getSharedPreferences(PREFERENCIAS_RED, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PREFERENCIAS_RED, red);
    }
}

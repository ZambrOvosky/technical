package a3aetim.app_578;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Example05Activity extends AppCompatActivity {

    EditText edT_diameter = (EditText) findViewById(R.id.edT_diameter);
    EditText edT_lap = (EditText) findViewById(R.id.edT_lap);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example05);
    }

    private void calculate() {
        double diameter = Double.parseDouble(edT_diameter.getText().toString());
        int lap = Integer.parseInt(edT_lap.getText().toString());
        double distance = ((Math.PI * diameter) / 2) * lap;

        Intent intent = new Intent("ActivityResult");
        intent.putExtra("distance", distance);
        startActivity(intent);
    }
}

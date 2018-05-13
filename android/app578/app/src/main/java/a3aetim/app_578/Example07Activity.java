package a3aetim.app_578;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Example07Activity extends AppCompatActivity {

    EditText edT_room = (EditText) findViewById(R.id.edT_room);
    EditText edT_lenght = (EditText) findViewById(R.id.edT_lenght);
    EditText edT_width = (EditText) findViewById(R.id.edT_width);
    RadioButton rdB_register = (RadioButton) findViewById(R.id.rdB_register);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example07);
    }

    private void calculate() {
        double total_area = 0;
        while(rdB_register.isChecked()) {
            double lenght = Double.parseDouble(edT_lenght.getText().toString());
            double width = Double.parseDouble(edT_width.getText().toString());
            total_area += lenght * width;
        }

        Intent intent = new Intent("ActivityResult");
        intent.putExtra("total_area", total_area);
        startActivity(intent);
    }
}

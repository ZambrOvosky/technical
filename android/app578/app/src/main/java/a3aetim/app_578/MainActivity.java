package a3aetim.app_578;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rdB_radio05 = (RadioButton) findViewById(R.id.rdB_radio05);
    RadioButton rdB_radio07 = (RadioButton) findViewById(R.id.rdB_radio07);
    RadioButton rdB_radio08 = (RadioButton) findViewById(R.id.rdB_radio08);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void go() {
        Intent intent = new Intent();
        if(rdB_radio05.isChecked())
            intent.setAction("Example05Activity");
        else if(rdB_radio07.isChecked())
            intent.setAction("Example07Activity");
        else if(rdB_radio08.isChecked())
            intent.setAction("Example07Activity");
        startActivity(intent);
    }
}

package a3aetim.app_578;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Example08Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example08);
    }

    private void calculate() {
        int[] sequence = new int[12];
        sequence[0] = 0;
        sequence[1] = 1;
        for(byte b = 2; b <= 11; b++)
            sequence[b] = sequence[b - 1] + sequence[b - 2];
        int last = sequence[11];

        Intent intent = new Intent("ActivityResult");
        intent.putExtra("last", last);
        startActivity(intent);
    }
}

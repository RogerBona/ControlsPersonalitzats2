package cat.dam.roger.controlspersonalitzats2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    static ToggleButton llums;
    static TextView txtllums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Exemple ToggleButton personalitzat");
        setContentView(R.layout.activity_main);

        llums = (ToggleButton) findViewById(R.id.llums);
        txtllums = (TextView) findViewById(R.id.txtllums);

        llums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (llums.isChecked())
                    txtllums.setText("Llums apagades");
                else
                    txtllums.setText("Llums Obertes");
            }
        });

    }
}

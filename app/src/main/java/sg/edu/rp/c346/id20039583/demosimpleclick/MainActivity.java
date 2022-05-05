package sg.edu.rp.c346.id20039583.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    EditText etInput;
    Button btnDisplay;
    ToggleButton toggleButtonEnabled;
    RadioGroup rgGender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //linking field variables to UI components
        tvDisplay = findViewById(R.id.tvDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        etInput = findViewById(R.id.etInput);
        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);
        rgGender =findViewById(R.id.rgGender);



        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);



            }
        });


        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButtonEnabled.isChecked()==true){
                    etInput.setEnabled(true);
                    tvDisplay.setText("Enabled");


                }
                else{
                    etInput.setEnabled(false);
                    tvDisplay.setText("Disabled");

                }





            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                    String data = etInput.getText().toString();
                    int selectedId = rgGender.getCheckedRadioButtonId();
                    if (selectedId == R.id.radioButtonMale) {
                        // Write the code when male selected
                        tvDisplay.setText("He says " + data);


                    } else {
                        // Write the code when female selected
                        tvDisplay.setText("She says " + data);


                    }


                }

        });




    }
}
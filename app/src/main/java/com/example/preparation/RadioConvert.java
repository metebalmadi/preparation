package com.example.preparation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class RadioConvert extends AppCompatActivity {

    double conversionRate = 2.2;
    double weightEntered;
    double weightConverted;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_convert);



        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        RadioButton rbttn1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rbttn2 = (RadioButton) findViewById(R.id.radioButton2);

        TextView txtView = (TextView) findViewById(R.id.textView333);

        Button bttnCalc = (Button) findViewById(R.id.bttnCalc);




        Toast toast = new Toast(RadioConvert.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText("Weight Converted");

        DecimalFormat tenth = new DecimalFormat("##.##");


        bttnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                weightEntered = Double.parseDouble(editText.getText().toString());
                if (rbttn1.isChecked()) {
                    if (weightEntered <= 500)
                    {

                        weightConverted = weightEntered/ conversionRate;
                        toast.setText("Weight Converted");
                        toast.show();

                        txtView.setText(tenth.format(weightConverted) + " Kilos");

                    } else {
                        toast.setText("Input must be less than 500");
                        toast.show();
                    }


                }
                if (rbttn2.isChecked())
                {
                    if (weightEntered <= 270)
                    {
                        weightConverted = weightEntered * conversionRate;
                        txtView.setText(tenth.format(weightConverted) + " Pounds");
                        toast.setText("Weight Converted");
                        toast.show();

                    } else {
                        toast.setText("Input must be less than 270");
                        toast.show();
                    }
                }


            }
        });


    }
}
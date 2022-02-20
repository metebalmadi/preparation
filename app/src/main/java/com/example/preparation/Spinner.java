package com.example.preparation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Spinner extends AppCompatActivity {

    double costPerTicket;
    int numOfTickets;
    double totalCost;
    String ticketSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        Button bttnCalc = (Button) findViewById(R.id.button7);
        final EditText editTextNumber1 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        final android.widget.Spinner spinner1 = (android.widget.Spinner) findViewById(R.id.spinner);
        final TextView result = (TextView) findViewById(R.id.txtResult);

        bttnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ticketChoice = spinner1.getSelectedItem().toString();
                numOfTickets = Integer.parseInt(editTextNumber1.getText().toString());

                ticketCompare(ticketChoice);

                totalCost = costPerTicket * numOfTickets;
                DecimalFormat curr = new DecimalFormat("$###,###,###.##");



                result.setText("Cost for " + ticketSelection + " is " + curr.format(totalCost));
            }
        });



    }

    private void ticketCompare(String s)
    {
        switch(s)
        {
            case "op1": ticketSelection = "Zig Zag"; costPerTicket = 58.99; break;
            case "op2": ticketSelection = "Life Revealed"; costPerTicket = 65.99; break;
            case "Spatial Sense": ticketSelection = "Spatial Sense"; costPerTicket = 85.99; break;

        }
    }
}
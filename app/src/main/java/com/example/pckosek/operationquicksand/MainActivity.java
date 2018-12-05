package com.example.pckosek.operationquicksand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /* ------------------------*/
    /*    member variables     */

    Button mCommenceButton;
    TextView mTextView;


    /* ------------------------*/
    /*    constructor          */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCommenceButton = findViewById(R.id.button);
        mCommenceButton.setOnClickListener(this);

        mTextView = findViewById(R.id.textView);
    }


    /* ------------------------*/
    /*    interfaces           */

    @Override
    public void onClick(View v) {

        int z = operationQuicksand();

        mTextView.setText(Integer.toString(z));

    }


    /* ------------------------*/
    /*    custom methods       */

    public int operationQuicksand() {
        int x = 0;
        int y = 0;
        int z = 0;

        while (x<50000) {
            x++;
            y = 0;
            while (y<x) {
                y++;
                z += y;
            }
        }
        return z;
   }

}

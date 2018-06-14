package com.bitbyte24seven.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        // TODO: Steps 4 & 8 - Declare member variables here:
        Button t1btupper ;
         Button t1btdown ;

        TextView tvQution ;


        int qution = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         t1btupper = findViewById(R.id.btRight);
         t1btdown = findViewById(R.id.btWrong);

         tvQution = findViewById(R.id.tvQution);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        tvQution.setText(R.string.T1_Story);
        t1btupper.setText(R.string.T1_Ans1);
        t1btdown.setText(R.string.T1_Ans2);

    }



    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    public void btupper(View view) {
        if (qution == 1) {
            tvQution.setText(R.string.T3_Story);
            t1btupper.setText(R.string.T3_Ans1);
            t1btdown.setText(R.string.T3_Ans2);
            qution = 3;
        }else if (qution == 3) {
            tvQution.setText(R.string.T6_End);
            t1btupper.setVisibility(View.GONE);
            t1btdown.setVisibility(View.GONE);
            qution = 6;

        }else  if (qution == 2){
            tvQution.setText(R.string.T3_Story);
            t1btupper.setText(R.string.T3_Ans1);
            t1btdown.setText(R.string.T3_Ans2);
            qution = 3;
        }

    }

    public void btdown(View view) {
        if (qution == 1) {
            tvQution.setText(R.string.T2_Story);
            t1btupper.setText(R.string.T2_Ans1);
            t1btdown.setText(R.string.T2_Ans2);
            qution = 2;
        }else  if(qution ==3 ){
            tvQution.setText(R.string.T5_End);
            t1btupper.setVisibility(View.GONE);
            t1btdown.setVisibility(View.GONE);
        }else if (qution == 2) {
            tvQution.setText(R.string.T4_End);
            t1btupper.setVisibility(View.GONE);
            t1btdown.setVisibility(View.GONE);
        }

    }






}

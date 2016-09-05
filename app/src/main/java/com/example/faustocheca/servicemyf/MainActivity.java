package com.example.faustocheca.servicemyf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private int num1=0;
    private int num2=0;
    private int milliS=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void calc (View view) {
        EditText num_1 = (EditText) findViewById(R.id.textv_num1);
        EditText num_2 = (EditText) findViewById(R.id.textv_num2);
        EditText sleep = (EditText) findViewById(R.id.textv_sleep);

        num1 = Integer.parseInt(num_1.getText().toString());
        num2 = Integer.parseInt(num_2.getText().toString());
        milliS = Integer.parseInt(sleep.getText().toString());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(milliS);



        Intent intent = new Intent(this,MyIntentService.class);
        intent.putIntegerArrayListExtra("arrayNum",numbers);


        startService(intent);
        Log.i(">>TAG", String.valueOf(intent));



    }

}

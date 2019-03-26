package com.example.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Intent1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);
    }
    public void addclick(View v)
    {
        Button b1=(Button)findViewById(R.id.button);
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.valueOf(e1.getText().toString());
        Double num2=Double.valueOf(e2.getText().toString());
        Double result;
        result=num1+num2;
        t1.setText(Double.toString(result));




    }

    public void minusclick(View v)
    {
        Button b1=(Button)findViewById(R.id.button2);
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.valueOf(e1.getText().toString());
        Double num2=Double.valueOf(e2.getText().toString());
        Double result;
        result=num1-num2;
        t1.setText(Double.toString(result));




    }
    public void multiplayclick(View v)
    {
        Button b1=(Button)findViewById(R.id.button3);
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.valueOf(e1.getText().toString());
        Double num2=Double.valueOf(e2.getText().toString());
        Double result;
        result=num1*num2;
        t1.setText(Double.toString(result));




    }
    public void divineclick(View v)
    {
        Button b1=(Button)findViewById(R.id.button4);
        EditText e1= (EditText) findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        Double num1= Double.valueOf(e1.getText().toString());
        Double num2=Double.valueOf(e2.getText().toString());
        Double result;
        result=num1/num2;
        t1.setText(Double.toString(result));




    }
}

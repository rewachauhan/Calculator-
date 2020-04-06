package com.example.calculator_activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity {
	EditText et1;
	EditText et2;
	TextView tv;
	Button bt1;
	Button bt2;
	Button bt3;
	Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        tv=(TextView) findViewById(R.id.textView4);
        bt1=(Button) findViewById(R.id.button1);
        bt2=(Button) findViewById(R.id.button2);
        bt3=(Button) findViewById(R.id.button3);
        bt4=(Button) findViewById(R.id.button4);
        bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(et1.getText().toString());
				int b=Integer.parseInt(et2.getText().toString());
				int c=a/b;
				tv.setText("division is:"+c);
			}
		});
        bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(et1.getText().toString());
				int b=Integer.parseInt(et2.getText().toString());
				int c=a*b;
				tv.setText("product is:"+c);
			}
		});
        bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(et1.getText().toString());
				int b=Integer.parseInt(et2.getText().toString());
				int c=a-b;
				tv.setText("subtraction is:"+c);
			}
		});
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(et1.getText().toString());
				int b=Integer.parseInt(et2.getText().toString());
				int c=a+b;
				tv.setText("sum is:"+c);
			}
		});
      }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calc, menu);
        return true;
    }
    
}

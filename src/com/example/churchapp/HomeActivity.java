package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	Button btnBack, btnEndDay ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO Put your code here
		setContentView(R.layout.home);
		
		initDesign();
	}
	
	private void initDesign(){
		
		try {
			
			btn1 = (Button) findViewById(R.id.button1);
			btn2 = (Button) findViewById(R.id.button2);
			btn3 = (Button) findViewById(R.id.button3);
			btn4 = (Button) findViewById(R.id.button4);
			btn5 = (Button) findViewById(R.id.button5);
			btn6 = (Button) findViewById(R.id.button6);
			btn7 = (Button) findViewById(R.id.button7);
			btn8 = (Button) findViewById(R.id.button8);
			btn9 = (Button) findViewById(R.id.button9);
			
			btn1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});

			btn3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			btn8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});
			
			
			btn9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					nextActivity();
				}
			});

			btnBack = (Button) findViewById(R.id.buttonBack);
			btnBack.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {

//					Intent i = new Intent(HomeActivity.this, MainActivity.class);
//					startActivity(i);
					finish();
				}
			});
			
			btnEndDay = (Button) findViewById(R.id.buttonFinish);
			btnEndDay.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent i = new Intent(HomeActivity.this, FinishActivity.class);
					startActivity(i);
					finish();
					
				}
			});

		} catch (Exception e) {
			
			Toast.makeText(HomeActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
	}//end of initDesign
	
	private void nextActivity(){
		
		Intent i = new Intent(HomeActivity.this, WhoActivity.class);
		startActivity(i);
		finish();
		
	}//end of nextActivity()
	
}//end of main class

package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class WantCallActivity extends Activity {

	Button btnBack,btnOK,btnNot;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.want_call);
		initDesign();
		
	}//end of onCreate()
	
	private void initDesign(){
		
		try {
			
			btnOK = (Button) findViewById(R.id.buttonOK);
			btnNot = (Button) findViewById(R.id.buttonCancel);
			
			btnOK.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
		
					Intent i = new Intent(WantCallActivity.this, FinishActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnNot.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
		
					Intent i = new Intent(WantCallActivity.this, FinishActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnBack = (Button) findViewById(R.id.buttonBack);
			btnBack.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(WantCallActivity.this, PrayerActivity.class);
					startActivity(i);
					finish();
				}
			});
			
		} catch (Exception e) {
			
			Toast.makeText(WantCallActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
		
	}//end of initDesign
	
}//end of main class
package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class FinishActivity extends Activity {

	Button btnBack,btnFinish;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finish);
		initDesign();
		
	}//end of onCreate()
	
	private void initDesign(){
		
try {

			
			btnBack = (Button) findViewById(R.id.buttonBack);
			btnBack.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(FinishActivity.this, WantCallActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnFinish = (Button) findViewById(R.id.buttonFinish);
			btnFinish.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Toast.makeText(FinishActivity.this, "Data will be sent all to server : waiting for server", 9000).show();
					Intent i = new Intent(FinishActivity.this, MainActivity.class);
					startActivity(i);
					finish();
				}
			});	
			
			} catch (Exception e) {
				
				Toast.makeText(FinishActivity.this, "Exception : " + e.toString(), 9000).show();
				
			}//end of exception handling
		
		
		
	}//end of initDesign
	
}//end of main class

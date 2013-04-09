package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends Activity {

	Button btnBack,btnNext,btnAddMem,btnFinish;
	EditText etName,etYear,etPhone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		
		initDesign();
		
	}//end of onCreate()
	
	private void initDesign(){
		
	try {
			btnAddMem = (Button) findViewById(R.id.buttonAddMem);
			btnFinish = (Button) findViewById(R.id.buttonFinish);
			
			etName = (EditText) findViewById(R.id.editTextName);
			etYear = (EditText) findViewById(R.id.editTextYear);
			etPhone = (EditText) findViewById(R.id.editTextTel);
			
			btnAddMem.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Toast.makeText(InfoActivity.this, "Add has been done : Waiting for server"  , 9000).show();
					etName.setText("");
					etYear.setText("");
					etPhone.setText("");
					
				}
			});
			
			btnFinish.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(InfoActivity.this, MainActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnBack = (Button) findViewById(R.id.buttonBack);
			btnBack.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(InfoActivity.this, WhoActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnNext = (Button) findViewById(R.id.buttonNext);
			btnNext.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(InfoActivity.this, StatusActivity.class);
					startActivity(i);
					finish();
				}
			});
			
		} catch (Exception e) {
			
			Toast.makeText(InfoActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
	}//end of initDesign
	
}//end of main class

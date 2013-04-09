package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NumberActivity extends Activity {

	EditText etNumber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.number);
		initDesign();
		
	}//end of onCreate()
	
	private void initDesign(){
		
		try {
			
			etNumber = (EditText) findViewById(R.id.editTextQuan);

			etNumber.addTextChangedListener(new TextWatcher() {
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count,
						int after) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void afterTextChanged(Editable s) {
					Intent i = new Intent(NumberActivity.this, InfoActivity.class);
					startActivity(i);
					finish();
					
				}
				
			});
			
			
		} catch (Exception e) {
			
			Toast.makeText(NumberActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
		
	}//end of initDesign
	
}//end of main class
package com.example.churchapp;

import java.awt.font.NumericShaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class WhoActivity extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	
	Button btnInd,btnFamily,btnGroup,btnBack; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.who);
	
		initDesign();
	}
	
	private void initDesign(){
		
		try {
			
			btnInd = (Button) findViewById(R.id.buttonInd);
			btnFamily = (Button) findViewById(R.id.buttonFamily);
			btnGroup = (Button) findViewById(R.id.buttonGroup);
			
			btnInd.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {

					Intent i = new Intent(WhoActivity.this, InfoActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnFamily.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {

					Intent i = new Intent(WhoActivity.this, NumberActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnGroup.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {

					Intent i = new Intent(WhoActivity.this, NumberActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnBack = (Button) findViewById(R.id.buttonBack);
			btnBack.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {

					Intent i = new Intent(WhoActivity.this, HomeActivity.class);
					startActivity(i);
					finish();
				}
			});
			
		} catch (Exception e) {
			
			Toast.makeText(WhoActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
	}//end of initDesign
}

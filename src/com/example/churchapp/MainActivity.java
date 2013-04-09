package com.example.churchapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ImageView ivLogo;
	Button btnAdd, btnStart;
	Spinner spCap, spTown;
	EditText etAutoDate,etMemCode1,etMemCode2,etDayCode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initDesign();
		
	}//end of onCreate
	
	private void initDesign(){
		
		try {
			
			etAutoDate = (EditText) findViewById(R.id.editTextDate);
			
			getCurrentTime();
			
			etMemCode1 = (EditText) findViewById(R.id.editTextMemCode1);
			etMemCode2 = (EditText) findViewById(R.id.editTextMemCode2);
			etDayCode = (EditText) findViewById(R.id.editTextDayCode);
			
			spCap = (Spinner) findViewById(R.id.spinnerCaptin);
			ArrayAdapter<CharSequence> capArray = ArrayAdapter.createFromResource(this, R.array.country_arrays, android.R.layout.simple_spinner_item);
			capArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spCap.setAdapter(capArray);
			
			spTown = (Spinner) findViewById(R.id.spinnerTown);
			ArrayAdapter<CharSequence> townArray = ArrayAdapter.createFromResource(this, R.array.area_arrays, android.R.layout.simple_spinner_item);
			townArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spTown.setAdapter(townArray);
			
			btnAdd = (Button) findViewById(R.id.buttonAddMem);
			btnAdd.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Toast.makeText(MainActivity.this, "ADD MEMBER : Waiting for Server", 9000).show();
//					etMemCode1.setText("");
//					etMemCode2.setText("");
					
				}
			});
			
			btnStart = (Button) findViewById(R.id.buttonStart);
			btnStart.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent i = new Intent(MainActivity.this, HomeActivity.class);
					startActivity(i);
//					finish();
				}
				
			});//end of btnStart event
			
		} catch (Exception e) {
			
			Toast.makeText(MainActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
	}//end of initDesign
	
	private void getCurrentTime(){
		
//		Calendar c = Calendar.getInstance(); 
//		
//		int date = c.get(Calendar.DATE);
//		int month = c.get(Calendar.MONTH);
//		int year = c.get(Calendar.YEAR);
		
//		int hours = c.get(Calendar.HOUR);
//		int mins  = c.get(Calendar.MINUTE);
//		int seconds = c.get(Calendar.SECOND);
		
//		etAutoDate.setText( date+"/"+month+"/"+year);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Current time => " + c.getTime());

		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		String formattedDate = df.format(c.getTime());
		
		etAutoDate.setText( formattedDate);
				
	}//end of getCurrentTime

}//end of main class

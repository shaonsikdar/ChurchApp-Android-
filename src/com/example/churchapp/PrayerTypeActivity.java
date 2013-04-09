package com.example.churchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class PrayerTypeActivity extends Activity {

	Button btnBack,btnNext;
	CheckBox cbEnergy;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multi_prayer_type);
		initDesign();
		
	}//end of onCreate()
	
	private void initDesign(){
		
try {
	//		btnInd = (Button) findViewById(R.id.buttonInd);
	//		btnFamily = (Button) findViewById(R.id.buttonFamily);
	//		btnGroup = (Button) findViewById(R.id.buttonGroup);
			
	//		btnInd.setOnClickListener(new OnClickListener() {
	//			
	//			@Override
	//			public void onClick(View arg0) {
	//
	//				Intent i = new Intent(WhoActivity.this, InfoActivity.class);
	//				startActivity(i);
	//			}
	//		});
	//		
	//		btnFamily.setOnClickListener(new OnClickListener() {
	//			
	//			@Override
	//			public void onClick(View arg0) {
	//
	//				Intent i = new Intent(WhoActivity.this, InfoActivity.class);
	//				startActivity(i);
	//			}
	//		});
	//		
	//		btnGroup.setOnClickListener(new OnClickListener() {
	//			
	//			@Override
	//			public void onClick(View arg0) {
	//
	//				Intent i = new Intent(WhoActivity.this, InfoActivity.class);
	//				startActivity(i);
	//				finish();
	//			}
	//		});
			
			cbEnergy = (CheckBox) findViewById(R.id.button2);
			
			
//			cbEnergy.setOnClickListener(new OnClickListener() {
//				
//				@Override
//				public void onClick(View v) {
//						
//					if(cbEnergy.isChecked()==true)
//					{
//						cbEnergy.setBackgroundResource(R.drawable.energy_select);
//						
//					}else if(cbEnergy.isChecked()==false){
//						
//						cbEnergy.setBackgroundResource(R.drawable.energy);
//					}
//					
//				}
//			});
			
			btnBack = (Button) findViewById(R.id.buttonPre);
			btnBack.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(PrayerTypeActivity.this, PrayerActivity.class);
					startActivity(i);
					finish();
				}
			});
			
			btnNext = (Button) findViewById(R.id.buttonNext);
			btnNext.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
	
					Intent i = new Intent(PrayerTypeActivity.this, WantCallActivity.class);
					startActivity(i);
					finish();
				}
			});
		} catch (Exception e) {
			
			Toast.makeText(PrayerTypeActivity.this, "Exception : " + e.toString(), 9000).show();
			
		}//end of exception handling
		
	}//end of initDesign
	
}//end of main class

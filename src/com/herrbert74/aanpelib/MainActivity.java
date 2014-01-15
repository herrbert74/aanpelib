package com.herrbert74.aanpelib;

import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

@EActivity(resName="activity_main")
public class MainActivity extends Activity {

	@ViewById
	public TextView hello;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

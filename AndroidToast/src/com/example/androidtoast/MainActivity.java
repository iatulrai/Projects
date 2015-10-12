package com.example.androidtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * //Displaying the Toast
		 * 
		 * Toast.makeText(getApplicationContext(), "Hello Atul Rai",
		 * Toast.LENGTH_SHORT).show();
		 */
		LayoutInflater li = getLayoutInflater();
		View layout = li.inflate(R.layout.customtoast,
				(ViewGroup) findViewById(R.id.custom_toast_layout));

		Toast toast = new Toast(getApplicationContext());
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setView(layout);
		toast.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package com.thepic;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText editText1, editText2;
	Button buttonsum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		addListenerOnButton();

	}

	public void addListenerOnButton() {
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		buttonsum = (Button) findViewById(R.id.button1);

		buttonsum.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String value1 = editText1.getText().toString();
				String value2 = editText2.getText().toString();

				int a = Integer.parseInt(value1);
				int b = Integer.parseInt(value2);
				int sum = a + b;

				Toast.makeText(getApplicationContext(), String.valueOf(sum),
						Toast.LENGTH_LONG).show();

			}
		});
	}

	public void onCreateMenuOnption(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
	}
}

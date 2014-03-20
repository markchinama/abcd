package com.mark.bus.app;

import com.mark.bus.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

	private ImageButton homeButton;
	private ImageButton infoButton;
	private ImageButton controlButton;
	private ImageButton cameralButton;
	private ImageButton expertButton;
	BusFragment busFragment = new BusFragment();
	ButtonsFragment buttonsFragment = new ButtonsFragment();

	private ImageButton shutdownButton;
	// private NumberPicker temperature;

	private Spinner modeSpinner;
	private ArrayAdapter<String> modeSpinnerAdapter;

	// private NumberPicker powerPicker;
	private ImageButton acUpButton;
	private ImageButton acDownButton;
	private ImageButton powerUpButton;
	private ImageButton powerDownButton;

	private TextView ac_text;
	private TextView power_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		homeButton = (ImageButton) this.findViewById(R.id.homebutton);
		infoButton = (ImageButton) this.findViewById(R.id.infobutton);
		controlButton = (ImageButton) this.findViewById(R.id.controlbutton);
		cameralButton = (ImageButton) this.findViewById(R.id.cameralbutton);
		expertButton = (ImageButton) this.findViewById(R.id.expertbutton);
		controlButton.setOnClickListener(new TopbuttonListener());
		homeButton.setOnClickListener(new TopbuttonListener());

		bindAllUI();
		showFragment(busFragment);

	}

	public void bindAllUI() {

		acUpButton = (ImageButton) this.findViewById(R.id.ac_uparrow);
		acDownButton = (ImageButton) this.findViewById(R.id.ac_downarrow);
		powerUpButton = (ImageButton) this.findViewById(R.id.power_uparrow);
		powerDownButton = (ImageButton) this.findViewById(R.id.power_downarrow);

		ac_text = (TextView) this.findViewById(R.id.ac_text);
		power_text = (TextView) this.findViewById(R.id.power_text);
		modeSpinner = (Spinner) findViewById(R.id.item_list_temprature_mode_spinner);
		modeSpinnerAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, new String[] {
						"模式1", "模式2", "模式3" });
		modeSpinner.setAdapter(modeSpinnerAdapter);
		modeSpinner
				.setOnItemSelectedListener(new ModeSpinnerSelectedListener());
		acUpButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String con = ac_text.getText().toString();
				int temperature = new Integer(con).intValue();
				// int temperature = new Integer(ac_text.getText().toString());
				temperature += 1;
				String tx = new Integer(temperature).toString();

				ac_text.setText(tx);

			}
		});
		acDownButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String con = ac_text.getText().toString();
				int temperature = new Integer(con).intValue();
				// int temperature = new Integer(ac_text.getText().toString());
				temperature -= 1;
				String tx = new Integer(temperature).toString();

				ac_text.setText(tx);

			}
		});
		powerUpButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String con = power_text.getText().toString();
				int power = new Integer(con).intValue();
				// int temperature = new Integer(ac_text.getText().toString());
				power += 100;
				String tx = new Integer(power).toString();

				power_text.setText(tx);

			}
		});
		powerDownButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String con = power_text.getText().toString();
				int power = new Integer(con).intValue();
				// int temperature = new Integer(ac_text.getText().toString());
				power -= 100;
				String tx = new Integer(power).toString();

				power_text.setText(tx);

			}
		});
	}

	public void showFragment(Fragment fragment) {
		FragmentTransaction transaction = getFragmentManager()
				.beginTransaction();
		// Replace whatever is in the fragment_container view with this
		// fragment,
		// and add the transaction to the back stack
		transaction.replace(R.id.fragment_container, fragment);
		// transaction.addToBackStack(null);
		// Commit the transaction
		transaction.commit();

	}

	class TopbuttonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (v.equals(controlButton)) {
				showFragment(buttonsFragment);
				return;
			}
			if (v.equals(homeButton)) {
				showFragment(busFragment);
				return;
			}
		}

	}

	private class ModeSpinnerSelectedListener implements OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> adapterView, View view,
				int position, long arg3) {
			/*
			 * Toast.makeText(ItemListActivity.this, "妯″紡鍒囨崲鑷� +
			 * modeSpinnerAdapter.getItem(position), Toast.LENGTH_SHORT).show();
			 * TextView tv = (TextView) view;
			 * tv.setGravity(android.view.Gravity.CENTER_HORIZONTAL);
			 */
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub

		}
	}
}
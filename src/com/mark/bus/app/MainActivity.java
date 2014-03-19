package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private ImageButton homeButton;
	private ImageButton infoButton;
	private ImageButton controlButton;
	private ImageButton cameralButton;
	private ImageButton expertButton;
	BusFragment busFragment = new BusFragment();
	ButtonsFragment buttonsFragment = new ButtonsFragment();

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
		showFragment(busFragment);

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
}

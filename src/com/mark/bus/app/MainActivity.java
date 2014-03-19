package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private ImageButton homeButton;
	private ImageButton infoButton;
	private ImageButton controlButton;
	private ImageButton cameralButton;
	private ImageButton expertButton;

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

		homeButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("123");
				ButtonsFragment buttonsFragment = new ButtonsFragment();
				FragmentTransaction transaction = getFragmentManager()
						.beginTransaction();
				// Replace whatever is in the fragment_container view with this
				// fragment,
				// and add the transaction to the back stack
				transaction.replace(R.id.busfragment, buttonsFragment);
				//transaction.addToBackStack(null);
				// Commit the transaction
				transaction.commit();

			}
		});
	}
}

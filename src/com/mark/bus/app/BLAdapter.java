package com.mark.bus.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mark.bus.R;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class BLAdapter extends BaseAdapter {

	private List blist = new ArrayList();
	private int current = 0;
	private BusApplication ba = null;
	private List<Map<String, Object>> mData;
	private LayoutInflater mInflater;
	private Fragment fra;
	private View view;

	public BLAdapter(Fragment fra, View view, List mData) {
		this.view = view;
		this.mInflater = LayoutInflater.from(view.getContext());
		this.mData = mData;
		this.fra = fra;
		ba = (BusApplication) fra.getActivity().getApplication();

	}

	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.lb, null);
			holder.viewBtn = (Button) convertView.findViewById(R.id.bid);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.viewBtn.setText((CharSequence) mData.get(position));
		blist.add(holder.viewBtn);
		holder.viewBtn.setOnClickListener(new InfoOnClickListener(position));
		if (position == 0) {
			holder.viewBtn.setBackgroundResource(R.drawable.onebtnbg);
			WholeControlFragment wholeControlFragment = new WholeControlFragment();
			showFragment(wholeControlFragment);
		}
		return convertView;
	}

	public class InfoOnClickListener implements OnClickListener {

		private int position;

		public InfoOnClickListener(int position) {
			this.position = position;
		}

		@Override
		public void onClick(View v) {

			if (position == current)
				return;
			Button previous = (Button) blist.get(current);
			previous.setBackgroundResource(R.drawable.onebtnunpress);

			current = position;
			v.setBackgroundResource(R.drawable.onebtnbg);

			if (position == 0) {
				WholeControlFragment wholeControlFragment = new WholeControlFragment();
				showFragment(wholeControlFragment);
			}
			if (position == 1) {
				ElectricMechineControlFragment electricMechineControlFragment = new ElectricMechineControlFragment();
				showFragment(electricMechineControlFragment);
			}
			if (position == 2) {
				BatteryManagementFragment batteryManagementFragment = new BatteryManagementFragment();
				showFragment(batteryManagementFragment);
			}
			if (position == 3) {
				FireAlarmFragment fireAlarmFragment = new FireAlarmFragment();
				showFragment(fireAlarmFragment);
			}
			if (position == 4) {
				InsulationCheckFragment insulationCheckFragment = new InsulationCheckFragment();
				showFragment(insulationCheckFragment);
			}
			if (position == 5) {
				IntegrationCabinetFragment integrationCabinetFragment = new IntegrationCabinetFragment();
				showFragment(integrationCabinetFragment);
			}
			if (position == 6) {
				BusCanFragment busCanFragment = new BusCanFragment();
				showFragment(busCanFragment);
			}
			if (position == 7) {
				if (!(ba == null)) {
					if (ba.getCrashStatus() == 3) {

						Intent intent = new Intent(view.getContext(),
								CrashActivity.class);

						view.getContext().startActivity(intent);
					} else {
						CrashCheckFragment crashCheckFragment = new CrashCheckFragment(
								ba.getCrashStatus());
						showFragment(crashCheckFragment);
					}
				}
			}

		}
	}

	public void showFragment(Fragment fragment) {

		FragmentTransaction transaction = fra.getFragmentManager()
				.beginTransaction();
		// Replace whatever is in the fragment_container view with this
		// fragment,
		// and add the transaction to the back stack
		transaction.replace(R.id.info_fragment_container, fragment);
		// transaction.addToBackStack(null);
		// Commit the transaction
		transaction.commit();

	}
}

package com.mark.bus.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

import com.mark.bus.R;

public class BatteryManagementFragment extends Fragment {

	private boolean flag = true;
	private TableRow tab11;
	private TableRow tab12;
	private TableRow tab13;
	private TableRow tab14;

	private TableRow tab21;
	private TableRow tab22;
	private TableRow tab23;
	private TableRow tab24;

	private TableRow tab31;
	private TableRow tab32;

	private ImageButton collapse;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.battery_management_fragment,
				container, false);

		collapse = (ImageButton) view.findViewById(R.id.collapse);

		tab11 = (TableRow) view.findViewById(R.id.v11);
		tab12 = (TableRow) view.findViewById(R.id.v12);
		tab13 = (TableRow) view.findViewById(R.id.v13);
		tab14 = (TableRow) view.findViewById(R.id.v14);
		tab21 = (TableRow) view.findViewById(R.id.v21);
		tab22 = (TableRow) view.findViewById(R.id.v22);
		tab23 = (TableRow) view.findViewById(R.id.v23);
		tab24 = (TableRow) view.findViewById(R.id.v24);
		tab31 = (TableRow) view.findViewById(R.id.v31);
		tab32 = (TableRow) view.findViewById(R.id.v32);

		collapse.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!flag) {
					tab11.setVisibility(View.GONE);
					tab12.setVisibility(View.GONE);
					tab13.setVisibility(View.GONE);
					tab14.setVisibility(View.GONE);
					tab21.setVisibility(View.GONE);
					tab22.setVisibility(View.GONE);
					tab23.setVisibility(View.GONE);
					tab24.setVisibility(View.GONE);
					tab31.setVisibility(View.GONE);
					tab32.setVisibility(View.GONE);
					v.setBackgroundResource(R.drawable.batterytopbtnopen);
					flag =true;
				} else {
					tab11.setVisibility(View.VISIBLE);
					tab12.setVisibility(View.VISIBLE);
					tab13.setVisibility(View.VISIBLE);
					tab14.setVisibility(View.VISIBLE);
					tab21.setVisibility(View.VISIBLE);
					tab22.setVisibility(View.VISIBLE);
					tab23.setVisibility(View.VISIBLE);
					tab24.setVisibility(View.VISIBLE);
					tab31.setVisibility(View.VISIBLE);
					tab32.setVisibility(View.VISIBLE);
					v.setBackgroundResource(R.drawable.batterytopbtnclose);
					flag =false;
				}
				
			}
		});

		return view;
	}
}
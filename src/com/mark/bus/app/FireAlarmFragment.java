package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mark.bus.R;
import com.mark.bus.data.DataFromFireAlarmSensor;
import com.mark.bus.data.DataHandler1;

public class FireAlarmFragment extends Fragment {

	private View view;

	private TextView iv_status1;
	private TextView iv_status2;
	private TextView iv_status3;
	private TextView iv_status4;
	private TextView iv_status5;
	private TextView iv_status6;
	private TextView iv_status7;
	private TextView iv_status8;

	private TextView iv_issue1;
	private TextView iv_issue2;
	private TextView iv_issue3;
	private TextView iv_issue4;
	private TextView iv_issue5;
	private TextView iv_issue6;
	private TextView iv_issue7;
	private TextView iv_issue8;

	private TextView iv_block1;
	private TextView iv_block2;
	private TextView iv_block3;
	private TextView iv_block4;
	private TextView iv_block5;
	private TextView iv_block6;
	private TextView iv_block7;
	private TextView iv_block8;

	private TextView iv_communacation1;
	private TextView iv_communacation2;
	private TextView iv_communacation3;
	private TextView iv_communacation4;
	private TextView iv_communacation5;
	private TextView iv_communacation6;
	private TextView iv_communacation7;
	private TextView iv_communacation8;
	private int[] status = new int[8];

	public void initialize() {

		for (int i = 0; i < 8; i++) {
			status[i] = 0;
		}
		
		
		DataFromFireAlarmSensor dfa = DataHandler1.dfa;
		iv_status1 = (TextView) view.findViewById(R.id.status1);
		iv_status2 = (TextView) view.findViewById(R.id.status2);
		iv_status3 = (TextView) view.findViewById(R.id.status3);
		iv_status4 = (TextView) view.findViewById(R.id.status4);
		iv_status5 = (TextView) view.findViewById(R.id.status5);
		iv_status6 = (TextView) view.findViewById(R.id.status6);
		iv_status7 = (TextView) view.findViewById(R.id.status7);
		iv_status8 = (TextView) view.findViewById(R.id.status8);

		iv_issue1 = (TextView) view.findViewById(R.id.issue1);
		iv_issue2 = (TextView) view.findViewById(R.id.issue2);
		iv_issue3 = (TextView) view.findViewById(R.id.issue3);
		iv_issue4 = (TextView) view.findViewById(R.id.issue4);
		iv_issue5 = (TextView) view.findViewById(R.id.issue5);
		iv_issue6 = (TextView) view.findViewById(R.id.issue6);
		iv_issue7 = (TextView) view.findViewById(R.id.issue7);
		iv_issue8 = (TextView) view.findViewById(R.id.issue8);

		iv_block1 = (TextView) view.findViewById(R.id.block1);
		iv_block2 = (TextView) view.findViewById(R.id.block2);
		iv_block3 = (TextView) view.findViewById(R.id.block3);
		iv_block4 = (TextView) view.findViewById(R.id.block4);
		iv_block5 = (TextView) view.findViewById(R.id.block5);
		iv_block6 = (TextView) view.findViewById(R.id.block6);
		iv_block7 = (TextView) view.findViewById(R.id.block7);
		iv_block8 = (TextView) view.findViewById(R.id.block8);

		iv_communacation1 = (TextView) view.findViewById(R.id.communacation1);
		iv_communacation2 = (TextView) view.findViewById(R.id.communacation2);
		iv_communacation3 = (TextView) view.findViewById(R.id.communacation3);
		iv_communacation4 = (TextView) view.findViewById(R.id.communacation4);
		iv_communacation5 = (TextView) view.findViewById(R.id.communacation5);
		iv_communacation6 = (TextView) view.findViewById(R.id.communacation6);
		iv_communacation7 = (TextView) view.findViewById(R.id.communacation7);
		iv_communacation8 = (TextView) view.findViewById(R.id.communacation8);

		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.fire_alarm_fragment, container, false);
		initialize();
		return view;
	}
}
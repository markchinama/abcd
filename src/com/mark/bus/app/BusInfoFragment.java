package com.mark.bus.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import com.mark.bus.R;
import com.mark.bus.app.ButtonsFragment.lightListener;

public class BusInfoFragment extends Fragment {
	private ListView listview;

	// TODO Auto-generated constructor stub
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bus_info_fragment, container,
				false);

		List data = InfoList.getDataList();
		BLAdapter adapter = new BLAdapter(this,view,data);
		listview = (ListView) view.findViewById(R.id.listv);
		listview.setAdapter(adapter);
		listview = (ListView) view.findViewById(R.id.listv);
		
		return view;
	}

}

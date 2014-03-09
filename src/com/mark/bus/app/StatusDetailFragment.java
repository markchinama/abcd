package com.mark.bus.app;

import com.mark.bus.app.MyView;
import com.mark.bus.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatusDetailFragment extends Fragment {

	private MyView mTestSurfaceView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_status, container,
				false);

		mTestSurfaceView = new MyView(this.getActivity(), null);

		return rootView;
	}
}

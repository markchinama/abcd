package com.mark.bus.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mark.bus.R;

public class CrashCheckFragment extends Fragment {

	private int status;

	public CrashCheckFragment(int status) {
		super();
		this.status = status;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		int id = status == 1 ? R.layout.crash_check_fragment01
				: R.layout.crash_check_fragment02;
		return inflater.inflate(id, container, false);

	}
}
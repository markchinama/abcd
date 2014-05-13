package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;

import com.mark.bus.R;

public class BusCanFragment extends Fragment {
	private final int DOUBLE_TAP_TIMEOUT = 200;
	private MotionEvent mCurrentDownEvent;
	private MotionEvent mPreviousUpEvent;
	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.bus_can_fragment, container, false);
		OnTouchListener mTouchListener = new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					if (mPreviousUpEvent != null
							&& mCurrentDownEvent != null
							&& isConsideredDoubleTap(mCurrentDownEvent,
									mPreviousUpEvent, event)) {

						Intent intent = new Intent(view.getContext(),
								BusCanActivity.class);

						view.getContext().startActivity(intent);

					}
					mCurrentDownEvent = MotionEvent.obtain(event);
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mPreviousUpEvent = MotionEvent.obtain(event);
				}
				return true;
			}

			private boolean isConsideredDoubleTap(MotionEvent firstDown,
					MotionEvent firstUp, MotionEvent secondDown) {
				if (secondDown.getEventTime() - firstUp.getEventTime() > DOUBLE_TAP_TIMEOUT) {
					return false;
				}
				int deltaX = (int) firstUp.getX() - (int) secondDown.getX();
				int deltaY = (int) firstUp.getY() - (int) secondDown.getY();
				return deltaX * deltaX + deltaY * deltaY < 10000;
			}
		};

		view.setOnTouchListener(mTouchListener);
		return view;

	}
}
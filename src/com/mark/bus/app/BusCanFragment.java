package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.R.raw;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

import com.mark.bus.R;
import com.mark.bus.data.DataFromBusCanModule;
import com.mark.bus.data.DataHandler1;

public class BusCanFragment extends Fragment {
	private final int DOUBLE_TAP_TIMEOUT = 200;
	private MotionEvent mCurrentDownEvent;
	private MotionEvent mPreviousUpEvent;
	private View view;

	private ImageView iv_qianmentabudeng;
	private ImageView iv_zuoxinglicangzhaomingdeng;
	private ImageView iv_houwudeng;
	private ImageView iv_yuanguangdeng;
	private ImageView iv_youxinglicangzhaomingdeng;
	private ImageView iv_zhidongdeng;
	private ImageView iv_qianwudeng;
	private ImageView iv_zhongmentabudeng;
	private ImageView iv_daochedeng;
	private ImageView iv_jinguangdeng;
	private ImageView iv_weishengjianyourenzhishideng;
	private ImageView iv_gaoyacangdeng;
	private ImageView iv_qianmenkaidiancifa;
	private ImageView iv_dianshijidianyuan;
	private ImageView iv_qidongjidianqi;
	private ImageView iv_qianmenguandiancifa;
	private ImageView iv_zhongmenguanmendiancifa;
	private ImageView iv_weishengjianqiangzhipaiwufa;
	private ImageView iv_penshuidianji;
	private ImageView iv_zhongmenkaimendiancifa;
	private ImageView iv_nuanshuidiancifa;
	private ImageView iv_qilaba;
	private ImageView iv_lupaideng;
	private ImageView iv_lupaidianyuan;
	
	
	
	public void initialize() {
		DataFromBusCanModule dbcm = DataHandler1.dbcm;
	}

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
		initialize();
		return view;

	}
}
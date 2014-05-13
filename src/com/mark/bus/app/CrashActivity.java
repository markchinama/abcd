package com.mark.bus.app;

import com.mark.bus.R;
import com.mark.bus.app.MainActivity.CrashHandler;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class CrashActivity extends FragmentActivity {

	private ImageButton closeBtn;

	private ImageButton protectbtn;

	private CrashHandler crashHandler = null;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.crash_activity);
		closeBtn = (ImageButton) this.findViewById(R.id.crash_closebtn);
		protectbtn = (ImageButton) this.findViewById(R.id.protectbtn);
		closeBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

			}
		});

		protectbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				BusApplication ba = (BusApplication) CrashActivity.this
						.getApplication();
				ba.setCrashStatus(2);
				ba.getCrashHandler().sendEmptyMessage(1);

				finish();

			}
		});

		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 1.0f;


		wl.x = 0;
		wl.y = -5;
		wl.width = 500;
		wl.height = 600;
		window.setAttributes(wl);

	}

}

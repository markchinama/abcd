package com.mark.bus.app;

import com.mark.bus.R;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BatteryManagementActivity extends FragmentActivity {

	private ImageButton closeBtn;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.battery_management_activity);
		closeBtn = (ImageButton) this.findViewById(R.id.bma_closebtn);

		closeBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
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

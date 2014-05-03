package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class WholeActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.whole_activity);

		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 1.0f;// 设置透明度,0.0为完全透明，1.0为完全不透明

		Point point = new Point();
		getWindowManager().getDefaultDisplay().getSize(point);
		
		wl.x = 0;
		wl.y = -5;
		wl.width = point.x;
		wl.height = point.y - 200;
		window.setAttributes(wl);

	}

}

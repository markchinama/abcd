package com.mark.bus.app;

import com.mark.bus.R;
import com.mark.bus.app.MainActivity.ModelHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class ACModelActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.ac_model_activity);
		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 0.9f;// 设置透明度,0.0为完全透明，1.0为完全不透明
		wl.x = 80;
		wl.y = 300;
		wl.width =250;
		wl.height=150;
		window.setAttributes(wl);
	}

}

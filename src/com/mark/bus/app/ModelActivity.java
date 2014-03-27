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

public class ModelActivity extends Activity {

	private ImageButton ecoModelButton;
	private ImageButton normalModelButton;
	private ImageButton powerModelButton;
	private ImageButton snowModelButton;
	BusApplication ba = null;
	ModelHandler mHandler = null;

	int[] source = { R.drawable.eco_model_btn,
			R.drawable.eco_model_btn_selected, R.drawable.normal_model_btn,
			R.drawable.normal_model_btn_selectd, R.drawable.power_model_btn,
			R.drawable.power_model_btn_selected, R.drawable.snow_model_btn,
			R.drawable.snow_model_btn_selectd };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.model_activity);
		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 0.9f;// 设置透明度,0.0为完全透明，1.0为完全不透明
		wl.x = -180;
		wl.y = -250;
		window.setAttributes(wl);
		ecoModelButton = (ImageButton) findViewById(R.id.ecomodelbutton);
		normalModelButton = (ImageButton) findViewById(R.id.normalmodelbutton);
		powerModelButton = (ImageButton) findViewById(R.id.powermodelbutton);
		snowModelButton = (ImageButton) findViewById(R.id.snowmodelbutton);

		ecoModelButton.setOnTouchListener(new ModelButtonClickListner(0));
		normalModelButton.setOnTouchListener(new ModelButtonClickListner(1));
		powerModelButton.setOnTouchListener(new ModelButtonClickListner(2));
		snowModelButton.setOnTouchListener(new ModelButtonClickListner(3));
	}

	class ModelButtonClickListner implements OnTouchListener {

		private int btnId;

		ModelButtonClickListner(int id) {
			this.btnId = id;
		}

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == MotionEvent.ACTION_DOWN) {
				v.setBackgroundResource(source[btnId * 2 + 1]);
			} else if (event.getAction() == MotionEvent.ACTION_UP) {
				v.setBackgroundResource(source[btnId * 2]);
				ba = (BusApplication) getApplication();
				mHandler = ba.getHandler();
				mHandler.sendEmptyMessage(btnId);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				finish();
			}
			return false;
		}

	}
}

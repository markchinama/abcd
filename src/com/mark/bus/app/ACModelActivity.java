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
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ACModelActivity extends Activity {

	private SeekBar loopSeekBar, modeSeekBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.ac_model_activity);
		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 1.0f;// 设置透明度,0.0为完全透明，1.0为完全不透明
		wl.x = 80;
		wl.y = 300;
		wl.width = 250;
		wl.height = 150;
		window.setAttributes(wl);
		loopSeekBar = (SeekBar) this.findViewById(R.id.loop_seekBar);
		modeSeekBar = (SeekBar) this.findViewById(R.id.seekBar);
		loopSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				int seekProgress = seekBar.getProgress();
				if (seekProgress < 50)
					seekBar.setProgress(8);
				else
					seekBar.setProgress(93);
			}

		});
		modeSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				int seekProgress = seekBar.getProgress();
				if (seekProgress <= 30)
					seekBar.setProgress(8);
				else if (seekProgress > 75)
					seekBar.setProgress(93);
				else
					seekBar.setProgress(50);
			}

		});
	}

}

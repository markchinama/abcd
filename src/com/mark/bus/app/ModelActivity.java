package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class ModelActivity extends Activity {

	private ImageButton ecomodelbutton;

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
		ecomodelbutton = (ImageButton) this.findViewById(R.id.ecomodelbutton);
		ecomodelbutton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

			}
		});

	}

}

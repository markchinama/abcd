package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class DataSettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.setting_activity);
	}

}

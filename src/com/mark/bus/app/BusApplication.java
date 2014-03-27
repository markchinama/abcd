package com.mark.bus.app;

import java.util.Map;

import com.mark.bus.app.MainActivity.ModelHandler;

import android.app.Application;


public class BusApplication extends Application {

	private ModelHandler modelhandler = null;

	// set方法
	public void setHandler(ModelHandler m) {
		this.modelhandler = m;
	}

	// get方法
	public ModelHandler getHandler() {
		return modelhandler;
	}

}

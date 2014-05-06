package com.mark.bus.app;

import java.util.Map;

import com.mark.bus.app.MainActivity.CrashHandler;
import com.mark.bus.app.MainActivity.ModelHandler;

import android.app.Application;

public class BusApplication extends Application {

	private ModelHandler modelhandler = null;

	private CrashHandler crashHandler = null;
	
	public CrashHandler getCrashHandler() {
		return crashHandler;
	}

	public void setCrashHandler(CrashHandler crashHandler) {
		this.crashHandler = crashHandler;
	}

	private int[] buttonStatus = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	private String crashTime = "";
	private int crashStatus = 0; // 1 not crash 2 protect 3 crash

	public String getCrashTime() {
		return crashTime;
	}

	public void setCrashTime(String crashTime) {
		this.crashTime = crashTime;
	}

	public int getCrashStatus() {
		return crashStatus;
	}

	public void setCrashStatus(int crashStatus) {
		this.crashStatus = crashStatus;
	}

	public int[] getButtonStatus() {
		return buttonStatus;
	}

	public void setButtonStatus(int[] buttonStatus) {
		this.buttonStatus = buttonStatus;
	}

	// set方法
	public void setHandler(ModelHandler m) {
		this.modelhandler = m;
	}

	// get方法
	public ModelHandler getHandler() {
		return modelhandler;
	}

}

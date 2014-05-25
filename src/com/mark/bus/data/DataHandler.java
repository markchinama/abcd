package com.mark.bus.data;

public class DataHandler {
	static {
		System.loadLibrary("candata");
		initialize();
	}

	public int getInt(int a) {
		System.out.println(a);
		return plus(a);
	}

	public void setDw1(int i) {
		System.out.println(i);
	}

	public native int plus(int i);

	public static native void initialize();

}

package com.mark.bus.core;

public interface Model {

	public enum LoadType {
		Local, Network, LocalAndNetwork
	};

	void load(LoadType loadType, Object param);

	/**
	 * 得到处理结果
	 * 
	 * @return
	 */
	public Object getProcessData();

	public int getModelId();

	public void cancelLoad(Object tag);

	public boolean isLoading();

	public void onLoadingStart();

	public void onLoadingEnd();

}

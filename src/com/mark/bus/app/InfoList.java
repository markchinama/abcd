package com.mark.bus.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoList {
	private static List data = null;

	// TODO Auto-generated constructor stub

	public static List<String> getDataList() {

		if (data != null)
			return data;
        data = new ArrayList();
		data.add("整车控制器");
		data.add("电机控制器");
		data.add("电池管理系统");
		data.add("烟雾报警器");
		data.add("绝缘检测");
		data.add("一体化配电柜");
		data.add("车身CAN");
		data.add("碰撞检测模块");

		return data;
	}

}

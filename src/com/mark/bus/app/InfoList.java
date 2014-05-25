package com.mark.bus.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mark.bus.R;

public class InfoList {
	private static List data = null;

	// TODO Auto-generated constructor stub

	public static List<Integer> getDataList() {

		if (data != null)
			return data;
        data = new ArrayList();
        data.add(R.string.zhengchekongzhiqi);
		data.add(R.string.dianjikongzhiqi);
		data.add(R.string.dianchiguanlixitong);
		data.add(R.string.yanwubaojingqi);
		data.add(R.string.jueyuanjiance);
		data.add(R.string.yitihuapeidiangui);
		data.add(R.string.cheshencan);
		data.add(R.string.pengzhuangjiancemokuai);

		return data;
	}

}

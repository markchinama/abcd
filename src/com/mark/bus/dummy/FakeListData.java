package com.mark.bus.dummy;

import java.util.Arrays;
import java.util.List;

import com.mark.bus.R;
import com.mark.bus.listable.dto.ListItemDTO;

public class FakeListData {

	public static List<ListItemDTO> getData() {
		return Arrays.asList(new ListItemDTO(1, R.drawable.temp_info, "整车信息"),
				new ListItemDTO(2, R.drawable.temp_transmission, "车身控制"),
				new ListItemDTO(3, R.drawable.temp_camera, "视频监控"),
				new ListItemDTO(4, R.drawable.temp_system_monitor, "故障诊断"));

	}

}

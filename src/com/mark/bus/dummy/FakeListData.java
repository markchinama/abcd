package com.mark.bus.dummy;

import java.util.Arrays;
import java.util.List;

import com.mark.bus.R;
import com.mark.bus.listable.dto.ListItemDTO;

public class FakeListData {
	
	public static List<ListItemDTO> getData(){
		return Arrays.asList(
				new ListItemDTO(1, R.drawable.temp_kim_yongii, "整车信息"),
				new ListItemDTO(2, R.drawable.temp_kim_yongii, "车身控制"),
				new ListItemDTO(3, R.drawable.temp_kim_yongii, "视频监控"),
				new ListItemDTO(4, R.drawable.temp_kim_yongii, "故障诊断")
				);

		
	}

}

package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mark.bus.R;
import com.mark.bus.data.DataFromIntegrationCabin;
import com.mark.bus.data.DataHandler1;

public class IntegrationCabinetFragment extends Fragment {

	private View view;
	private ImageView iv_chushuangjijidianqishuchuzhuangtai;
	private ImageView iv_kongtiaojidianqishuchuzhuangtai;
	private ImageView iv_zongfugaoyabaoxianzhuangtai;
	private ImageView iv_zongzhenggaoyabaoxianzhuangtai;
	private ImageView iv_chongdianjidianqishuchuzhuangtai;
	private ImageView iv_chongdianjidianqifankuizhuangtai;
	private ImageView iv_zongdianyuanjiechuqifankuizhuangtai;
	private ImageView iv_zongdianyuanjiechuqishuchuzhuangtai;
	private ImageView iv_zhujiechuqifankuizhangtai;
	private ImageView iv_zhujiechuqishuchuzhuangtai;
	private ImageView iv_zongdianyuanyuchongdianjiechuqifankuizhuangtai;
	private ImageView iv_zongdianyuanyuchongdianjiechuqishuchuzhuangtai;
	private ImageView iv_yuchongdianjiechuqifankuizhuangtai;
	private ImageView iv_yuchongdianjiechuqishuchuzhuangtai;

	public void initialize() {

		DataFromIntegrationCabin dic = DataHandler1.dic;
		iv_chushuangjijidianqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_chushuangjidianqishuchuzhuangtai);
		if (dic.chushuangjidianqishuchuzhuangtai == 1)
			iv_chushuangjijidianqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_kongtiaojidianqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_kongtiaojidianqishuchuzhuangtai);
		if (dic.chushuangjidianqifankuizhuangtai == 1)
			iv_kongtiaojidianqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		// ////////////////////////////////////////
		iv_zongfugaoyabaoxianzhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongfugaoyabaoxianzhuangtai);

		iv_zongzhenggaoyabaoxianzhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongzhenggaoyabaoxianzhuangtai);
		// /////////////////////////////////////////////
		iv_chongdianjidianqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_chongdianjidianqishuchuzhuangtai);
		if (dic.chongdianjidianqishuchuzhuangtai == 1)
			iv_chongdianjidianqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_chongdianjidianqifankuizhuangtai = (ImageView) view
				.findViewById(R.id.inc_chongdianjidianqifankuizhuangtai);
		if (dic.chongdianjidianqifankuizhuangtai == 1)
			iv_chongdianjidianqifankuizhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_zongdianyuanjiechuqifankuizhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongdianyuanjiechuqifankuizhuangtai);
		if (dic.zongdianyuanjiechuqifankuizhuangtai == 1)
			iv_zongdianyuanjiechuqifankuizhuangtai
					.setBackgroundResource(R.drawable.onstatus);

		iv_zongdianyuanjiechuqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongdianyuanjiechuqishuchuzhuangtai);
		if (dic.zongdianyuanjiechuqishuchuzhuangtai == 1)
			iv_zongdianyuanjiechuqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);

		iv_zhujiechuqifankuizhangtai = (ImageView) view
				.findViewById(R.id.inc_zhujiechuqifankuizhuangtai);
		if (dic.zhujiechuqifankuizhuangtai == 1)
			iv_zhujiechuqifankuizhangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_zhujiechuqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_zhujiechuqishuchuzhuangtai);
		if (dic.zhujiechuqishuchuzhuangtai == 1)
			iv_zhujiechuqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_zongdianyuanyuchongdianjiechuqifankuizhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongdianyuanyuchongdianjiechuqifankuizhuangtai);
		if (dic.zongdianyuanyujiechuqifankuizhuangtai == 1)
			iv_zongdianyuanyuchongdianjiechuqifankuizhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_zongdianyuanyuchongdianjiechuqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_zongdianyuanyuchongdianjiechuqishuchuzhuangtai);
		if (dic.zongdianyuanjiechuqishuchuzhuangtai == 1)
			iv_zongdianyuanyuchongdianjiechuqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);

		iv_yuchongdianjiechuqifankuizhuangtai = (ImageView) view
				.findViewById(R.id.inc_yuchongdianjiechuqifankuizhuangtai);
		if (dic.yuchongdianjiechuqifankuizhuangtai == 1)
			iv_yuchongdianjiechuqifankuizhuangtai
					.setBackgroundResource(R.drawable.onstatus);
		iv_yuchongdianjiechuqishuchuzhuangtai = (ImageView) view
				.findViewById(R.id.inc_yuchongdianjiechuqishuchuzhuangtai);
		if (dic.yuchongdianjiechuqishuchuzhuangtai == 1)
			iv_yuchongdianjiechuqishuchuzhuangtai
					.setBackgroundResource(R.drawable.onstatus);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.integration_cabinet_fragment,
				container, false);
		initialize();
		return view;
	}
}
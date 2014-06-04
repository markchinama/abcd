package com.mark.bus.app;

import com.mark.bus.R;
import com.mark.bus.data.DataFromWholeController1;
import com.mark.bus.data.DataFromWholeController2;
import com.mark.bus.data.DataFromWholeController3;
import com.mark.bus.data.DataFromWholeController8;
import com.mark.bus.data.DataFromWholeController9;
import com.mark.bus.data.DataHandler1;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class WholeActivity extends FragmentActivity {

	private ImageButton closeBtn;

	private TextView tv_chesu;
	private TextView tv_dangwei;
	private TextView tv_shache;
	private TextView tv_youmen;

	private ImageView iv_dianzhidong;
	private ImageView iv_dianjizhidongyouxianxinhao;
	private ImageView iv_zhuchexinhao;
	private ImageView iv_zhidongxinhao;
	private ImageView iv_yisukaiguan;

	private ImageView iv_zhujiechuqizhuangtai;
	private ImageView iv_gaoyashouzhaxinhao;
	private ImageView iv_yaoshiacc;
	private ImageView iv_yaoshion;
	private ImageView iv_yaoshist;
	private ImageView iv_ready;

	private ImageView iv_kongtiaoqidong;
	private ImageView iv_kongtiaogongzuoshineng;
	private ImageView iv_kongtiaogonglvshuaijianshineng;
	private ImageView iv_shuibengqidong;

	private TextView tv_zhengcheqiya;
	private TextView tv_shengyuchongdianshijian;
	private TextView tv_fandianjifadiangonglv;
	private TextView tv_zhuansuzhuanjumoshi;
	private TextView tv_zhuandongfangxiang;
	private TextView tv_dianjiniujuminglingzhi;
	private TextView tv_kongtiaoshuaijianbili;
	private TextView tv_bencixingshilicheng;
	private TextView tv_kexingshilicheng;
	private TextView tv_zonglicheng;

	public void initialize() {
		DataFromWholeController3 dw3 = DataHandler1.dw3;
		DataFromWholeController1 dw1 = DataHandler1.dw1;
		DataFromWholeController2 dw2 = DataHandler1.dw2;
		DataFromWholeController8 dw8 = DataHandler1.dw8;
		DataFromWholeController9 dw9 = DataHandler1.dw9;
		tv_chesu = (TextView) this.findViewById(R.id.wc_chesu);
		tv_chesu.setText(Float.toString(dw3.shishichesu));

		tv_dangwei = (TextView) this.findViewById(R.id.wc_dangwei);
		if (dw1.daodangxinhao == 1)
			tv_dangwei.setText("R");
		else if (dw1.qianjindangkaiguan == 1)
			tv_dangwei.setText("D");
		else if (dw1.kongdangkaiguan == 1)
			tv_dangwei.setText("N");

		tv_shache = (TextView) this.findViewById(R.id.wc_shache);
		tv_shache.setText(Float.toString(dw2.zhidongmonixihao));

		tv_youmen = (TextView) this.findViewById(R.id.wc_youmen);
		tv_youmen.setText(Float.toString(dw2.youmenmonixihao));

		iv_dianzhidong = (ImageView) this.findViewById(R.id.wc_dianzhidong);
		if (dw1.dianzhidongyouxiaoxinhao == 1) {
			iv_dianzhidong.setBackgroundResource(R.drawable.onstatus);
		}

		iv_dianjizhidongyouxianxinhao = (ImageView) this
				.findViewById(R.id.wc_dianjizhidongyouxianxinhao);
		if (dw1.dianjizhidongyouxianxinhao == 1) {
			iv_dianjizhidongyouxianxinhao
					.setBackgroundResource(R.drawable.onstatus);
		}
		iv_zhuchexinhao = (ImageView) this.findViewById(R.id.wc_zhuchexinhao);
		if (dw1.zhuchexinhao == 1)
			iv_zhuchexinhao.setBackgroundResource(R.drawable.onstatus);
		iv_zhidongxinhao = (ImageView) this
				.findViewById(R.id.wc_zhidongxinhao1);
		if (dw1.zhidongkaiguan == 1)
			iv_zhidongxinhao.setBackgroundResource(R.drawable.onstatus);
		iv_yisukaiguan = (ImageView) this.findViewById(R.id.wc_yisukaiguan);
		if (dw1.yisukaiguan == 1)
			iv_yisukaiguan.setBackgroundResource(R.drawable.onstatus);
		iv_zhujiechuqizhuangtai = (ImageView) this
				.findViewById(R.id.wc_zhujiechuqizhuangtai);
		if (dw1.zhujiechuqizhuangtai == 1)
			iv_zhujiechuqizhuangtai.setBackgroundResource(R.drawable.onstatus);
		iv_gaoyashouzhaxinhao = (ImageView) this
				.findViewById(R.id.wc_gaoyashouzhaxinhao1);
		// //////////////////////////////////////////////////////
		if (dw1.gaoyaqiaobanbihexinhao == 1)
			iv_gaoyashouzhaxinhao.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshiacc = (ImageView) this.findViewById(R.id.wc_yaoshiacc);
		if (dw1.yaoshiaccxinhao == 1)
			iv_yaoshiacc.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshion = (ImageView) this.findViewById(R.id.wc_yaoshion);
		if (dw1.yaoshionxinhao == 1)
			iv_yaoshion.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshist = (ImageView) this.findViewById(R.id.wc_yaoshist);
		if (dw1.yaoshistxinhao == 1)
			iv_yaoshist.setBackgroundResource(R.drawable.onstatus);
		iv_ready = (ImageView) this.findViewById(R.id.wc_ready);
		if (dw2.zhengchexitongzhengchangzhishixinhao == 1)
			iv_ready.setBackgroundResource(R.drawable.onstatus);
		iv_kongtiaoqidong = (ImageView) this
				.findViewById(R.id.wc_kongtiaoqidong1);

		if (dw1.kongtiaoqidongxinhao == 1)
			iv_kongtiaoqidong.setBackgroundResource(R.drawable.onstatus);
		// //////////////////
		iv_kongtiaogongzuoshineng = (ImageView) this
				.findViewById(R.id.wc_kongtiaogongzuoshineng);
		// ////////////////////////////
		iv_kongtiaogonglvshuaijianshineng = (ImageView) this
				.findViewById(R.id.wc_kongtiaogonglvshuaijianshineng);

		iv_shuibengqidong = (ImageView) this
				.findViewById(R.id.wc_shuibengqidong1);
		if (dw1.shuibengkongzhixinhao == 1)
			iv_shuibengqidong.setBackgroundResource(R.drawable.onstatus);

		tv_zhengcheqiya = (TextView) this.findViewById(R.id.wc_zhengcheqiyazhi);
		tv_zhengcheqiya.setText(Float.toString(dw1.zhengcheqiya));
		tv_shengyuchongdianshijian = (TextView) this
				.findViewById(R.id.wc_shengyuchongdianshijian);
		tv_shengyuchongdianshijian.setText(dw9.shengyuchongdianshijian);
		tv_fandianjifadiangonglv = (TextView) this
				.findViewById(R.id.wc_fandianjifadiangonglv);
		// /////////////////////////////////////////////tv_fandianjifadiangonglv.setText(dw2.)
		tv_zhuansuzhuanjumoshi = (TextView) this
				.findViewById(R.id.wc_zhuansuzhuanjumoshi);
		if (dw1.zhuanjumoshi == 1) {
			tv_zhuansuzhuanjumoshi.setText((CharSequence) this.getResources()
					.getString(R.string.zhuansumoshi));
		} else {
			tv_zhuansuzhuanjumoshi.setText((CharSequence) this.getResources()
					.getString(R.string.zhuanjumoshi));
		}

		tv_zhuandongfangxiang = (TextView) this
				.findViewById(R.id.wc_zhuandongfangxiang);
		if (dw1.zhuanjufangxiang == 0) {
			tv_zhuandongfangxiang.setText((CharSequence) this.getResources()
					.getString(R.string.tingzhi));
		} else if (dw1.zhuanjufangxiang == 3) {
			tv_zhuandongfangxiang.setText((CharSequence) this.getResources()
					.getString(R.string.kongzhuan));
		} else if (dw1.zhuanjufangxiang == 1) {
			if (dw1.zhuanjumoshi == 1) {
				tv_zhuandongfangxiang.setText((CharSequence) this
						.getResources().getString(R.string.zhengxiangzhuansu));
			} else {
				tv_zhuandongfangxiang.setText((CharSequence) this
						.getResources().getString(R.string.zhengxiangzhuanju));
			}

		} else if (dw1.zhuanjufangxiang == 2) {
			if (dw1.zhuanjumoshi == 1) {
				tv_zhuandongfangxiang.setText((CharSequence) this
						.getResources().getString(R.string.fanxiangzhuansu));
			} else {
				tv_zhuandongfangxiang.setText((CharSequence) this
						.getResources().getString(R.string.fanxiangzhuanju));
			}
		}
		tv_dianjiniujuminglingzhi = (TextView) this
				.findViewById(R.id.wc_dianjiniujuminglingzhi);
		tv_dianjiniujuminglingzhi.setText((CharSequence) Float
				.toString(dw1.dianjiniuju));
		tv_kongtiaoshuaijianbili = (TextView) this
				.findViewById(R.id.wc_kongtiaoshuaijianbili);
		tv_bencixingshilicheng = (TextView) this
				.findViewById(R.id.wc_bencixingshilicheng);
		tv_bencixingshilicheng.setText((CharSequence) Float
				.toString(dw8.bencixingshilicheng));
		tv_kexingshilicheng = (TextView) this
				.findViewById(R.id.wc_kexingshilicheng);
		tv_kexingshilicheng.setText((CharSequence) Float
				.toString(dw8.kexingshilicheng));
		tv_zonglicheng = (TextView) this.findViewById(R.id.wc_zonglicheng);
		tv_zonglicheng.setText((CharSequence) Float.toString(dw8.zonglicheng));

	}

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.whole_activity);
		closeBtn = (ImageButton) this.findViewById(R.id.closebtn);

		closeBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

			}
		});

		Window window = getWindow();
		WindowManager.LayoutParams wl = window.getAttributes();
		wl.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		wl.alpha = 1.0f;

		wl.x = 0;
		wl.y = -5;
		wl.width = 500;
		wl.height = 600;
		window.setAttributes(wl);

		initialize();
	}

}

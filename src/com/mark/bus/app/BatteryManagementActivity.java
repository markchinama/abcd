package com.mark.bus.app;

import com.mark.bus.R;
import com.mark.bus.data.DataFromBMS1;
import com.mark.bus.data.DataFromBMS2;
import com.mark.bus.data.DataFromBMS3;
import com.mark.bus.data.DataHandler1;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class BatteryManagementActivity extends FragmentActivity {

	private ImageButton closeBtn;

	private TextView tv_dianchizongdianya;
	private TextView tv_dianchisoc;
	private TextView tv_dianchizongxiangshu;
	private TextView tv_shengyunengliang;
	private TextView tv_shunshigonglv;
	private TextView tv_shunshigonghao;
	private TextView tv_dianchichongfangdiandianliu;
	private TextView tv_mokuaizuigaowendu;
	private TextView tv_mokuaizuidiwendu;
	private TextView tv_zuigaowendudianchiweizhi;
	private TextView tv_zuidiwendudianchiweizhi;
	private TextView tv_dantizuigaodianya;
	private TextView tv_dantizuididianya;
	private TextView tv_zuigaodianyadianchiweizhi;
	private TextView tv_zuididianyadianchiweizhi;
	private TextView tv_zuigaodianyadianchixiangjieshu;
	private TextView tv_zuididianyadianchixiangjieshu;
	private TextView tv_chongdianzhuanglianjiebiaozhiwei;
	private TextView tv_jinzhichongdianbiaozhi;

	public void initialize() {
		DataFromBMS1 db1 = DataHandler1.db1;
		DataFromBMS2 db2 = DataHandler1.db2;
		DataFromBMS3 db3 = DataHandler1.db3;
		tv_dianchizongdianya = (TextView) this
				.findViewById(R.id.bma_dianchizongdianya);
		tv_dianchizongdianya.setText((CharSequence) Float
				.toString(db1.dianchixitongshishizongdianya));

		tv_dianchisoc = (TextView) this.findViewById(R.id.bma_dianchisoc);
		tv_dianchizongdianya.setText((CharSequence) Float
				.toString(db1.dianchisoc));

		tv_dianchizongxiangshu = (TextView) this
				.findViewById(R.id.bma_dianchizongxiangshu);
		tv_dianchizongxiangshu.setText((CharSequence) Integer
				.toString(db2.dianchizongxiangshu));

		tv_shengyunengliang = (TextView) this
				.findViewById(R.id.bma_shengyunengliang);
		tv_shengyunengliang.setText((CharSequence) Float
				.toString(db3.shengyunengliang));

		tv_shunshigonglv = (TextView) this.findViewById(R.id.bma_shunshigonglv);
		tv_shunshigonghao = (TextView) this
				.findViewById(R.id.bma_shunshigonghao);

		tv_dianchichongfangdiandianliu = (TextView) this
				.findViewById(R.id.bma_dianchichongfangdiandianliu);
		tv_dianchichongfangdiandianliu.setText((CharSequence) Float
				.toString(db1.dianchishishidianliu));
		// ////////////////////////////////////////////////
		tv_mokuaizuigaowendu = (TextView) this
				.findViewById(R.id.bma_mokuaizuigaowendu);

		tv_mokuaizuidiwendu = (TextView) this
				.findViewById(R.id.bma_mokuaizuidiwendu);
		// /////////////////////////////////////////////////
		tv_zuigaowendudianchiweizhi = (TextView) this
				.findViewById(R.id.bma_zuigaowendudianchixiangweizhi);
		tv_zuigaowendudianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuigaowendudianchiweizhi));

		tv_zuidiwendudianchiweizhi = (TextView) this
				.findViewById(R.id.bma_zuidiwendudianchixiangweizhi);
		tv_zuidiwendudianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuidiwendudianchiweizhi));

		// /////////////////////////////////////////////////
		tv_dantizuigaodianya = (TextView) this
				.findViewById(R.id.bma_dantizuigaodianya);

		tv_dantizuididianya = (TextView) this
				.findViewById(R.id.bma_dantizuididianya);

		// /////////////////////////////////////////////////

		tv_zuigaodianyadianchiweizhi = (TextView) this
				.findViewById(R.id.bma_zuigaodianyadianchixiangweizhi);
		tv_zuigaodianyadianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchiweizhi));

		tv_zuididianyadianchiweizhi = (TextView) this
				.findViewById(R.id.bma_zuididianyadianchixiangweizhi);
		tv_zuididianyadianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuididianyadianchiweizhi));

		tv_zuigaodianyadianchixiangjieshu = (TextView) this
				.findViewById(R.id.bma_zuigaodianyadianchixiangjieshu);
		tv_zuigaodianyadianchixiangjieshu.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchixiangshu));

		tv_zuididianyadianchixiangjieshu = (TextView) this
				.findViewById(R.id.bma_zuididianyadianchixiangjieshu);
		tv_zuididianyadianchixiangjieshu.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchixiangshu));

		tv_chongdianzhuanglianjiebiaozhiwei = (TextView) this
				.findViewById(R.id.bma_chongdianzhuanglianjiebiaozhiwei);
		tv_chongdianzhuanglianjiebiaozhiwei.setText((CharSequence) Integer
				.toString(db1.chongdianzhuanglianjiebiaozhiwei));

		tv_jinzhichongdianbiaozhi = (TextView) this
				.findViewById(R.id.bma_jinzhichongdianbiaozhi);
		if (db1.shifoujinzhichongdianbiaozhiwei == 1) {
			tv_jinzhichongdianbiaozhi.setText((CharSequence) this
					.getResources().getString(R.string.jinzhichongdian));
		} else {
			tv_jinzhichongdianbiaozhi.setText((CharSequence) this
					.getResources().getString(R.string.yunxuchongdian));
		}
		tv_chongdianzhuanglianjiebiaozhiwei.setText((CharSequence) Integer
				.toString(db1.shifoujinzhichongdianbiaozhiwei));
		if (db1.shifoujinzhichongdianbiaozhiwei == 1) {
			tv_chongdianzhuanglianjiebiaozhiwei.setText((CharSequence) this
					.getResources().getString(R.string.yilianjie));
		} else {
			tv_chongdianzhuanglianjiebiaozhiwei.setText((CharSequence) this
					.getResources().getString(R.string.weilianjie));
		}
	}

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.setContentView(R.layout.battery_management_activity);
		closeBtn = (ImageButton) this.findViewById(R.id.bma_closebtn);

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

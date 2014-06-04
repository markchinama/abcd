package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

import com.mark.bus.R;
import com.mark.bus.data.DataFromBMS1;
import com.mark.bus.data.DataFromBMS2;
import com.mark.bus.data.DataFromBMS3;
import com.mark.bus.data.DataHandler1;

public class BatteryManagementFragment extends Fragment {

	private boolean flag = true;
	private TableRow tab11;
	private TableRow tab12;
	private TableRow tab13;
	private TableRow tab14;

	private TableRow tab21;
	private TableRow tab22;
	private TableRow tab23;
	private TableRow tab24;

	private TableRow tab31;
	private TableRow tab32;

	private ImageButton collapse;

	private final int DOUBLE_TAP_TIMEOUT = 200;
	private MotionEvent mCurrentDownEvent;
	private MotionEvent mPreviousUpEvent;
	private View view;

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
		tv_dianchizongdianya = (TextView) view
				.findViewById(R.id.bmf_dianchizongdianya);
		tv_dianchizongdianya.setText((CharSequence) Float
				.toString(db1.dianchixitongshishizongdianya));

		tv_dianchisoc = (TextView) view.findViewById(R.id.bmf_dianchisoc);
		tv_dianchizongdianya.setText((CharSequence) Float
				.toString(db1.dianchisoc));

		tv_dianchizongxiangshu = (TextView) view
				.findViewById(R.id.bmf_dianchizongxiangshu);
		tv_dianchizongxiangshu.setText((CharSequence) Integer
				.toString(db2.dianchizongxiangshu));

		tv_shengyunengliang = (TextView) view
				.findViewById(R.id.bmf_shengyunengliang);
		tv_shengyunengliang.setText((CharSequence) Float
				.toString(db3.shengyunengliang));

		tv_shunshigonglv = (TextView) view.findViewById(R.id.bmf_shunshigonglv);
		tv_shunshigonghao = (TextView) view
				.findViewById(R.id.bmf_shunshigonghao);

		tv_dianchichongfangdiandianliu = (TextView) view
				.findViewById(R.id.bmf_dianchichongfangdiandianliu);
		tv_dianchichongfangdiandianliu.setText((CharSequence) Float
				.toString(db1.dianchishishidianliu));
		// ////////////////////////////////////////////////
		tv_mokuaizuigaowendu = (TextView) view
				.findViewById(R.id.bmf_mokuaizuigaowendu);

		tv_mokuaizuidiwendu = (TextView) view
				.findViewById(R.id.bmf_mokuaizuidiwendu);
		// /////////////////////////////////////////////////
		tv_zuigaowendudianchiweizhi = (TextView) view
				.findViewById(R.id.bmf_zuigaoweidudianchiweizhi);
		tv_zuigaowendudianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuigaowendudianchiweizhi));

		tv_zuidiwendudianchiweizhi = (TextView) view
				.findViewById(R.id.bmf_zuidiweidudianchiweizhi);
		tv_zuidiwendudianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuidiwendudianchiweizhi));

		// /////////////////////////////////////////////////
		tv_dantizuigaodianya = (TextView) view
				.findViewById(R.id.bmf_dantizuigaodianya);

		tv_dantizuididianya = (TextView) view
				.findViewById(R.id.bmf_dantizuididianya);

		// /////////////////////////////////////////////////

		tv_zuigaodianyadianchiweizhi = (TextView) view
				.findViewById(R.id.bmf_zuigaodianyadianchixiangweizhi);
		tv_zuigaodianyadianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchiweizhi));

		tv_zuididianyadianchiweizhi = (TextView) view
				.findViewById(R.id.bmf_zuididianyadianchixiangweizhi);
		tv_zuididianyadianchiweizhi.setText((CharSequence) Integer
				.toString(db3.zuididianyadianchiweizhi));

		tv_zuigaodianyadianchixiangjieshu = (TextView) view
				.findViewById(R.id.bmf_zuigaodianyadianchixiangjieshu);
		tv_zuigaodianyadianchixiangjieshu.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchixiangshu));

		tv_zuididianyadianchixiangjieshu = (TextView) view
				.findViewById(R.id.bmf_zuididianyadianchixiangjieshu);
		tv_zuididianyadianchixiangjieshu.setText((CharSequence) Integer
				.toString(db3.zuigaodianyadianchixiangshu));

		tv_chongdianzhuanglianjiebiaozhiwei = (TextView) view
				.findViewById(R.id.bmf_chongdianzhuanglianjiebiaozhiwei);
		tv_chongdianzhuanglianjiebiaozhiwei.setText((CharSequence) Integer
				.toString(db1.chongdianzhuanglianjiebiaozhiwei));

		tv_jinzhichongdianbiaozhi = (TextView) view
				.findViewById(R.id.bmf_jinzhichongdianbiaozhi);
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

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.battery_management_fragment,
				container, false);

		initialize();

		collapse = (ImageButton) view.findViewById(R.id.collapse);

		tab11 = (TableRow) view.findViewById(R.id.v11);
		tab12 = (TableRow) view.findViewById(R.id.v12);
		tab13 = (TableRow) view.findViewById(R.id.v13);
		tab14 = (TableRow) view.findViewById(R.id.v14);
		tab21 = (TableRow) view.findViewById(R.id.v21);
		tab22 = (TableRow) view.findViewById(R.id.v22);
		tab23 = (TableRow) view.findViewById(R.id.v23);
		tab24 = (TableRow) view.findViewById(R.id.v24);
		tab31 = (TableRow) view.findViewById(R.id.v31);
		tab32 = (TableRow) view.findViewById(R.id.v32);

		collapse.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!flag) {
					tab11.setVisibility(View.GONE);
					tab12.setVisibility(View.GONE);
					tab13.setVisibility(View.GONE);
					tab14.setVisibility(View.GONE);
					tab21.setVisibility(View.GONE);
					tab22.setVisibility(View.GONE);
					tab23.setVisibility(View.GONE);
					tab24.setVisibility(View.GONE);
					tab31.setVisibility(View.GONE);
					tab32.setVisibility(View.GONE);
					v.setBackgroundResource(R.drawable.batterytopbtnopen);
					flag = true;
				} else {
					tab11.setVisibility(View.VISIBLE);
					tab12.setVisibility(View.VISIBLE);
					tab13.setVisibility(View.VISIBLE);
					tab14.setVisibility(View.VISIBLE);
					tab21.setVisibility(View.VISIBLE);
					tab22.setVisibility(View.VISIBLE);
					tab23.setVisibility(View.VISIBLE);
					tab24.setVisibility(View.VISIBLE);
					tab31.setVisibility(View.VISIBLE);
					tab32.setVisibility(View.VISIBLE);
					v.setBackgroundResource(R.drawable.batterytopbtnclose);
					flag = false;
				}

			}
		});

		OnTouchListener mTouchListener = new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					if (mPreviousUpEvent != null
							&& mCurrentDownEvent != null
							&& isConsideredDoubleTap(mCurrentDownEvent,
									mPreviousUpEvent, event)) {

						Intent intent = new Intent(view.getContext(),
								BatteryManagementActivity.class);

						view.getContext().startActivity(intent);

					}
					mCurrentDownEvent = MotionEvent.obtain(event);
				} else if (event.getAction() == MotionEvent.ACTION_UP) {
					mPreviousUpEvent = MotionEvent.obtain(event);
				}
				return true;
			}

			private boolean isConsideredDoubleTap(MotionEvent firstDown,
					MotionEvent firstUp, MotionEvent secondDown) {
				if (secondDown.getEventTime() - firstUp.getEventTime() > DOUBLE_TAP_TIMEOUT) {
					return false;
				}
				int deltaX = (int) firstUp.getX() - (int) secondDown.getX();
				int deltaY = (int) firstUp.getY() - (int) secondDown.getY();
				return deltaX * deltaX + deltaY * deltaY < 10000;
			}
		};

		view.setOnTouchListener(mTouchListener);

		return view;
	}
}
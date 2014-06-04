package com.mark.bus.app;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mark.bus.R;
import com.mark.bus.data.DataFromWholeController1;
import com.mark.bus.data.DataFromWholeController2;
import com.mark.bus.data.DataFromWholeController3;
import com.mark.bus.data.DataHandler1;

public class WholeControlFragment extends Fragment {

	private final int DOUBLE_TAP_TIMEOUT = 200;
	private MotionEvent mCurrentDownEvent;
	private MotionEvent mPreviousUpEvent;
	private View view;

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

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.whole_control_fragment, container,
				false);
		initialize();
		OnTouchListener mTouchListener = new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					if (mPreviousUpEvent != null
							&& mCurrentDownEvent != null
							&& isConsideredDoubleTap(mCurrentDownEvent,
									mPreviousUpEvent, event)) {

						Intent intent = new Intent(view.getContext(),
								WholeActivity.class);

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

	public void initialize() {
		DataFromWholeController3 dw3 = DataHandler1.dw3;
		DataFromWholeController1 dw1 = DataHandler1.dw1;
		DataFromWholeController2 dw2 = DataHandler1.dw2;
		tv_chesu = (TextView) view.findViewById(R.id.wc_chesu1);
		tv_chesu.setText(Float.toString(dw3.shishichesu));

		tv_dangwei = (TextView) view.findViewById(R.id.wc_dangwei1);
		if (dw1.daodangxinhao == 1)
			tv_dangwei.setText("R");
		else if (dw1.qianjindangkaiguan == 1)
			tv_dangwei.setText("D");
		else if (dw1.kongdangkaiguan == 1)
			tv_dangwei.setText("N");

		tv_shache = (TextView) view.findViewById(R.id.wc_shache1);
		tv_shache.setText(Float.toString(dw2.zhidongmonixihao));

		tv_youmen = (TextView) view.findViewById(R.id.wc_youmen1);
		tv_youmen.setText(Float.toString(dw2.youmenmonixihao));

		iv_dianzhidong = (ImageView) view.findViewById(R.id.wc_dianzhidong1);
		if (dw1.dianzhidongyouxiaoxinhao == 1) {
			iv_dianzhidong.setBackgroundResource(R.drawable.onstatus);
		}

		iv_dianjizhidongyouxianxinhao = (ImageView) view
				.findViewById(R.id.wc_dianjizhidongyouxianxinhao1);
		if (dw1.dianjizhidongyouxianxinhao == 1) {
			iv_dianjizhidongyouxianxinhao
					.setBackgroundResource(R.drawable.onstatus);
		}
		iv_zhuchexinhao = (ImageView) view.findViewById(R.id.wc_zhuchexinhao1);
		if (dw1.zhuchexinhao == 1)
			iv_zhuchexinhao.setBackgroundResource(R.drawable.onstatus);
		iv_zhidongxinhao = (ImageView) view
				.findViewById(R.id.wc_zhidongxinhao1);
		if (dw1.zhidongkaiguan == 1)
			iv_zhidongxinhao.setBackgroundResource(R.drawable.onstatus);
		iv_yisukaiguan = (ImageView) view.findViewById(R.id.wc_yisukaiguan1);
		if (dw1.yisukaiguan == 1)
			iv_yisukaiguan.setBackgroundResource(R.drawable.onstatus);
		iv_zhujiechuqizhuangtai = (ImageView) view
				.findViewById(R.id.wc_zhujiechuqizhuangtai);
		if (dw1.zhujiechuqizhuangtai == 1)
			iv_zhujiechuqizhuangtai.setBackgroundResource(R.drawable.onstatus);
		iv_gaoyashouzhaxinhao = (ImageView) view
				.findViewById(R.id.wc_gaoyashouzhaxinhao1);
		// //////////////////////////////////////////////////////
		if (dw1.gaoyaqiaobanbihexinhao == 1)
			iv_gaoyashouzhaxinhao.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshiacc = (ImageView) view.findViewById(R.id.wc_yaoshiacc1);
		if (dw1.yaoshiaccxinhao == 1)
			iv_yaoshiacc.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshion = (ImageView) view.findViewById(R.id.wc_yaoshion1);
		if (dw1.yaoshionxinhao == 1)
			iv_yaoshion.setBackgroundResource(R.drawable.onstatus);
		iv_yaoshist = (ImageView) view.findViewById(R.id.wc_yaoshist1);
		if (dw1.yaoshistxinhao == 1)
			iv_yaoshist.setBackgroundResource(R.drawable.onstatus);
		iv_ready = (ImageView) view.findViewById(R.id.wc_ready1);
		if (dw2.zhengchexitongzhengchangzhishixinhao == 1)
			iv_ready.setBackgroundResource(R.drawable.onstatus);
		iv_kongtiaoqidong = (ImageView) view
				.findViewById(R.id.wc_kongtiaoqidong1);
		if (dw1.kongtiaoqidongxinhao == 1)
			iv_kongtiaoqidong.setBackgroundResource(R.drawable.onstatus);
		// //////////////////
		iv_kongtiaogongzuoshineng = (ImageView) view
				.findViewById(R.id.wc_kongtiaogongzuoshineng1);
		// ////////////////////////////
		iv_kongtiaogonglvshuaijianshineng = (ImageView) view
				.findViewById(R.id.wc_kongtiaogonglvshuaijianshineng1);

		iv_shuibengqidong = (ImageView) view
				.findViewById(R.id.wc_shuibengqidong1);
		if (dw1.shuibengkongzhixinhao == 1)
			iv_shuibengqidong.setBackgroundResource(R.drawable.onstatus);
	}
}
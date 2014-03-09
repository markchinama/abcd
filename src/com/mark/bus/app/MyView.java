package com.mark.bus.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MyView extends SurfaceView implements SurfaceHolder.Callback {

	private boolean mbLoop = false;
	private boolean clearFlag = false;
	private int a;
	// 定义SurfaceHolder对象
	private SurfaceHolder mSurfaceHolder = null;

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);

		// 实例化SurfaceHolder
		mSurfaceHolder = this.getHolder();

		// 添加回调
		mSurfaceHolder.addCallback(this);
		setZOrderOnTop(true);
		mSurfaceHolder.setFormat(PixelFormat.TRANSLUCENT);
		this.setFocusable(true);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		mbLoop = true;

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				while (mbLoop) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (mSurfaceHolder) {
						DrawData();
						a += 1;
					}
				}
			}
		});
		th.start();
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		mbLoop = false;
	}

	public void clearScreen() {
		clearFlag = true;
	}

	private void clearCanvas(Canvas canvas) {
		Paint clipPaint = new Paint();
		clipPaint.setAntiAlias(true);
		clipPaint.setStyle(Paint.Style.STROKE);
		clipPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
		canvas.drawPaint(clipPaint);
	}

	// 绘图方法
	private void DrawData() {
		if (mSurfaceHolder == null)
			return;

		// 锁定画布，得到canvas
		Canvas canvas = mSurfaceHolder.lockCanvas();
		if (canvas == null) {
			return;
		}
		Paint mPaint = new Paint();
		if (clearFlag) {
			Log.i("main", "entering clear screen");

			clearCanvas(canvas);

			return;
		} else {
			// 绘图
			mPaint.setAntiAlias(true);
			mPaint.setColor(Color.GREEN);

			// 绘制矩形--清屏作用

			int left = this.getLeft();
			int top = this.getTop();
			int bottom = this.getBottom();
			int right = this.getRight();

			// canvas.drawRect(left, top, right, bottom, mPaint);
			int b = a % 4;
			switch (b) {
			case 0:
				mPaint.setColor(Color.RED);
				break;
			case 1:
				mPaint.setColor(Color.BLUE);
				break;
			case 2:
				mPaint.setColor(Color.BLACK);
				break;
			case 3:
				mPaint.setColor(Color.GREEN);
				break;

			}

			canvas.drawLine(0, 0, bottom - top, right - left, mPaint);

			if (b == 3)
				clearCanvas(canvas);

		}
		mSurfaceHolder.unlockCanvasAndPost(canvas);
	}

}

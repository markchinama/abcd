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
	private static int[] drawdata = new int[20];
	// ����SurfaceHolder����
	private SurfaceHolder mSurfaceHolder = null;

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);

		// ʵ��SurfaceHolder
		mSurfaceHolder = this.getHolder();

		// ��ӻص�
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

		Thread readTh = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (drawdata) {
						int[] readData = { 1, 2, 1, 3, 1, 4, 1, 5, 7, 6, 8, 1,
								2, 1, 3, 4, 7, 6, 8, 1 };
						System.arraycopy(readData, 0, drawdata, 0, 20);
					}
				}
			}
		});
		readTh.start();
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				while (mbLoop) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (mSurfaceHolder) {
						int[] data = new int[20];
						synchronized (drawdata) {
							System.arraycopy(drawdata, 0, data, 0, 20);
						}
						for (int i = 0; i < data.length; i++) {
							System.out.println(drawdata[i]);
						}
						DrawData(data);
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

	// ��ͼ����
	private void DrawData(int[] data) {
		if (mSurfaceHolder == null)
			return;

		// �������õ�canvas
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
			// ��ͼ
			mPaint.setAntiAlias(true);
			mPaint.setColor(Color.GREEN);

			int left = this.getLeft();
			int top = this.getTop();
			int bottom = this.getBottom();
			int right = this.getRight();

			int hBase = 10;
			int vBase = (bottom - top) / 10;

			int length = data.length;
			for (int i = 0; i < length - 1; i++) {
				canvas.drawLine(i * hBase, data[i] * vBase, (i + 1) * hBase,
						data[i + 1] * vBase, mPaint);
			}

			// canvas.drawRect(left, top, right, bottom, mPaint);
			// canvas.drawLine(0, 0, right - left, bottom - top, mPaint);

		}
		mSurfaceHolder.unlockCanvasAndPost(canvas);
	}

}

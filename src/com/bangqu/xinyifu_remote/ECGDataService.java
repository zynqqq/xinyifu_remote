package com.bangqu.xinyifu_remote;

import java.util.ArrayList;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

import com.bangqu.xinyifu_remote.util.LogUtil;

/**
 * @author zyn
 * 
 */
public class ECGDataService extends Service {
	public static final String TAG = "ECGDataService";

	final Messenger mMessenger = new Messenger(new ECGDataHandler());

	public ArrayList<Double> list = new ArrayList<Double>();
	public Boolean isRun;

	@Override
	public void onCreate() {
		// first
		super.onCreate();
		isRun = true;
		startECGData();
		LogUtil.d(TAG, "onCreate Service");
	}

	@Override
	public IBinder onBind(Intent intent) {
		// second
		LogUtil.d(TAG, "onBind Service");
        return mMessenger.getBinder();   
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		LogUtil.d(TAG, "onStartCommand Service");
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public boolean onUnbind(Intent intent) {
		// third
		LogUtil.d(TAG, "onUnbind Service");
		return super.onUnbind(intent);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		LogUtil.d(TAG, "onDestroy Service");
	}

	/**
	 * 开始接收心电数据
	 */
	public void startECGData() {
		new Thread(new ECGDataThread()).start();
	}

	/**
	 * 停止接收心电数据
	 */
	public void stopECGData() {
		isRun = false;
	}

	public ArrayList<Double> getECGData() {
		return list;
	}

	class ECGDataThread implements Runnable {

		@Override
		public void run() {
			while (isRun) {
				try {
					Thread.sleep(1000);
					LogUtil.d(TAG, "卧槽");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

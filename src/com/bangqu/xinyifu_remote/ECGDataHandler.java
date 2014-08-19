package com.bangqu.xinyifu_remote;

import com.bangqu.xinyifu_remote.util.LogUtil;

import android.os.Handler;
import android.os.Message;

/**
 * handler管理类
 * 
 * @author zyn
 * 
 */
public class ECGDataHandler extends Handler {
	public static final String TAG = "ECGDataHandler";
	public static final int MSG_ECG_DATA = 1;

	@Override
	public void handleMessage(Message msg) {
		switch (msg.what) {
		case MSG_ECG_DATA:
			processClient();
			break;
		default:
			super.handleMessage(msg);
		}
	}

	/**
	 * 处理客户端发来的请求
	 */
	public void processClient() {
		LogUtil.d(TAG, "客户端发来的请求");
	}

}

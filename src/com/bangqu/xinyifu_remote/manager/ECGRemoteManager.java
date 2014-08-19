package com.bangqu.xinyifu_remote.manager;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import com.bangqu.xinyifu_remote.ECGDataService;
import com.bangqu.xinyifu_remote.ECGRemoteException;

/**
 * 远程service管理类(进程框架和客户端封装交流媒介)
 * 
 * @author zyn
 * 
 */
public class ECGRemoteManager {
	public static final int MSG_ECG_DATA = 1;
	/** 判断有没有绑定Service */
	boolean mBound;

	public ECGRemoteManager() {
	}

	/**
	 * 客户端向service发送指令消息
	 * 
	 * @param messenger
	 * @throws ECGRemoteException
	 */
	public static void clientToService(Messenger messenger) {
		Message msg = Message.obtain(null, MSG_ECG_DATA, 0, 0);
		try {
			messenger.send(msg);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * service向客户端发送指令消息
	 */
	public void serviceToClient() {
	}

	/**
	 * 开启新进程
	 */
	public void startService(Context mContext, ServiceConnection connection) {
		Intent intent = new Intent(mContext, ECGDataService.class);
		mContext.bindService(intent, connection, Context.BIND_AUTO_CREATE);
	}

	/**
	 * 关闭进程
	 */
	public void stopService(Context mContext,ServiceConnection connection) {
		mContext.unbindService(connection);
	}

}

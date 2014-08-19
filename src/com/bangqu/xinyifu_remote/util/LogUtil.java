package com.bangqu.xinyifu_remote.util;

import android.util.Log;

import com.bangqu.xinyifu_remote.BuildConfig;

/**
 * logcat工具类
 * 
 * @author zyn
 * 
 */
public class LogUtil {

	/**
	 * 打印log.information
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void i(String TAG, String msg) {
		if (BuildConfig.DEBUG) {
			Log.i(TAG, msg);
		}
	}

	/**
	 * 打印log.information
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void i(String TAG, int msg) {
		if (BuildConfig.DEBUG) {
			Log.i(TAG, Integer.toString(msg));
		}
	}

	/**
	 * 打印log.debug
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void d(String TAG, String msg) {
		if (BuildConfig.DEBUG) {
			Log.d(TAG, msg);
		}
	}

	/**
	 * 打印log.debug
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void d(String TAG, int msg) {
		if (BuildConfig.DEBUG) {
			Log.d(TAG, Integer.toString(msg));
		}
	}

	/**
	 * 打印log.error
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void e(String TAG, String msg) {
		if (BuildConfig.DEBUG) {
			Log.e(TAG, msg);
		}
	}

	/**
	 * 打印log.error
	 * 
	 * @param TAG
	 *            打印的类名
	 * @param msg
	 *            打印的信息
	 */
	public static void e(String TAG, int msg) {
		if (BuildConfig.DEBUG) {
			Log.e(TAG, Integer.toString(msg));
		}
	}

}

package com.bangqu.xinyifu_remote;

import java.util.concurrent.CopyOnWriteArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ECGDataConstans {
	/**
	 * 12导联的复制集合
	 */
	public CopyOnWriteArrayList<Double> data1 = new CopyOnWriteArrayList<Double>(); // 实时V1导联（仅服务器）
	public CopyOnWriteArrayList<Double> data2 = new CopyOnWriteArrayList<Double>(); // 实时V2导联（仅服务器）
	public CopyOnWriteArrayList<Double> data3 = new CopyOnWriteArrayList<Double>(); // 实时V3导联（仅服务器）
	public CopyOnWriteArrayList<Double> data4 = new CopyOnWriteArrayList<Double>(); // 实时V4导联（仅服务器）
	public CopyOnWriteArrayList<Double> data5 = new CopyOnWriteArrayList<Double>(); // 实时V5导联（仅服务器）
	public CopyOnWriteArrayList<Double> data6 = new CopyOnWriteArrayList<Double>(); // 实时V6导联（仅服务器）
	public CopyOnWriteArrayList<Double> data7 = new CopyOnWriteArrayList<Double>(); // 实时I导联（仅服务器）
	public CopyOnWriteArrayList<Double> data8 = new CopyOnWriteArrayList<Double>(); // 实时II导联（仅服务器）

}

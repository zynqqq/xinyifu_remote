package com.bangqu.xinyifu_remote;


/**
 * @author zyn
 * 
 */
public class ECGRemoteException extends Exception {
	private static final long serialVersionUID = 1L;

	public enum EnumException {
		RemoteException
	}

	private EnumException mExceptionType;
	private String detailMessage;

	public ECGRemoteException(EnumException type, String detailMessage) {
		super(detailMessage);
		mExceptionType = type;
		this.detailMessage = detailMessage;
	}

}

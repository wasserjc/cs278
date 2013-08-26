package com.example.sodacloudsmsexampleclient;

import org.magnum.soda.example.sms.SMSManager;
import org.magnum.soda.example.sms.SMSManagerImpl;

public class ModuleImpl implements Module {
	
	private SMSManagerImpl sms;
	private QRCodeObjRefExtractor qr;
	
	@Override
	public <T> T getComponent(Class<T> type) {
		if (type == SMSManager.class) return (T) sms;
		else if (type == ObjRefExtractor.class) return (T) qr;
		else return null;
	}

	@Override
	public <T> void setComponent(Class<T> type, T component) {
		if (type == SMSManager.class) sms = (SMSManagerImpl) component;
		else if (type == ObjRefExtractor.class) qr = (QRCodeObjRefExtractor) component;
	}
}

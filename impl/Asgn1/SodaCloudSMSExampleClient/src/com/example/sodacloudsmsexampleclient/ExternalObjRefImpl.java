package com.example.sodacloudsmsexampleclient;

import org.magnum.soda.proxy.ObjRef;

public class ExternalObjRefImpl implements ExternalObjRef {

	private ObjRef objRef;
	
	public ExternalObjRefImpl(ObjRef ref) {
		setObjRef(ref);
	}
	
	@Override
	public ObjRef getObjRef() {
		return objRef;
	}

	@Override
	public String getPubSubHost() {
		return objRef.getHost();
	}

	@Override
	public String toString() {
		return this.getPubSubHost() + "|" + this.getObjRef().getUri();
	}
	
	public void setObjRef(ObjRef ref) {
		objRef = ref;
	}
}

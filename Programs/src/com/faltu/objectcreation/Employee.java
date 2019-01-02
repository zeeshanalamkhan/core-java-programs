package com.faltu.objectcreation;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

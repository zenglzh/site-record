/*
 * @(#)org.zlz.siterecord#RecordFactor.java	2013-5-14
 *
 * Copyright 2013 Zenglzh. All rights reserved.
 * ZENG PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.zlz.siterecord;

/**
 * The <code>RecordFactor.java</code> class represents 
 * @author zenglizhi
 * @version 1.0, 2013-5-14
 * @see      
 * @since  
 */
public interface RecordFactor {

	/**
	 * ��¼��
	 * @return վ����Ψһ
	 */
	public String getName();
	
	/**
	 * ��¼·��
	 * @return
	 */
	public RecordPath getPath();
	
	
	/**
	 * ��¼ֵ
	 * @return
	 */
	public FactorValue getValue();
	
	
	
	
	
	
}




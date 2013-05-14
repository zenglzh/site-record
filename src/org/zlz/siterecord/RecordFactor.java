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
	 * 记录名
	 * @return 站点内唯一
	 */
	public String getName();
	
	/**
	 * 记录路径
	 * @return
	 */
	public RecordPath getPath();
	
	
	/**
	 * 记录值
	 * @return
	 */
	public FactorValue getValue();
	
	
	
	
	
	
}




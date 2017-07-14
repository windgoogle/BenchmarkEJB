package com.tongweb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface BenchMarkRemote {
    
    /**
     * get a long value from server
     */
	public long getLong(long num);

	/**
	 * get a string value from server
	 */
	public String getString(String str);

	/**
	 * get a simple bean from server
	 */
	public SimpleBean getSimpleBean(SimpleBean bean);

	/**
	 * get a list of simple bean from server
	 */
	public List<SimpleBean> getList(List<SimpleBean> list);

}

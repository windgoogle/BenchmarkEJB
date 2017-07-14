package com.tongweb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class BenchMarkRemote
 */
@Stateless(mappedName = "ejb/BenchMarkBean")
public class BenchMarkBean implements BenchMarkRemote {

	public long getLong(long num) {
		return 37 + num;
	}

	public String getString(String str) {
		return "Server side:" + str;
	}

	public SimpleBean getSimpleBean(SimpleBean bean) {
		return bean;
	}

	public List<SimpleBean> getList(List<SimpleBean> list) {
		ArrayList<SimpleBean> newlist = new ArrayList<SimpleBean>();
		for (int i = 0; i < 5; ++i) {
			newlist.add(new SimpleBean());
		}
		return newlist;
	}

}

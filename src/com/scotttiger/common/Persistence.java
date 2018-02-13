package com.scotttiger.common;

import com.scotttiger.dbforzabbix.zabbix.ZabbixItem;

public interface Persistence {


	public ZabbixItem pop();

	public Long size();
	

	public void push(ZabbixItem zi);

}


package com.scotttiger.dbforzabbix.db.adapter;

import java.util.Set;

import com.scotttiger.dbforzabbix.db.DBType;


public class ALLBASE extends AbstractDBAdapter {

	public ALLBASE(String name, String url, String user, String passwd, Integer maxactive, Integer maxidle,Integer maxwaitmillis,Integer queryTimeout, Set<String> set, Boolean pers) {
		this.name = name;
		this.url = url;
		this.user = user;
		this.passwd = passwd;
		this.maxactive = maxactive.intValue();
		this.maxidle = maxidle.intValue();
		this.maxwaitmillis=maxwaitmillis.intValue();
		this.queryTimeout = queryTimeout.intValue();
		this.persistence = pers;
		this.configurationUIDs=set;
	}
	
	@Override
	public DBType getType() {
		return DBType.ALLBASE;
	}

	
}

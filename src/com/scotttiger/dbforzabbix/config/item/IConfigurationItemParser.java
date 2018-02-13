package com.scotttiger.dbforzabbix.config.item;

import java.util.Set;

import org.dom4j.DocumentException;

import com.scotttiger.dbforzabbix.config.element.IConfigurationElement;

public interface IConfigurationItemParser {

	Set<IConfigurationElement> buildConfigurationElements() throws DocumentException;

}

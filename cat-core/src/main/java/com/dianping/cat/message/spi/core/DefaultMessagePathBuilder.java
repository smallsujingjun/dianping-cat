package com.dianping.cat.message.spi.core;

import java.text.MessageFormat;
import java.util.Date;

public class DefaultMessagePathBuilder implements MessagePathBuilder {

	@Override
	public String getPath(Date timestamp, String name) {
		MessageFormat format = new MessageFormat("{0,date,yyyyMMdd}/{0,date,HH}/{1}");

		return format.format(new Object[] { timestamp, name });
	}

	@Override
	public String getReportPath(String name, Date timestamp) {
		MessageFormat format = new MessageFormat("{0,date,yyyyMMdd}/{0,date,HH}/report-{1}");

		return format.format(new Object[] { timestamp, name });
	}
}

package UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import BaseLayer.BaseClass;

public class CurrentDateAndTime extends BaseClass {
	
	public static String curruntdatetime() {
		SimpleDateFormat date=new SimpleDateFormat("_ddMMyyyy_HHmmss");
		return date.format(new Date());
		}
}

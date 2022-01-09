package com.java.date;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateFunction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OffsetDateTime offdatetime=OffsetDateTime.now();
		System.out.println("OffsetDate is : " + offdatetime);
		Date today=new Date();
		
		int month=Calendar.DAY_OF_MONTH;
		int week=Calendar.DAY_OF_WEEK;
		int dec=Calendar.DECEMBER;
		int date=Calendar.DATE;
		System.out.println("month is : " + month);
		System.out.println("week is : " + week);
		System.out.println("dec is : " + dec);
		System.out.println("date is : " + date);
		String DateString="2021-01-01";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date abc=df.parse(DateString);
		System.out.println("converted value is : " + abc);
	}

}

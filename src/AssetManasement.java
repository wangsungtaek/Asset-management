import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import sun.security.provider.EntropySource;

import java.time.LocalDate;

class Expense {
	
	double weekdayExpense;
	double weekendExpense;
	double weekdayDays;
	double weekendDays;
	
	public  void print() {
		System.out.println("Weekday Total expense : " + getWeekdayExpense());
		System.out.println("Weekend Total expense : " + getWeekendExpense());
		System.out.println("Total expense : " + getTotalExpense());
	}

	public  double getTotalExpense() {
		return getWeekdayExpense() + getWeekendExpense();
	}

	public  double getWeekendExpense() {
		return weekendExpense * weekendDays;
	}

	public  double getWeekdayExpense() {
		return weekdayExpense * weekdayDays;
	}
}


public class AssetManasement {
	
	public static void main(String[] args) throws ParseException{
		
		Expense a = new Expense();
		a.weekdayExpense = 10000.0;
		a.weekendExpense = 15000.0;
		a.weekdayDays = 70;
		a.weekendDays = 10;
		
		a.print();	
		System.out.println();
		
		Calendar today = Calendar.getInstance();
		today.clear(Calendar.HOUR);
		today.clear(Calendar.MINUTE);
		today.clear(Calendar.SECOND);
		today.clear(Calendar.MILLISECOND);
		
		System.out.println(today);
		
		/*
		Calendar target = Calendar.getInstance();
		String from = "2021-04-10 1";
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd-h");

		target.setTime(fm.parse(from));
		target.clear(Calendar.HOUR);
		target.clear(Calendar.MINUTE);
		target.clear(Calendar.SECOND);
		target.clear(Calendar.MILLISECOND);
		
		long diffSec = (target.getTimeInMillis() - today.getTimeInMillis());
		int day = (int)(Math.floor(TimeUnit.HOURS.convert(diffSec, TimeUnit.MILLISECONDS)/24f));
		
		System.out.println(day);
		*/
		/*
		Date today = new Date();
		
		Calendar targetDay = new GregorianCalendar(2021, Calendar.APRIL, 10);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(targetDay);
		System.out.println(today);
		System.out.println(today.getTime());
		System.out.println(targetDay.getTime());
		System.out.println(targetDay.getTimeInMillis());
		
		System.out.println("기준날짜 : "+sdf.format(today));
		System.out.println("목표날짜 : "+sdf.format(targetDay.getTime()));
		
			
		long diffSec = (targetDay.getTimeInMillis() - today.getTime())/1000;
		long diffDay = diffSec/ (24*60*60);
		
		System.out.println(diffDay);
		*/
		
	}
}

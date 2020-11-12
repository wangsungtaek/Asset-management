package main;
import java.text.ParseException;
import java.util.*;
import javax.swing.JOptionPane;

public class AssetManasement {
	public static long getDday() {
		
		Calendar today = Calendar.getInstance();
		Calendar d_day = Calendar.getInstance();
		d_day.set(2021, Calendar.APRIL, 30);
		
		long i_dday = d_day.getTimeInMillis()/(24*60*60*1000);
		long i_today = today.getTimeInMillis()/(24*60*60*1000);	
		
		return i_dday - i_today;
	}
	public static void main(String[] args){
		
		long dayExpense = 10000;
		String stringAddDoc = Text.invertText(Long.toString(getDday() * dayExpense));
		stringAddDoc = Text.addDoc(stringAddDoc);
		stringAddDoc = Text.invertText(stringAddDoc);
		
		System.out.println("교육 종료까지 "+getDday()+"일 남았습니다.");
		System.out.println("총 소비 금액은 "+ stringAddDoc +"원 입니다.");

	}
}

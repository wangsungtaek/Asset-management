import java.text.ParseException;
import java.util.*;

import javax.swing.JOptionPane;

public class AssetManasement {
	public static long getDday() {
		
		Calendar today = Calendar.getInstance();
		Calendar d_day = Calendar.getInstance();
		d_day.set(2021, Calendar.APRIL, 29);
		
		long i_dday = d_day.getTimeInMillis()/(24*60*60*1000);
		long i_today = today.getTimeInMillis()/(24*60*60*1000);	
		
		return i_dday - i_today;
	}
	public static String getExpense(long dayExpense) {
		
		String expenseString = Long.toString((getDday() * dayExpense));
		
		/*
		for(int i=0; i<expenseString.length(); i++) {
			if(i == 0) {
				recover += expenseString.charAt(expenseString.length()-1);
			} else {
				recover += expenseString.charAt(expenseString.length()-(i+1));
			}
		}*/
		/*
		String recover = "";
		recover = "1234567890";
		int j = 0;
		String resultDoc ="";
		int m = recover.length()-(recover.length()%3);
		
		for(int i=0; i < (recover.length()/3); i++) {
			resultDoc += recover.substring(j, j+3) + ((j+3>=recover.length())? "" :".");
			j += 3;
		}

		System.out.println(resultDoc);
		System.out.println(recover.substring(j));
		*/
		return "\"" + expenseString + "\"";
		
	}
	
	public static void main(String[] args){
		
		System.out.println("교육 종료까지 "+getDday()+"일 남았습니다.");
		System.out.println("총 지출 금액은 "+getExpense(10000)+"원 입니다.");
			
		
		
	}
}

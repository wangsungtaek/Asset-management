import java.text.ParseException;
import java.util.*;

import javax.swing.JOptionPane;



class Expense {
	
	int dayExpense;
	long days;
	
	public  void print() {
		System.out.println("Total expense : " + getTotalExpense());
	}

	public  double getTotalExpense() {
		return dayExpense * days;
	}
}


public class AssetManasement {
	
	public static void main(String[] args){
		
		Calendar today = Calendar.getInstance();
		Calendar d_day = Calendar.getInstance();
		d_day.set(2021, Calendar.APRIL, 10);
		
		long i_dday = d_day.getTimeInMillis()/(24*60*60*1000);
		long i_today = today.getTimeInMillis()/(24*60*60*1000);
		long substract = i_dday - i_today;
		
		Expense a = new Expense();
	//	a.dayExpense = Integer.parseInt(args[0]);
		a.dayExpense = Integer.parseInt(JOptionPane.showInputDialog("예상 지출 금액을 입력하세요"));
		
		a.days = substract;
		
		System.out.println("교육 종료까지 "+substract+"일 남았습니다.");
		System.out.println("하루 지출 금액은 "+a.dayExpense+"원입니다.");
		a.print();

	}
}

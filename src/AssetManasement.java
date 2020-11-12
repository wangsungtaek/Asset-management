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
	public static String invertText (String data) {
		String invertResult ="";
		
		for(int i=0; i<data.length(); i++) {
			if(i == 0) {
				invertResult += data.charAt(data.length()-1);
			} else {
				invertResult += data.charAt(data.length()-(i+1));
			}
		}
		return invertResult ;
	}
	public static String addDoc (String data) {
		int j = 0;
		String addedDoc ="";
		
		for(int i=0; i < (data.length()/3); i++) {
			addedDoc += data.substring(j, j+3) + ((j+3>=data.length())? "" :".");
			j += 3;
		}
				
		return addedDoc + data.substring(j, (j+data.length()%3));
	}
	
	public static String getExpense(long dayExpense) {
		/*
		 *  1. text invert 
		 *  2. add doc (3자리씩)
		 *  3. text invert (다시 뒤집기)
		 */
		String invertedText = invertText(Long.toString(getDday() * dayExpense));
		String addedDoc = addDoc(invertedText);
		String resultText = invertText(addedDoc);
		
		return "\"" + resultText + "\"";

	}
	public static void main(String[] args){
		
		System.out.println("교육 종료까지 "+getDday()+"일 남았습니다.");
		System.out.println("총 소비 금액은 "+getExpense(10000)+"원 입니다.");
				
	}
}

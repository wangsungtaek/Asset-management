
public class test {

	public static void main(String[] args) {
		
		
		String recover = "";
		recover = "1234567890";
		int j = 0;
		String resultDoc ="";

		for(int i=0; i < (recover.length()/3); i++) {
			resultDoc = resultDoc + recover.substring(j, j+3) + ".";
			j = j + 3;
			System.out.println(resultDoc);
			System.out.println(i);
		}

		
	}

}

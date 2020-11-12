package main;

class Text {
	
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
	
}

public class Palindromo {

	public static boolean isPalindromo(String text){
		boolean resp=true;
		String textr="";
		for(int i=text.length()-1;i>=0;i--) {
			textr+=text.charAt(i);
		}
		if(textr.equals(text)==true){
			return resp;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		String text;
		text=MyIO.readString();
		while(text.equals("FIM")!=true){
			boolean resp;
			resp=isPalindromo(text);
			if(resp){
				MyIO.println("SIM");
			}else{
				MyIO.println("NAO");
			}
			text=MyIO.readString();
		}
		
	}
}
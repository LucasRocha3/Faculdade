public class IsRecursivo {
	static boolean isVogal(String str, int i) {
		str = str.toLowerCase();
		if(i==str.length()-1) {
			return true;
		}else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			return isVogal(str,i+1);
		}else {
			return false;
		}
	}
	static boolean isConsoante(String str,int i) {
		str = str.toLowerCase();
		char a=str.charAt(i);
		if(i==str.length()-1){
			return true;
		}else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
			return false;
		}else if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'){
			return false;
		}else{
			return isConsoante(str, i+1);
		}
		
	}
	static boolean isInteiro(String str,int i) {
		char a=str.charAt(i);
		if(i==str.length()-1){
			return true;
		}else if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'){
			return isInteiro(str, i+1);
		}else{
			return false;
		}
	}
	static boolean isReal(String str,int i,int x) {
		char a=str.charAt(i);
		if(i==str.length()-1){
			return true;
		}else if(x>=1){
			return false;
		}else if(a=='.'||a==','){
			return isReal(str, i+1,x+1);
		}else if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'){
			return isReal(str, i+1,x);
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		String str;
		str=MyIO.readLine();
		while(str.equals("FIM")!=true) {
			String X1,X2,X3,X4;
			if(isVogal(str,0)) {
				X1="SIM";
			}else {
				X1="NAO";
			}
			if(isConsoante(str,0)) {
				X2="SIM";
			}else {
				X2="NAO";
			}
			if(isInteiro(str,0)) {
				X3="SIM";
			}else {
				X3="NAO";
			}
			if(isReal(str,0,0)) {
				X4="SIM";
			}else {
				X4="NAO";
			}
			MyIO.println(X1+" "+X2+" "+X3+" "+X4);
			str=MyIO.readLine();
		}
	}

}

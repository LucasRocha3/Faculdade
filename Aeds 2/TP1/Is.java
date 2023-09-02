public class Is {
	static boolean isVogal(String str) {
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	static boolean isConsoante(String str) {
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				return false;
			}
			char a=str.charAt(i);
			if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0') {
				return false;
			}
		}
		return true;
	}
	static boolean isInteiro(String str) {
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0') {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	static boolean isReal(String str) {
		int x=0;
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'||a=='0'||a=='.'||a==',') {
				if(a=='.'||a==',') {
					x++;
					if(x>1) {
						return false;
					}
				}
			}else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str;
		str=MyIO.readLine();
		while(str.equals("FIM")!=true) {
			String X1,X2,X3,X4;
			if(isVogal(str)) {
				X1="SIM";
			}else {
				X1="NAO";
			}
			if(isConsoante(str)) {
				X2="SIM";
			}else {
				X2="NAO";
			}
			if(isInteiro(str)) {
				X3="SIM";
			}else {
				X3="NAO";
			}
			if(isReal(str)) {
				X4="SIM";
			}else {
				X4="NAO";
			}
			MyIO.println(X1+" "+X2+" "+X3+" "+X4);
			str=MyIO.readLine();
		}
	}

}

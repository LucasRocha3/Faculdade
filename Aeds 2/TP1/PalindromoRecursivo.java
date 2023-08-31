

class PalindromoRecursivo{
    static boolean isPalindromo(String text,int i){
        if(i==text.length()/2){
            return true;
        }
        if(text.charAt(i)==text.charAt(text.length()-1-i)){
            return isPalindromo(text, i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String text;
        text=MyIO.readLine();
        while(text.equals("FIM")!=true){
            int i=0;
            if(isPalindromo(text,i)){
                MyIO.println("SIM");
            }else{
                MyIO.println("NAO");
            }
            text=MyIO.readLine();
        }
    }
}
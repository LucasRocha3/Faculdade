import java.io.RandomAccessFile;

public class Arquivo {
    public static void main(String[] args) throws Exception {
		RandomAccessFile arq1 = new RandomAccessFile("exemplo.txt","rw");
		int n;	
		double num;

        n = MyIO.readInt();	

		for(int i=0;i<n;i++){
			num = MyIO.readDouble();
			arq1.writeDouble(num);
		}
			
		RandomAccessFile arq2 = new RandomAccessFile("exemplo.txt", "r");
			
		long tam=arq2.length();
		
		while(tam>0) {
			tam -= 8; //8 e o tamanho double
			arq2.seek(tam);
			num = arq2.readDouble();
            if(num%1==0){
			    MyIO.println((int)num);
            }else{
                MyIO.println(num);
            }
		}
			
		arq1.close();
        arq2.close();
	}
}

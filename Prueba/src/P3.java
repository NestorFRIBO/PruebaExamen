
public class P3 {
	
	static String Frase = "Paco@es@un c1ch4nd4";
	static String subFrase1 = "Paco@es@un";
	static String subFrase2 = " c1ch4nd4";
	static String codificada = "";
	

	public static void main(String[] args){
		
		for(int i=0;i<subFrase1.length();i++){
			if (subFrase1.substring(i, i + 1).contains("@")){
				codificada = codificada + " ";
			}else{
				codificada = codificada + subFrase1.substring (i ,i + 1);
			
			}
			
			}
		
		for(int i=0;i<subFrase2.length();i++){
			if (subFrase2.substring(i, i + 1).contains("1")){
				codificada = codificada + "a";
			}else if  (subFrase2.substring(i, i + 1).contains("4")){
				codificada = codificada + "o";
			}else{
				codificada = codificada + subFrase2.substring (i ,i + 1);
			}
		}
		
		System.out.println(codificada);
	}
}


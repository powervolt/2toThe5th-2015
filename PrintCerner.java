
public class PrintCerner {
	public static void main(String[] args){
		for (long l = 125779970254179L; l > 0; l >>= 8){
		    System.out.print((char) (((l & 31 | 64) % 95) + 32));
		}
	}
}

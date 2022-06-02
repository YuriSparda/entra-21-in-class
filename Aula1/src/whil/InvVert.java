package whil;

public class InvVert {

	public static void main(String[] args) {
		int num[]= new int[101];
		int X = 101;
		for (int i = 0; i < num.length; i++) {
			num[i]=+i;
			System.out.println("["+i+"] = "+num[i]);}
			
		for (int i = 0; i <101; i++) {
			System.out.println("["+i+"] = "+num[X-1]);
			X=X-1;
		}
	}

}

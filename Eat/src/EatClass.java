
public class EatClass {

	public static void main(String[] args) {
		

		int dennis = 300;
		int alex = 450;
		int timon = 390;
		
		int average = (dennis + alex + timon) / 3; 
		
		int payDennis = dennis - average; 
		int payAlex = alex - average; 
		int payTimon = timon - average;
		
		System.out.println("Dennis:" + payDennis);
		System.out.println("Alex:" + payAlex);
		System.out.println("Timon:" + payTimon);
		
	}

}

package ProgrammingPractice;

public class Power {
	public static void main(String[] args) {
		int base =3;
		int expo =5;
		int power =1;
		
		for(int i =1;i<=base;i++) {
			power=power*expo;
		}
		System.out.println(power);
	}

}

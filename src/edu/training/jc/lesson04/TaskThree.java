package edu.training.jc.lesson04;

public class TaskThree {

	public static void main(String[] args) {
		int x1 = 2;
		int y1 = 3;
		int x2 = 4;
		int y2 = 5;
		int x3 = 6;
		int y3 = 7;
		double ab;
		double bc;
		double ac;

		ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

		if (ab > bc && ab > ac) {
			System.out.println("Гипотенуза = " + ab + "\nКатеты = " + bc + " и " + ac);
		} else if (bc > ab && bc > ac) {
			System.out.println("Гипотенуза = " + bc + "\nКатеты = " + ab + " и " + ac);
		} else
			System.out.println("Гипотенуза = " + ac + "\nКатеты = " + ab + " и " + bc);
	}

}

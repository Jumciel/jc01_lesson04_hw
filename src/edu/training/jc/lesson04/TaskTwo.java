package edu.training.jc.lesson04;

public class TaskTwo {

	public static void main(String[] args) {
		int x1 = 4;
		int y1 = 7;
		int x2 = 6;
		int y2 = 9;
		double distance;

		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Расстояние между центрами двух окружностей = " + distance);

	}

}

package edu.training.jc.lesson04;

public class TaskSeven {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		double mediumPow;
		double mediumAbs;

		mediumPow = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
		mediumAbs = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое квадратов двух чисел = " + mediumPow
				+ "\nСреднее геометрическое модулей двух чисел = " + mediumAbs);
	}

}

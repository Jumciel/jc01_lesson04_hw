package edu.training.jc.lesson04;

public class TaskEight {

	public static void main(String[] args) {
		double size = 7;
		double hight = 10;
		double perimeter;
		double square;
		double volume;

		perimeter = 6 * size;
		square = ((3 * Math.sqrt(3)) / 2) * Math.pow(size, 2);
		volume = square * hight;

		System.out.println(
				"Периметр призмы = " + perimeter + "\nПлощадь призмы = " + square + "\nОбъём призмы = " + volume);
	}

}

package edu.training.jc.lesson04;

public class TaskTen {

	public static void main(String[] args) {
		double radius = 4;
		double volume;
		double square;

		volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
		square = 4 * Math.PI * Math.pow(radius, 2);

		System.out.println("Объём шара = " + volume + "\nПлощадь шара = " + square);

	}

}

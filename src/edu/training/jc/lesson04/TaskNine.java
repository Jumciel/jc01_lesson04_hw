package edu.training.jc.lesson04;

public class TaskNine {

	public static void main(String[] args) {
		double size = 7;
		double square;
		double diagonal;
		double radIn;
		double radOut;

		square = Math.pow(size, 2);
		diagonal = size * Math.sqrt(2);
		radIn = size / 2;
		radOut = diagonal / 2;

		System.out.println("Площадь квадрата = " + square + "\nДиагональ квадрата = " + diagonal
				+ "\nРадиус вписанной окружности = " + radIn + "\nРадиус описанной окружности = " + radOut);

	}

}

package edu.training.jc.lesson04;

public class TaskFour {

	public static void main(String[] args) {
		int r = 10;
		int alfa = 125;
		double circumference;
		double square;

		circumference = (Math.PI * r * alfa) / 180;
		square = (Math.PI * Math.pow(r, 2) * alfa) / 360;

		System.out.println("Длина дуги окружности = " + circumference + "\nПлощадь сектора окружности = " + square);
	}

}

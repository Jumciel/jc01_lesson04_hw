package edu.training.jc.lesson04;

public class TaskSix {

	public static void main(String[] args) {
		int number = 1234;
		int sum = 0;
		int count = 0;

		while (number > 0) {
			count = number % 10;
			number = number / 10;
			sum = sum + count;
		}
		
		System.out.println("Сумма цифр заданного числа = " + sum);
	}

}

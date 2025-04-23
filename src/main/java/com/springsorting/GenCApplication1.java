package com.springsorting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GenCApplication1 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Get the GreetingService bean
		SortService sortService = context.getBean(SortService.class);

		int[] sortedNumbers = sortService.sortNumbers(new int[] { 5, 3, 8, 1, 2 });
		System.out.println("Sorted numbers: ");
		for (int number : sortedNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();

	}

}

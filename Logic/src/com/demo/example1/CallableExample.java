package com.demo.example1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Integer> {
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.println("Calculating Sum, Current Value: " + sum);
			Thread.sleep(1000);
		}
		return sum;
	}
}

public class CallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Callable<Integer> taCallable = new Task();

		Future<Integer> future = executorService.submit(taCallable);
		try {
			System.out.println("Main Thred is doing some other work");
			Integer result = future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}
}

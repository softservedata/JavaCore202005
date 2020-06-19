package com.softserve.edu12c;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private int sym;

	public WorkerThread(int sym) {
		this.sym = sym;
	}

	public void run() {
		System.out.print("ID = " + Thread.currentThread().getId() + " ");
		for (int i = 0; i < 4; i++) {
			System.out.print(sym + " ");
		}
		//System.out.println(" DONE " + sym + " ");
	}
}

public class Appl {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(i);
			// calling execute method of ExecutorService
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}
}

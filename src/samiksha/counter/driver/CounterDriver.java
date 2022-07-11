package samiksha.counter.driver;
import java.util.Scanner;

import samiksha.counter.service.CounterService;
import samiksha.counter.service.MergeSortImplementation;
public class CounterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize, amount;

		Scanner value = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		arraySize = value.nextInt();
		int notes[]= new int [arraySize];
		
		System.out.println("Enter the currency denominations value");
		
		for(int i=0;i<arraySize;i++) {
			notes[i] = value.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		
		amount = value.nextInt();
		
		CounterService counter = new CounterService();
		MergeSortImplementation mergeSortImplement = new MergeSortImplementation();
		
		mergeSortImplement.sort(notes,0,notes.length-1);
		counter.noteCount(notes,amount);
	}
}

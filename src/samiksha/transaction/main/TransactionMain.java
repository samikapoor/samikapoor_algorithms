package samiksha.transaction.main;
import java.util.Scanner;
import samiksha.transaction.service.TransactionService;

public class TransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		int arraySize, targetNumber;
		
		System.out.println("Enter the size of transaction array");
		arraySize = getInput.nextInt();
		
		int array[] = new int[arraySize];
		
		for(int i=0;i<arraySize;i++) {
			array[i] = getInput.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		targetNumber = getInput.nextInt();
		
		TransactionService transactionInfo = new TransactionService();
		
		transactionInfo.targetStatus(array, targetNumber);
		getInput.close();
	}

}

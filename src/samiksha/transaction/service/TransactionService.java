package samiksha.transaction.service;
import java.util.Scanner;

public class TransactionService {
	
	public void targetStatus(int arr[],int size) {
		Scanner getInput = new Scanner(System.in);

		while(size-- != 0) {
			boolean status = false;
			
			int targetValue;
			System.out.println("Enter the value of target");
			targetValue = getInput.nextInt();
			
			int sum = 0;
			for(int i=0;i<arr.length;i++) {
				sum += arr[i];
				
				if(sum >= targetValue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					
					status = true;  
					break;
				}
			}
			
			if(status == false) {
				System.out.println("Given target is not achieved");
			}
		}
		
		getInput.close();
	}
}

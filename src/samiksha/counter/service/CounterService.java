package samiksha.counter.service;

public class CounterService {

	public void noteCount(int arr[], int amount) {
		int noteCount[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(amount >=arr[i]) {
				noteCount[i] = amount / arr[i];
				amount = amount - noteCount[i] * arr[i];
			}
		}
		if(amount > 0) {
			System.out.println("exact amount can not be given with the highest denomination");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			
			for(int i=0;i<arr.length;i++) {
				if(noteCount[i] != 0) {
					System.out.println(arr[i] + ":" + noteCount[i]);
				}
			}
			
		}
	}
}

package samiksha.counter.service;
import samiksha.counter.sort.MergeSort;

public class MergeSortImplementation {
	public void sort(int arr[], int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(arr,left,mid);
			sort(arr, mid+1,right);
			
			MergeSort mergeSort = new MergeSort();
			
			mergeSort.merge(arr,left, mid, right);
		}
	}
}

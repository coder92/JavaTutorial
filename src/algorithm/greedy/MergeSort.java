package algorithm.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		List<Integer> list = new ArrayList<Integer>();
		
		Random r = new Random();
		for(int i=0;i<100;i++) {
			list.add(r.nextInt());
		}
		
		System.out.println("List Before Sorting>>");
		System.out.println(list);
		
		list = ms.mergeSort(list);
		System.out.println("List After Sorting>>");
		System.out.println(list);
	}

	private List<Integer> mergeSort(List<Integer> list) {
		
		return null;
	}

}

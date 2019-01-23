package algorithm.hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Random r = new Random();
		for(int i=0;i<100;i++) {
			list.add(r.nextInt());
		}
		
		System.out.println("List Before Sorting>>");
		System.out.println(list);
		
		Quicksort qs = new Quicksort();
		
		list = qs.quickSort(list);
		System.out.println("List After Sorting>>");
		System.out.println(list);
		
	}
	
	public List<Integer> quickSort(List<Integer> numbers){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(numbers.size()<2) return numbers;
		List<Integer> lower = new ArrayList<Integer>();
		List<Integer> higher = new ArrayList<Integer>();
		
		int pivot = numbers.get(0);
		
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)<pivot) {
				lower.add(numbers.get(i));
			}else if(numbers.get(i)>pivot){
				higher.add(numbers.get(i));
			}
		}
		
		
		List<Integer> sortedList = quickSort(lower);
		System.out.println("List after lower added-> "+sortedList);
		sortedList.add(pivot);
		System.out.println("List after pivot added-> "+sortedList);
		sortedList.addAll(quickSort(higher));
		System.out.println("List after higher added-> "+sortedList);
		return sortedList;
		
	}

}

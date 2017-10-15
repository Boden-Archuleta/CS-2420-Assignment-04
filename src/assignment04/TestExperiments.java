package assignment04;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestExperiments {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectionSort() {
		Integer[] data = Experiments.generateIntegers(100, 10);
		Integer[] dataToSort = new Integer[100];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		Experiments.insertionSort(dataToSort, 0, data.length - 1, new Comparator<Integer>(){
			public int compare(Integer left, Integer right){
				return left.compareTo(right);
			}
		});
		
		Experiments.sortCheck(data, dataToSort, new Comparator<Integer>(){
			public int compare(Integer left, Integer right){
				return left.compareTo(right);
			}
		}, true);
	}
	
//	@Test
//	public void hackTest(){
//		Integer[] data = {100, 5, 8, 2, 4, 12, 34, 1, 7, 55, 3};
//		
//		Experiments.quicksort(data, new Comparator<Integer>(){
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}	
//		});
//		
//		for (int i = 0; i < data.length; i++){
//			System.out.println(data[i]);
//		}
//	}
	
	@Test 
	public void testQuickSort(){
		String[] data = Experiments.generateMixedStrings(50, 10);
		String[] dataToSort = new String[50];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		Experiments.quicksort(data, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}	
		});
		
		for (int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, false);
	}

	@Test
	public void testQuickSortCutoff(){
		String[] data = Experiments.generateMixedStrings(50, 10);
		String[] dataToSort = new String[50];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		Experiments.quicksortWithCutoff(data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, 5);
		
		for (int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, false);
	}
}

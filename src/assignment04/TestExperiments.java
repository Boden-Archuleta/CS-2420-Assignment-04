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
		Integer[] data = Experiments.generateIntegers(20, 1);
		Integer[] dataToSort = new Integer[20];
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
		
		//assertEquals(113, Experiments.comparisonCount);
//		System.out.println("selectionSort: " + Experiments.comparisonCount);
//		Experiments.comparisonCount = 0;
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
		String[] data = Experiments.generateMixedStrings(20, 1);
		String[] dataToSort = new String[20];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		Experiments.quicksort(data, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}	
		});
		
//		for (int i = 0; i < data.length; i++){
//			System.out.println(data[i]);
//		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, false);
		
		//assertEquals(67, Experiments.comparisonCount);
//		System.out.println("quickSort: " + Experiments.comparisonCount);
//		Experiments.comparisonCount = 0;		
	}

	@Test
	public void testQuickSortCutoff(){
		String[] data = Experiments.generateMixedStrings(20, 1);
		String[] dataToSort = new String[20];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		Experiments.quicksortWithCutoff(data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, 7);
		
//		for (int i = 0; i < data.length; i++){
//			System.out.println(data[i]);
//		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, false);
		
//		System.out.println("quickSort w/cutoff: " + Experiments.comparisonCount);
//		Experiments.comparisonCount = 0;
	}
	
	@Test
	public void testTwoWayMerge(){
		String[] data = Experiments.generateMixedStrings(20, 1);
		String[] dataToSort = new String[20];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
//		String[] data = {"e", "a", "c", "f", "w", "b", "x", "r"};
		
		Experiments.twoWayMergesort(data, new Comparator<String>(){
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});
		
//		for (int i = 0; i < data.length; i++){
//			System.out.println(data[i]);
//		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<String>(){
			public int compare(String left, String right){
				return left.compareTo(right);
			}
		}, true);
		
//		System.out.println("twoWayMerge: " + Experiments.comparisonCount);
//		Experiments.comparisonCount = 0;
	}
	
	@Test
	public void testThreeWayMerge(){
		Integer[] data = Experiments.generateIntegers(20, 1);
		Integer[] dataToSort = new Integer[20];
		System.arraycopy(data, 0, dataToSort, 0, data.length);
		
		//Integer[] data = {3, 1, 4, 8};
		
		Experiments.threeWayMergesort(data, new Comparator<Integer>(){
			public int compare(Integer left, Integer right){
				return left.compareTo(right);
			}
		});
		
//		for (int i = 0; i < data.length; i++){
//			System.out.println(data[i]);
//		}
		
		Experiments.sortCheck(dataToSort, data, new Comparator<Integer>(){
			public int compare(Integer left, Integer right){
				return left.compareTo(right);
			}
		}, true);
		
//		System.out.println("threeWayMerge: " + Experiments.comparisonCount);
//		Experiments.comparisonCount = 0;
	}
}


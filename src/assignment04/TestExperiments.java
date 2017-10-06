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
		}, false);
	}

}

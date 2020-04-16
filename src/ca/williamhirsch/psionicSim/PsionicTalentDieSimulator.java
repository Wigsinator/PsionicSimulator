package ca.williamhirsch.psionicSim;

import java.util.Arrays;

public class PsionicTalentDieSimulator {

	public static void main(String[] args) {
		int tests = 10000;
		System.out.println("Psionic Talent Die Simulator");
		System.out.format("Running %d tests per level%n", tests);
		System.out.println("==================");
		System.out.println("Level 3");
		simulate(tests, new SixSidedDie(), 6);
		System.out.println("==================");
		System.out.println("Level 5");
		simulate(tests, new EightSidedDie(), 8);
		System.out.println("==================");
		System.out.println("Level 11");
		simulate(tests, new TenSidedDie(), 10);
		System.out.println("==================");
		System.out.println("Level 17");
		simulate(tests, new TwelveSidedDie(), 12);
		
	}

	
	public static double getMean(int[] array) {
		double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return total/array.length;
	}
	
	public static double getMedian(int[] array) {
		Arrays.sort(array);
		int n = array.length;
		
		if (array.length % 2 != 0) {
			return (double)array[n/2];
		} else {
			return (double)(array[(n-1)/2]+array[n/2])/2.0;
		}
	}
	
	public static void simulate(int tests,Die startingDie, int maxSize) {
		int count;
		Die die;
		int roll;
		double mean;
		double median;
		int[] rollsPerTest = new int[tests];
		for (int i = 0; i < tests; i++) {
			count = 0;
			die = startingDie; //Technically returns to the same starting instance of the first die, 
			while (die != null) {//but several integers into the stream, so it shouldn't matter.
				count += 1;
				roll = die.roll();
				if (roll == die.getSize()) {
					die = die.decrease();
				}
				if (roll == 1 && die.getSize() != maxSize) {
					die = die.increase();
				}
			}
			rollsPerTest[i] = count;
		}
		mean = getMean(rollsPerTest);
		median = getMedian(rollsPerTest);
		
		System.out.format("Mean number of rolls: %.3f%n", mean);
		System.out.format("Median number of rolls: %.1f%n", median);
	}
}

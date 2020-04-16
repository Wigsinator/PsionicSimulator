package ca.williamhirsch.psionicSim;

import java.util.Random;

abstract class Die {
	private int size;
	private Random randomizer;
	
	public Die() {
		randomizer = new Random();
	}
	
	int roll() {
		return randomizer.nextInt(size)+1;
	}
	
	Die increase() {
		return null;
	}
	
	Die decrease() {
		return null;
	}
	
	int getSize() {
		return size;
	}
}

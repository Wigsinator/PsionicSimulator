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
	
	abstract Die increase();
	
	abstract Die decrease();
	
	void setSize(int size) {
		this.size = size;
	}
	
	int getSize() {
		return size;
	}
}

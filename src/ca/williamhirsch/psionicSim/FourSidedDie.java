package ca.williamhirsch.psionicSim;

public class FourSidedDie extends Die {
	
	public FourSidedDie() {
		super();
		setSize(4);
	}

	@Override
	Die increase() {
		return new SixSidedDie();
	}

	@Override
	Die decrease() {
		return null;
	}
	
}

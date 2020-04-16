package ca.williamhirsch.psionicSim;

public class SixSidedDie extends Die {
	
	public SixSidedDie() {
		super();
		setSize(6);
	}

	@Override
	Die increase() {
		return new EightSidedDie();
	}

	@Override
	Die decrease() {
		return new FourSidedDie();
	}

}

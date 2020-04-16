package ca.williamhirsch.psionicSim;

public class TenSidedDie extends Die {

	public TenSidedDie() {
		super();
		setSize(10);
	}

	@Override
	Die increase() {
		return new TwelveSidedDie();
	}

	@Override
	Die decrease() {
		return new EightSidedDie();
	}

}

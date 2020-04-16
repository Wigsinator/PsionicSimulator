package ca.williamhirsch.psionicSim;

public class EightSidedDie extends Die {
	
	public EightSidedDie() {
		super();
		setSize(8);
	}

	@Override
	Die increase() {
		// TODO Auto-generated method stub
		return new TenSidedDie();
	}

	@Override
	Die decrease() {
		return new SixSidedDie();
	}

}

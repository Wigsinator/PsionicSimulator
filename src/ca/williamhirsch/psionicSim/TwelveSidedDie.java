package ca.williamhirsch.psionicSim;

public class TwelveSidedDie extends Die {

	public TwelveSidedDie() {
		super();
		setSize(12);
	}

	@Override
	Die increase() {// A d12 is the max size a Psionic Talent Die can reach,
		return this;// thus, instead of increasing, just stay the same
	}

	@Override
	Die decrease() {
		return new TenSidedDie();
	}

}

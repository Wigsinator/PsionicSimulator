package ca.williamhirsch.psionicSim;

public interface Die {
	int roll();
	Die increase();
	Die decrease();
}

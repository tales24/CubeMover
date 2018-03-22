package de.inmediasp.nxt;

public enum RotationAngles {
	QUARTER(270),
	HALF(540),
	THREE_QUARTERS(810);
	
	private final int angle;
	
	RotationAngles(int angle) {
		this.angle = angle;
	}
	
	public int getIntValue() {
		return this.angle;
	}
}

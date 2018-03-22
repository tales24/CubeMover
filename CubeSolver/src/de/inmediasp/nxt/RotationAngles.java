package de.inmediasp.nxt;

public enum RotationAngles {
	QUARTER(90, 270),
	HALF(180, 540),
	THREE_QUARTERS(270, 810),
	FULL(360, 1080);
	
	private final int angle;
	private final int translatedAngle;
	
	RotationAngles(int angle, int translatedAngle) {
		this.angle = angle;
		this.translatedAngle = translatedAngle;
	}
	
	public int getIntValue() {
		return this.angle;
	}
	
	public int getTranslatedAngle() {
		return this.translatedAngle;
	}
}

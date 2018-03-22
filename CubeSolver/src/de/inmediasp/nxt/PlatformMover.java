package de.inmediasp.nxt;

import lejos.nxt.NXTRegulatedMotor;

public class PlatformMover {
	private NXTRegulatedMotor cubePlatform;

	public PlatformMover(final NXTRegulatedMotor nxtRegulatedMotor) {
		this.cubePlatform = nxtRegulatedMotor;
		this.cubePlatform.setSpeed(360);
	}
	
	public NXTRegulatedMotor getCubePlatform() {
		return cubePlatform;
	}

	public void setCubePlatform(NXTRegulatedMotor cubePlatform) {
		this.cubePlatform = cubePlatform;
	}
	
	public void rotatePlatformClockwise(int angle) {
		cubePlatform.rotate(-1 * angle);
	}
	
	public void rotatePlatformCounterClockwise(int angle) {
		cubePlatform.rotate(angle);
	}
}

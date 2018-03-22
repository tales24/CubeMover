package de.inmediasp.nxt;

import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.UltrasonicSensor;

public class ArmMover {
	private NXTRegulatedMotor cubeArm;
	private UltrasonicSensor ultrasonicSensor;
	
	public ArmMover(final NXTRegulatedMotor nxtRegulatedMotor, final UltrasonicSensor ultrasonicSensor) {
		this.cubeArm = nxtRegulatedMotor;
		this.cubeArm.setSpeed(360);
		
		this.ultrasonicSensor = ultrasonicSensor;
		this.ultrasonicSensor.continuous();
	}
	
	public void resetArm() {
//		if (ultrasonicSensor.getDistance() < 10.5) {
			cubeArm.rotate(180);
			cubeArm.resetTachoCount();
//		}
	}
	
	public void flipCube() {
		cubeArm.rotate(-1 * RotationAngles.FULL.getIntValue());
		
		if (ultrasonicSensor.getDistance() > 15) {
			cubeArm.rotate(-1 * RotationAngles.HALF.getIntValue());
			cubeArm.rotate(RotationAngles.HALF.getIntValue());
		}
	}

	public void grabCube() {
		cubeArm.rotate(-1 * RotationAngles.HALF.getIntValue());		
	}

	public void releaseCube() {
		cubeArm.rotate(RotationAngles.HALF.getIntValue());
	}
}

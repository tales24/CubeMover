package de.inmediasp.nxt;

import java.util.ArrayList;
import java.util.List;

import lejos.util.Delay;

public class MoveController {
	private static final List<String> AVAILABLE_MOVEMENTS = new ArrayList<>();
	
	private ArmMover armMover;
	private PlatformMover platformMover;
	
	public MoveController(final ArmMover armMover, final PlatformMover platformMover) {
		this.armMover = armMover;
		this.platformMover = platformMover;
		
		initializeMovementList();
	}
	
	private void initializeMovementList() {
		AVAILABLE_MOVEMENTS.add("R");
		AVAILABLE_MOVEMENTS.add("r");
		AVAILABLE_MOVEMENTS.add("L");
		AVAILABLE_MOVEMENTS.add("l");
		AVAILABLE_MOVEMENTS.add("U");
		AVAILABLE_MOVEMENTS.add("u");
		AVAILABLE_MOVEMENTS.add("D");
		AVAILABLE_MOVEMENTS.add("d");
		AVAILABLE_MOVEMENTS.add("F");
		AVAILABLE_MOVEMENTS.add("f");
		AVAILABLE_MOVEMENTS.add("B");
		AVAILABLE_MOVEMENTS.add("b");
		AVAILABLE_MOVEMENTS.add("X");
		AVAILABLE_MOVEMENTS.add("x");
		AVAILABLE_MOVEMENTS.add("Y");
		AVAILABLE_MOVEMENTS.add("y");
	}
	
	public void movement_D() {
		armMover.grabCube();
		movement_X();
		armMover.releaseCube();
	}
	
	public void movement_X() {
		platformMover.rotatePlatformClockwise(RotationAngles.QUARTER.getTranslatedAngle());
	}
	
	public void movement_x() {
		platformMover.rotatePlatformCounterClockwise(RotationAngles.QUARTER.getTranslatedAngle());
	}

	public void movement_Y() {
		armMover.flipCube();
	}
	
	public void movement_y() {
		armMover.flipCube();
		armMover.flipCube();
		armMover.flipCube();
	}

	public void reset() {
		armMover.resetArm();
	}
	
	public void scanSequence() {
		// Up
		Delay.msDelay(1000);
		movement_Y();
		
		// Front
		Delay.msDelay(1000);
		movement_Y();
		
		// Down
		Delay.msDelay(1000);
		movement_Y();
		
		// Back
		Delay.msDelay(1000);
		movement_Y();
		movement_x();
		movement_Y();
		
		// Left
		Delay.msDelay(1000);
		movement_Y();
		movement_Y();

		// Right
		Delay.msDelay(1000);
		movement_Y();
		movement_X();
	}
}
package de.inmediasp.nxt;

import java.util.ArrayList;
import java.util.List;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class MoveController {
	private static final List<String> AVAILABLE_MOVEMENTS = new ArrayList<>();
	
	public MoveController() {
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
	
	public void movement_X(final PlatformMover platformMover) {
		platformMover.rotatePlatformClockwise(RotationAngles.QUARTER);
	}
	
	public void movement_x(final PlatformMover platformMover) {
		platformMover.rotatePlatformCounterClockwise(RotationAngles.QUARTER);
	}

}
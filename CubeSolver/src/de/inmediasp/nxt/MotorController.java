package de.inmediasp.nxt;

import java.util.ArrayList;
import java.util.List;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;

public class MotorController {
	private static final List<String> AVAILABLE_MOVEMENTS = new ArrayList<>();
	
	public MotorController() {
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
	
	public static void main(String[] args) {
		final MotorController motorController = new MotorController();
		
		final NXTRegulatedMotor cubePlatform = new NXTRegulatedMotor(MotorPort.A);
		final NXTRegulatedMotor cubeArm = new NXTRegulatedMotor(MotorPort.C);
		
//		final List<String> movements = motorController.validateInput(args[0]);
//		if (movements.size() == 0) {
//			return;
//		}
		
//		motorController.resetPlatform(cubePlatform);
		motorController.resetArm(cubeArm);
 	}
	
	private void resetArm(final NXTRegulatedMotor cubeArm) {
		cubeArm.setSpeed(180);
//		cubeArm.rotateTo(-0);
		
		LCD.drawInt(cubeArm.getAcceleration(), 0, 0); //6000, 
		LCD.drawInt(cubeArm.getLimitAngle(), 0, 1); // 0
		LCD.drawInt(cubeArm.getPosition(), 0, 2); // 0
		LCD.drawInt(cubeArm.getTachoCount(), 0, 3); //0
		
		Button.waitForAnyPress();

//		cubeArm.rotate(-180);
	}

	private void resetPlatform(final NXTRegulatedMotor cubePlatform) {
		cubePlatform.rotate(140);
		cubePlatform.rotateTo(0);
	}

	private List<String> validateInput(final String input) {
		final List<String> movements = new ArrayList<>(split(input));
	
		for (int i=0; i<movements.size(); i++) {
			if (!AVAILABLE_MOVEMENTS.contains(movements.get(i))) {
				return new ArrayList<>();
			}
		}
		
		return movements;
	}
	
	private List<String> split(final String stringToSplit) {
		final List<String> splittedString = new ArrayList<>();
		
		for (int i=0; i<stringToSplit.length(); i++) {
			splittedString.add((String) stringToSplit.subSequence(i, 1));
		}
		
		return splittedString;
	}
}
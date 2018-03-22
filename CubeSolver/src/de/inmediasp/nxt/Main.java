package de.inmediasp.nxt;

import java.util.ArrayList;
import java.util.List;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class Main {
	public static void main(String[] args) {
		final MoveController moveController = new MoveController();
		final PlatformMover platformMover = new PlatformMover(new NXTRegulatedMotor(MotorPort.A));
		final ArmMover armMover = new ArmMover(new NXTRegulatedMotor(MotorPort.C), new UltrasonicSensor(SensorPort.S1));
	
		armMover.resetArm();
		
		moveController.movement_X(platformMover);
		moveController.movement_x(platformMover);
 	}
	
	
//	private List<String> validateInput(final String input) {
//		final List<String> movements = new ArrayList<>(split(input));
//	
//		for (int i=0; i<movements.size(); i++) {
//			if (!AVAILABLE_MOVEMENTS.contains(movements.get(i))) {
//				return new ArrayList<>();
//			}
//		}
//		
//		return movements;
//	}
//	
//	private List<String> split(final String stringToSplit) {
//		final List<String> splittedString = new ArrayList<>();
//		
//		for (int i=0; i<stringToSplit.length(); i++) {
//			splittedString.add((String) stringToSplit.subSequence(i, 1));
//		}
//		
//		return splittedString;
//	}
}

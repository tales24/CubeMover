package de.inmediasp.nxt;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class Main {
	public static void main(String[] args) {
		final PlatformMover platformMover = new PlatformMover(new NXTRegulatedMotor(MotorPort.A));
		final ArmMover armMover = new ArmMover(new NXTRegulatedMotor(MotorPort.C), new UltrasonicSensor(SensorPort.S1));

		final MoveController moveController = new MoveController(armMover, platformMover);
		
		moveController.movement_D();
 	}
}

package de.inmediasp.nxt;

import java.io.IOException;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class Main {
	public static void main(String[] args) {		
		
//		Importer importer = new Importer();		
//		importer.convertTxtFileToInput("C:\\Users\\qri2\\Desktop\\Testdukoment.txt");
		
		final PlatformMover platformMover = new PlatformMover(new NXTRegulatedMotor(MotorPort.A));
		final ArmMover armMover = new ArmMover(new NXTRegulatedMotor(MotorPort.C), new UltrasonicSensor(SensorPort.S1));

		final MoveController moveController = new MoveController(armMover, platformMover);
		
		moveController.reset();
		moveController.movement_D();
		Delay.msDelay(1000);
		moveController.movement_d();
 	}
}

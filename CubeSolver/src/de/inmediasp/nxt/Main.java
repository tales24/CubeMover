package de.inmediasp.nxt;

import java.util.List;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class Main {
	public static void main(String[] args) {		
		
		
		final PlatformMover platformMover = new PlatformMover(new NXTRegulatedMotor(MotorPort.A));
		final ArmMover armMover = new ArmMover(new NXTRegulatedMotor(MotorPort.C), new UltrasonicSensor(SensorPort.S1));

		final MoveController moveController = new MoveController(armMover, platformMover);
		
		Importer importer = new Importer();		
		List<String> rotations = importer.convertTxtFileToInput("C:\\Users\\qri2\\Desktop\\Testdukoment.txt");
		
		for (String rotation : rotations) {
			
			switch (rotation) {
			case "R":
				moveController.movement_R();
				break;
			case "r":
				moveController.movement_r();
				break;
			case "L":
				moveController.movement_L();
				break;
			case "l":
				moveController.movement_l();
				break;
			case "U":
				moveController.movement_U();
				break;
			case "u":
				moveController.movement_u();
				break;
			case "D":
				moveController.movement_D();
				break;
			case "d":
				moveController.movement_d();
				break;
			case "F":
				moveController.movement_F();
				break;
			case "f":
				moveController.movement_f();
				break;
			case "B":
				moveController.movement_B();
				break;
			case "b":
				moveController.movement_b();
				break;
			case "X":
				moveController.movement_X();
				break;
			case "x":
				moveController.movement_x();
				break;
			case "Y":
				moveController.movement_Y();
				break;
			case "y":
				moveController.movement_y();
				break;			

			default:
				break;
			}
			
			
		}
		
//		moveController.reset();
//		moveController.movement_f();
//		Delay.msDelay(1000);
//		moveController.movement_F();
 	}
}

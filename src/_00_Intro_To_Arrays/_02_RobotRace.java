package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		Random ran = new Random();
        // 2. create an array of 5 robots.
		Robot[] robots = new Robot[ran.nextInt(10)];
        // 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(1000);
		}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
//			robots[i].moveTo(100*(i+1), 550);
			robots[i].turn(90);
			robots[i].moveTo(100, 550);
		}
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		for (int i=0; i<robots.length; i++) {
			robots[i].move(ran.nextInt(50));
		}
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
		boolean raceFinished = false;
		while (!raceFinished) {
			for (int i=0; i<robots.length; i++) {
				robots[i].move(ran.nextInt(50));
				if (robots[i].getX()>700) {
					robots[i].turn(-90);
					robots[i].move(400);
				}
				
//				if (robots[i].getY()<0) {
//					raceFinished=true;
//				}
			}
			
		}
        // 7. declare that robot the winner and throw it a party!
		for (int i = 0; i<robots.length; i++) {
//			if (robots[i].getY()<0) {
//				JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " won!");
//			}
			
		}
		
        // 8. try different races with different amounts of robots.
		
        // 9. make the robots race around a circular track.
	}
}

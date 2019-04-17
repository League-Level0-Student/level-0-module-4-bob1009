import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shapemethods {
public static void main(String[] args) {
	shapemethods sm=new shapemethods();
}
shapemethods(){
	Robot rob=new Robot();
//	Robot bob=new Robot();
//	drawsquare(rob);
//	bob.moveTo(100,100);
//	drawsquare(bob);
	//drawtriangle(rob);
	drawshape(90,7,rob);
}

void drawsquare(Robot rob ){
	rob.penDown();
	rob.setSpeed(10);
	for (int i = 0; i < 4; i++) {
		rob.move(50);
		rob.turn(90);
	}
}
void drawtriangle(Robot rob) {
	rob.penDown();
	rob.setSpeed(100);
	for (int i = 0; i < 3; i++) {
	rob.turn(120);
	rob.move(75);
	}
}
void drawshape(int size,int sides, Robot rob){
	 rob.penDown();
	 rob.setSpeed(10);
	 for (int i = 0; i < sides; i++) {
		rob.move(size);
		rob.turn(360/sides);
	}
}
}




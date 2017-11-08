import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
public static void main(String[] args) {
Robot wobble= new Robot();
wobble.sparkle();
wobble.setSpeed(9);
wobble.penDown();
wobble.move(150);
wobble.turn(90);
wobble.move(150);
wobble.turn(180);
wobble.move(300);
wobble.turn(180);
wobble.move(150);
wobble.turn(90);

}
}

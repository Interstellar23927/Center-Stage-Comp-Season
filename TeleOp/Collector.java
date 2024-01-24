package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Collector {

    HardwareRobot robot;

    public Collector(HardwareRobot r) {
        robot = r;
    }

    public void loop(Gamepad gamepad1, Gamepad gamepad2) {

        while (gamepad2.dpad_up) {
            robot.leftFlipper.setPower(-0.1);
            robot.rightFlipper.setPower(0.1); //7,9,1
        }

        while (gamepad2.dpad_down) {
            robot.leftFlipper.setPower(0.3);
            robot.rightFlipper.setPower(-0.3); //8,4,0
        }
        robot.leftFlipper.setPower(0.0);
        robot.rightFlipper.setPower(0.0);
    }

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {


        if (gamepad2.a) {
            robot.rightClamp.setPosition(0.43);
            robot.leftClamp.setPosition(0.47);
        }

        if (gamepad2.b) {
            robot.rightClamp.setPosition(0.8);//.7,
            robot.leftClamp.setPosition(0.1);//.2,
        }
    }
}






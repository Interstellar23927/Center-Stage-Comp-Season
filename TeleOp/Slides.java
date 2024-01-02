package org.firstinspires.ftc.teamcode.TeleOP;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Slides {

    HardwareRobot robot;
    public Slides(HardwareRobot r) {
        robot=r;
    }

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {

        if (gamepad2.dpad_up) {
            robot.slideRight.setPower(-0.9);
            robot.slideLeft.setPower(-.9);
        }
        else if (!gamepad2.dpad_up) {
            robot.slideRight.setPower(0.0);
            robot.slideLeft.setPower(0.0);
        }
        if (gamepad2.dpad_down) {
            robot.slideRight.setPower(-0.9);
            robot.slideLeft.setPower(-0.9);
        }
        else if (!gamepad2.dpad_down) {
            robot.slideRight.setPower(0.0);
            robot.slideLeft.setPower(0.0);
        }
        if (gamepad2.dpad_up) {
            robot.slideRight.setPower(-0.9);
            robot.slideLeft.setPower(-0.9);
        }
        else if (!gamepad2.dpad_up) {
            robot.slideRight.setPower(0.0);
            robot.slideLeft.setPower(0.0);
        }
    }

}

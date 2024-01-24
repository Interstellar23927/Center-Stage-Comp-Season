package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Deposit {
    HardwareRobot robot;
    public Deposit(HardwareRobot r) {
        robot = r;
    }

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {

        //change buttons

        if (gamepad2.left_stick_y == 0) {
            robot.leftArm.setPower(-0.2);
            robot.rightArm.setPower(0.2);
        } else {
            robot.leftArm.setPower(0.4 * gamepad2.left_stick_y);
            robot.rightArm.setPower(-0.4 * gamepad2.left_stick_y);
        }

    }
}

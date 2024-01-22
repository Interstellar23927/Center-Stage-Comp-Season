package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Suspension {
    HardwareRobot robot;

    public Suspension(HardwareRobot r) {
        robot = r;
    }
    public void Update(Gamepad gamepad1, Gamepad gamepad2) {
        if (gamepad2.right_bumper) { //change buttons
            robot.leftHook.setPower(-0.5);
            robot.rightHook.setPower(+0.5);
        }
        robot.leftHook.setPower(0.0);
        robot.rightHook.setPower(0.0);
    }
}

package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Suspension {
    HardwareRobot robot;

    public Suspension(HardwareRobot r) {
        robot = r;
    }
    public void Update(Gamepad gamepad1, Gamepad gamepad2) {
        if (gamepad2.left_trigger == 0) {
            robot.leftHook.setPower(0.05);
            robot.rightHook.setPower(-0.05);
        } else {
            robot.leftHook.setPower(-gamepad2.right_trigger);
            robot.rightHook.setPower(gamepad2.right_trigger);

            robot.leftHook.setPower(gamepad2.left_trigger);
            robot.rightHook.setPower(-gamepad2.left_trigger);
        }
    }

//        if (gamepad2.right_bumper) { //change buttons
//            robot.leftHook.setPower(-1);
//            robot.rightHook.setPower(1);
//        } else if (gamepad2.left_bumper) {
//            robot.leftHook.setPower(1);
//            robot.rightHook.setPower(-1);
//        } else
//        robot.leftHook.setPower(0.0);
//        robot.rightHook.setPower(0.0);
//    }
}

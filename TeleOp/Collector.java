package org.firstinspires.ftc.teamcode.TeleOP;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Collector {

    HardwareRobot robot;

    public Collector(HardwareRobot r) {
        robot = r;
    }

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {
        if(gamepad2.dpad_up) {
            robot.leftFlipper.setPosition(0.9);
            robot.rightFlipper.setPosition(0.1);
        }

        if (gamepad2.dpad_down) {
            robot.leftFlipper.setPosition(1.0);
            robot.rightFlipper.setPosition(0.0);
        }

        if (gamepad2.a) {
            robot.rightClamp.setPosition(0.43);
            robot.leftClamp.setPosition(0.47);
        }

        if (gamepad2.b) {
            robot.rightClamp.setPosition(0.7);
            robot.leftClamp.setPosition(0.2);
        }

    }
}

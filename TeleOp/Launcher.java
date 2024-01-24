package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.teamcode.HardwareRobot;

public class Launcher {
    HardwareRobot robot;

    public Launcher(HardwareRobot r) {
        robot = r;
    }

    double launcherPosition = 0.5;

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {
        double MIN_POSITION = 0, MAX_POSITION = 1;

        if (gamepad1.x && launcherPosition > MIN_POSITION) {
            launcherPosition -= .005;
        }

        if (gamepad1.y && launcherPosition < MAX_POSITION) {
            launcherPosition += .005;
        }
        robot.launcher.setPosition(Range.clip(launcherPosition, MIN_POSITION, MAX_POSITION));
    }
}

package org.firstinspires.ftc.teamcode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.robotcore.external.Telemetry;

@Autonomous
public class AutonomousTest extends LinearOpMode {

    public int rightPos;
    public int leftPos;

    HardwareRobot robot;

    @Override
    public void runOpMode() {
        rightPos = 0;
        leftPos = 0;

        waitForStart();
    }

    public void drive(int rightTarget, int leftTarget, double speed) {
        rightPos += rightTarget;
        leftPos += leftTarget;

        robot.frontLeft.setTargetPosition(leftPos);
        robot.backLeft.setTargetPosition(leftPos);
        robot.frontRight.setTargetPosition(rightPos);
        robot.frontLeft.setTargetPosition(rightPos);

        robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        robot.frontLeft.setPower(speed);
        robot.backLeft.setPower(speed);
        robot.frontRight.setPower(speed);
        robot.backRight.setPower(speed);

        while(opModeIsActive() && robot.frontLeft.isBusy() && robot.backLeft.isBusy() && robot.frontRight.isBusy() && robot.backRight.isBusy()) {
            idle();
        }
    }
}

package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.MecanumDrive;

@TeleOp
public class TeleOpFirstComp extends LinearOpMode {
    @Override

    public void runOpMode() throws InterruptedException {

        HardwareRobot robot = new HardwareRobot();
        ElapsedTime timer = new ElapsedTime();

        robot.init(hardwareMap);

        MecanumDrive drive = new MecanumDrive(robot, timer);
        Collector collector = new Collector(robot);
        //Launcher launcher = new Launcher(robot);
        //Suspension suspension = new Suspension(robot);
        Deposit deposit = new Deposit(robot);

        waitForStart();

        if (isStopRequested()) return;

        while(opModeIsActive()) {
            drive.Update(gamepad1, gamepad2);
            collector.Update(gamepad1, gamepad2);
            collector.loop(gamepad1, gamepad2);
            //launcher.Update(gamepad1, gamepad2);
            //suspension.Update(gamepad1, gamepad2);
            deposit.Update(gamepad1, gamepad2);

            telemetry.addData("Left Flipper", robot.leftFlipper.getPower()); //power
            telemetry.addData("Right Flipper", robot.rightFlipper.getPower()); //power

            telemetry.update();
        }
    }

}

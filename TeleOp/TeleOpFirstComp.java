package org.firstinspires.ftc.teamcode.TeleOP;
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

        waitForStart();

        if (isStopRequested()) return;

        while(opModeIsActive()) {
            drive.Update(gamepad1, gamepad2);
            collector.Update(gamepad1, gamepad2);
        }
    }

}

package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

    // simple autonomous program that drives bot in a circle then ends.
// this code assumes it will pull before the period is over but if the period ended while
// still driving, this code will just stop. Stops after 5 seconds or on touch sensor button.
    @TeleOp(name = "Drive Circle Touch", group = "Exercises")
//@Disabled

    public class touchSensor extends LinearOpMode {
        DcMotor slideLeft;
        DcMotor slideRight;
        TouchSensor touch;

        // called when init button is  pressed.
        @Override
        public void runOpMode() throws InterruptedException {

            slideLeft = hardwareMap.dcMotor.get("slideLeft");
            slideRight = hardwareMap.dcMotor.get("slideRight");

            slideLeft.setDirection(DcMotor.Direction.REVERSE);

            touch = hardwareMap.touchSensor.get("touch_sensor");

            telemetry.addData("Mode", "waiting");
            telemetry.update();

            // wait for start button.

            waitForStart();

            telemetry.addData("Mode", "running");
            telemetry.update();
            slideLeft.setPower(0.75);
            slideRight.setPower(-1.50);
        //    sleep(1000);

            // set power levels 75% left and 10% right to drive in an arc to the right.

           // resetStartTime();
            // drive until touch sensor button pressed or 5 seconds passes.

            while (touch.isPressed()) {
//                idle();
                slideRight.setPower(0);
                slideLeft.setPower(0);
            }
            // turn the motors off.

        }
    }
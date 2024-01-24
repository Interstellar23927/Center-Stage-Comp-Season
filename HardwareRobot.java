package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;


/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left drive motor:         "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */

public class HardwareRobot {

    // Public opMode Members
    public DcMotor frontRight;
    public DcMotor frontLeft;
    public DcMotor backRight;
    public DcMotor backLeft;

    public DcMotor leftArm;
    public DcMotor rightArm;

    public DcMotor leftHook;
    public DcMotor rightHook;

    public Servo leftClamp;
    public Servo rightClamp;
    public Servo launcher;

    //public CRServo openGate;
    //public CRServo rightDep;
    //public CRServo leftDep;

    public CRServo leftFlipper;
    public CRServo rightFlipper;

    HardwareMap hwMap;

    // Constructor
    public HardwareRobot() {

    }

    // Initialize Standard Hardware Interfaces
    public void init(HardwareMap ahwMap) {

        // Save Reference to HardwareMap
        hwMap = ahwMap;

        // Define and Initialize Motors
        // Drive motors
        frontRight = hwMap.get(DcMotor.class, "frontRight");
        frontLeft = hwMap.get(DcMotor.class, "frontLeft");
        backRight = hwMap.get(DcMotor.class, "backRight");
        backLeft = hwMap.get(DcMotor.class, "backLeft");

        rightArm = hwMap.get(DcMotor.class, "rightArm");
        leftArm = hwMap.get(DcMotor.class, "leftArm");
//suspension
        // Slide motors

        // Motor Instant Brake for TeleOp
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        rightArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//suspension
        // Define and Initialize Servos
        rightClamp = hwMap.get(Servo.class, "rightClamp");
        leftClamp = hwMap.get(Servo.class, "leftClamp");

        rightFlipper = hwMap.get(CRServo.class, "rightFlipper");
        leftFlipper = hwMap.get(CRServo.class, "leftFlipper");

        launcher = hwMap.get(Servo.class, "roboLauncher");


    }
}

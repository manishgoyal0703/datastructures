package com.datastructures.datastructures.leetcodeInJava;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SpaceKeyPresser {
    public static void main(String[] args) {
        try {Robot robot = new Robot();
            while (true) {
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
                TimeUnit.MINUTES.sleep(2);
            }} catch (Exception e) {
            e.printStackTrace();}}}


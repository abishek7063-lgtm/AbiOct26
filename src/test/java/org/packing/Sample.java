package org.packing;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample {

    public static void main(String[] args) {

        AppiumDriverLocalService build = new AppiumServiceBuilder()
                .withAppiumJS(new File(
                        "C:\\Users\\MELVYN DANNY\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

        build.start();

        System.out.println("Appium Server Started");

        // Your Appium test code goes here

        // build.stop();
    }
}

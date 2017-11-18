package com.epam.at.utils;

public class PhonePerfCharacteristicsUtil {
    //cpu adb shell cat /proc/cpuinfo
    public void getCpuInfoMap() {
        System.out.println(CommandExecutorUtil.executeCommand("adb shell cat /proc/cpuinfo"));
    }

    // memory adb shell vmstat OR adb shell cat /proc/meminfo
    public static String getMemoryInfoMap() {
        return CommandExecutorUtil.executeCommand("adb shell vmstat");
    }

    //battery adb shell dumpsys battery
    public void getBatteryInfoMap() {
        System.out.println(CommandExecutorUtil.executeCommand("adb shell dumpsys battery"));
    }
}
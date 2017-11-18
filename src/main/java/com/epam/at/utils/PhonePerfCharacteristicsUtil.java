package com.epam.at.utils;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class PhonePerfCharacteristicsUtil {
    //cpu adb shell cat /proc/cpuinfo
    private Map<String, String> getCpuInfoMap() {
        String output = CommandExecutorUtil.executeCommand("adb shell cat /proc/cpuinfo");
        return formHashMap(output);
    }

    // memory adb shell vmstat OR adb shell cat /proc/meminfo
    private Map<String, String> getMemoryInfoMap() {
        String output = CommandExecutorUtil.executeCommand("adb shell cat /proc/meminfo");
        return formHashMap(output);
    }

    //battery adb shell dumpsys battery
    private Map<String, String> getBatteryInfoMap() {
        String output = CommandExecutorUtil.executeCommand("adb shell dumpsys battery");
        return formHashMap(output);
    }

    private Map<String, String> formHashMap(String rowData) {
        Map<String, String> perfData = new HashMap<>();
        String[] rows = rowData.split("\n");
        for (String row : rows) {
            String[] data = row.split(":");
            if (data.length == 2)
                perfData.put(data[0].trim(), data[1].trim());
        }
        return perfData;
    }

    public void logAllInfo(Logger log) {
        log.info("<b>CPU INFORMATION:</b>");
        log.info("cpu MHz: " + getCpuInfoMap().get("cpu MHz"));
        log.info("cache size: " + getCpuInfoMap().get("cache size") + "<br/>");

        log.info("<b>BATTERY INFORMATION:</b>");
        log.info("level: " + getBatteryInfoMap().get("level"));
        log.info("technology: " + getBatteryInfoMap().get("technology") + "<br/>");

        log.info("<b>MEMORY INFORMATION:</b>");
        log.info("MemTotal: " + getMemoryInfoMap().get("MemTotal"));
        log.info("MemFree: " + getMemoryInfoMap().get("MemFree"));
        log.info("Buffers: " + getMemoryInfoMap().get("Buffers"));
        log.info("Cached: " + getMemoryInfoMap().get("Cached"));
        log.info("Active: " + getMemoryInfoMap().get("Active"));
        log.info("Inactive: " + getMemoryInfoMap().get("Inactive") + "<br/>");
    }
}
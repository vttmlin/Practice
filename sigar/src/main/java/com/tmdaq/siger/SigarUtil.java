package com.tmdaq.siger;

import java.util.concurrent.atomic.AtomicBoolean;

public class SigarUtil {
    private static final AtomicBoolean loadFlag = new AtomicBoolean(false);

    /**
     * just only load once
     */
    public static void init() {
        if (!loadFlag.get()) {
            String property = System.getProperty("java.library.path");
            String file = SigarUtil.class.getResource("/").getFile();
            System.setProperty("java.library.path", property + ":" + file);
            loadFlag.set(true);
        }
    }
}

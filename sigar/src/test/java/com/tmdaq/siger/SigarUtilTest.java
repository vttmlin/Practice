package com.tmdaq.siger;

import org.hyperic.sigar.Sigar;
import org.junit.Test;

public class SigarUtilTest {

    /**
     * this test suit run error
     * you must do:
     * this tester move to src/main/java can be run
     */
    @Test
    public void testInit() {
        SigarUtil.init();
        new Sigar();
    }
}
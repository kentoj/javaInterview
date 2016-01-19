package com.demo.interview;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by kent on 1/11/16.
 */
public class ApplicationTest {
    @Test
    public void thatApplicationLoads() {
        Application application = new Application();
        assertNotNull(application);
    }
}

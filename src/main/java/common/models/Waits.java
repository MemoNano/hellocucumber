package common.models;

import java.util.concurrent.TimeUnit;

/**
 * Custom Waits
 */
public class Waits {

    /**
     * Boolean check if current browser is Safari
     *
     * @return boolean
     */
    public Boolean isBrowserSafari() {
        System.out.printf("Not implemented!");
        return false;
    }

    /**
     * Waits for a condition for an element
     */
    public void waitFor() {
        // TODO: This is where I would have my waitFor method if I HAD ONE - malexander 12/20/18
        System.out.printf("Not implemented!");
    }

    /**
     * Generic Explicit wait for a specific amount of time
     *
     * @param waitTime
     */
    public void waitForXSeconds(int waitTime) {
        // TODO: Temporary. This should be killed with fire as soon as possible - malexander 12/20/18
        try {
            TimeUnit.SECONDS.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
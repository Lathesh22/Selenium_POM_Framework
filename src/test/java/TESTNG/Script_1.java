package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_1 {

    @Test
    public void testcase() {
        Reporter.log("Test case generated", true);
    }
}
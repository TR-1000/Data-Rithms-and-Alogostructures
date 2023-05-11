package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
@SelectPackages("calculator")
//Comment Line 13 and uncomment Lines 14 or 15 to see change in output.
@IncludeTags("Cloud")
//@IncludeTags({ "Success", "Cloud" })
//@ExcludeTags("Cloud")
public class TagTest {
}

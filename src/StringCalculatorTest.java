import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Before // method which must be called BEFORE tests in class (things important for tests)
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void nothingInStringReturnZero() throws Exception // Check that if we pass empty string that we will get 0
    {
        assertEquals("String is empty", 0, stringCalculator.Add(""));
    }

    @Test
    public void singleValueInputTheSameValueOutput() throws Exception // For example: Input: "1" so Output must equals: 1
    {
        assertEquals(stringCalculator.Add("1") , 1); // Values comes from task 1
    }

    @Test
    public void twoValuesInputAndSingleSumOutput() throws Exception // when we get 2 inputs numbers and we want sum in output
    {
        assertEquals(stringCalculator.Add("1,2"), 3); // Values comes from task 1
    }

    @Test
    public void unknownAmountOfInputNumbers() throws Exception // Checking Add method, if it handle an unknown amount of numbers and using NEW LINES and others delimiters
    {
        assertEquals(stringCalculator.Add("1,2,3") , 6); // test for 3 input values
        assertEquals(stringCalculator.Add("//\n5,6,7") , 18); // test for 4 input values starting with // and NEW LINE
        assertEquals(stringCalculator.Add("\n4;5,6") , 15); // test for 3 input values starting with \n
    }

/*
    @Test
    public void checkNegativesNumbers() throws Exception // Checking Add method with negatives numbers
    {
        assertEquals(stringCalculator.Add("-1,2,3,4"), 8); // test for 4 input values include -1 on start
        assertEquals(stringCalculator.Add("4,-5,6") , 5); // test for 3 input values include negative number in the middle
    }
*/

    @Test
    public void weCanUseOnlyLessThanThousandValues() throws Exception // Check that we can use only values < 1001
    {
        assertEquals(stringCalculator.Add("1001,2"), 2); // 1001 should be ignored
    }

    @Test
    public void testDifferentLengthOfDelimiter() throws Exception // testing different length of delimiters
    {
        assertEquals(stringCalculator.Add("//[!!!]\n2!!!8!!!10"),20); // Check our DELIMITER(3 chars) in [] is correct
        assertEquals(stringCalculator.Add("//[%%%%]\n20%%%%10%%%%25"),55); // Check our DELIMITER(4 chars) in [] is correct
    }

    @Test
    public void testMoreThanOneDemiliter() throws Exception // More than one delimiter in use
    {
        assertEquals(stringCalculator.Add("//[!!!][%%%]\n2!!!8%%%10"),20); // Check 2 delimiters
    }

}
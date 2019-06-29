public class StringCalculator
{

    public static int Add(String numbers)
    {
        String[] charstab = numbers.split(",");

        if (numbers.isEmpty())  // Checking if we have empty string that we return 0
        {
            return 0;
        }
        else if(numbers.length() == 1) // If we have 1 value we have to return the same values we get
        {
            return Integer.parseInt(numbers);
        }else // If we have 2 values we have to return sum
        {
            return Integer.parseInt(charstab[0]) + Integer.parseInt(charstab[1]); // adding 2 input values
        }




    }










}

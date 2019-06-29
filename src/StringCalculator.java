public class StringCalculator
{

    public static int Add(String numbers) {
        String[] charstab = numbers.split(",");

        if (numbers.isEmpty()) {
            return 0;
        }
        else if(numbers.length() == 1)
        {
            return Integer.parseInt(numbers);
        }else {
            return Integer.parseInt(charstab[0]) + Integer.parseInt(charstab[1]);
        }

    }










}

public class StringCalculator {



    public static int Add(String numbers) throws Exception {
        String delimiter = ";|,|\n"; // numbers will be split by ',' or '\n' or ';' using DELIMETER
        String[] charstab = numbers.split(delimiter);

        String negatives = ""; // make a new empty string
        for (int i = 0; i < charstab.length; i++) {
            if (charstab[i].contains("-")) // when we get negative number we add it to new string
                negatives += "," + charstab[i]; // add to string
        }
        if (!negatives.isEmpty()) // if negative inputs are in String
            throw new IllegalArgumentException("Negatives not allowed: " + negatives.substring(1)); // show in Expection negative numbers


        if (numbers.startsWith("//") || numbers.startsWith("\n")) // if it starts with '//' or '\n' do that
        {
            int delimiterNumber;
            if(numbers.startsWith("//[")) // if it starts with '//[' we look for delimiter inside [DELIMITER]
            {
                delimiterNumber = numbers.indexOf("//[") + 3; // place from start where we find DELIMITER
                delimiter = numbers.substring(delimiterNumber,numbers.indexOf("]"));// when DELIMITER should be finished
            }
            String[] parts = numbers.split("\n"); // split it when its new line
            String part2 = parts[1]; // we need second[1] part, because there are numbers
            String[] charstab2 = part2.split(delimiter); // find numbers spliting by DELIMITERS

            int suma = 0;
            for (int j = 0; j < charstab2.length; j++)
            {
                suma += Integer.parseInt(charstab2[j]);  // adding the following numbers we get on input
            }
            return suma; // return sum of input numbers
        } else {
            if (numbers.isEmpty())  // Checking if we have empty string that we return 0
            {
                return 0;
            } else if (numbers.length() == 1 && Integer.parseInt(numbers) >= 0) // If we have 1 value we have to return the same values we get
            {
                return Integer.parseInt(numbers); // return the same value what we get on input
            } else // If we have more then 1 value we have to return sum of them
            {
                int sum = 0;
                for (int i = 0; i < charstab.length; i++) {
                    if (Integer.parseInt(charstab[i]) < 1001) // we ignore values > 1000
                        sum += Integer.parseInt(charstab[i]);  // adding the following numbers we get on input only if number is lower than 1001
                }
                return sum; // return sum of input numbers
            }
        }
    }
}

class MathExamples
{
    static double average(double a, double b)
    {
        return (a + b) / 2;
    }

    static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }

    static double abs(double number)
    {
        if (number >= 0)
        {
            return number;
        }
        else
        {
            return number * -1;
        }
    }

    static boolean isEven(int n)
    {
        if (n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns true if the input n is divisible by d.
     */
    static boolean isDivisibleBy(int n, int d)
    {
        if (n % d == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static String coinFlip()
    {
        if (Math.random() > 0.5)
        {
            return "Heads";
        }
        else
        {
            return "Tails";
        }
    }

    static int ageInSeconds(int years)
    {
        return years * 365 * 24 * 60 * 60;
    }

    static double solveHypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }

    /**
     * Returns the factorial of the given number.
     * 
     * For example:
     * factorial(5) = 5 * 4 * 3 * 2 * 1
     */
    static int factorial(int n)
    {
        int product = 1;

        while (n > 1)
        {
            product = product * n;
            n = n - 1;
        }

        return product;
    }

    static double squareRoot(double n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        double guess = n;
        int counter = 0;

        while (guess * guess != n && counter < 20)
        {
            guess = average(guess, n / guess);
            System.out.println(guess);
            counter = counter + 1;
        }
        return guess;
    }

    static int diceRoll()
    {
        return 1 + (int)(System.nanoTime() % 6);
    }

    
}
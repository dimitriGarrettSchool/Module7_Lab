import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //loop0();
        //loop1();
        //loop2();
        //loop3();
        //loop4();
        //loop5();
        //loop6();
        //loop7();
        loop8();
    }

    public static void loop0()
    {
        int sum = 0;
        for (int i = 0; i < 31; ++i)
        {
            sum += i;
        }
        System.out.println("Sum 0-30 by 1: " + sum);
    }

    public static void loop1()
    {
        int sum = 0;
        for (int i = 30; i > 0; --i)
        {
            sum -= i;
        }
        System.out.println("Difference 0-30 by 1: " + sum);
    }

    public static void loop2()
    {
        int sum = 0;
        for (int i = 0; i < 18; i += 3)
        {
            sum += i;
        }
        System.out.println("Sum 0-18 by 3: " + sum);
    }

    public static void loop3()
    {
        int sum = 0;
        for (int i = 10; i > 0; i -= 2)
        {
            sum -= i;
        }
        System.out.println("Difference 10-0 by 2: " + sum);
    }

    public static void loop4()
    {
        for (int i = 0; i < 6; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public static void loop5()
    {
        for (int i = 6; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public static void loop6()
    {
        for (int i = 6; i > 0; --i)
        {
            for (int j = 0; j < 6; ++j)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    private static double getDouble()
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.printf("Input a double: ");
            if (in.hasNextDouble())
            {
                return in.nextDouble();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }
    }

    private static String getString()
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.printf("Input y/n (y for F to C n for C to F): ");

            String l = in.nextLine();
            if (l.charAt(0) == 'y' || l.charAt(0) == 'n')
            {
                return l;
            }

            else
            {
                System.out.println("Invalid input: " + l);
            }
        }
    }

    public static void loop7()
    {
        String which = getString();

        double inp = getDouble();
        if (which.charAt(0) == 'y')
        {
            System.out.println("C from F: " + ((inp - 32.0) * (5.0/9.0)));
        }

        else
        {
            System.out.println("F from C: " + (inp * (5.0/9.0)) + 32.0);
        }
    }

    public static void loop8()
    {
        String[] strings = {
                "********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "********",
        };

        for (String string : strings)
        {
            System.out.println(string);
        }
    }
}
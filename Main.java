import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        loop0();
        System.out.println("----------");
        loop1();
        System.out.println("----------");
        loop2();
        System.out.println("----------");
        loop3();
        System.out.println("----------");
        //loop4();
        //System.out.println("----------");
        //loop5();
        //System.out.println("----------");
        //loop6();
        //System.out.println("----------");
        //loop7();
        loop8();
    }

    public static void loop0()
    {
        for (int i = 0; i < 30; ++i)
        {
            System.out.println(i);
        }
    }

    public static void loop1()
    {
        for (int i = 30; i > 0; --i)
        {
            System.out.println(i);
        }
    }

    public static void loop2()
    {
        for (int i = 0; i < 18; i += 3)
        {
            System.out.println(i);
        }
    }

    public static void loop3()
    {
        for (int i = 10; i > 0; i -= 2)
        {
            System.out.println(i);
        }
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
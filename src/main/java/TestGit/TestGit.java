package TestGit;

import java.util.Scanner;

public class TestGit
{

    public static void main(String[] args)
    {
        int a = 10;
        int b = 3;
        System.out.println(a % b);
    }
    {
        String test = "\"Result\" %d";
        int result = 123;
        System.out.println(String.format(test, result));
    }

    {
        Human person1 = new Human ();
        Human person2 = new Human ();
        person1.age = 35;
        person1.firstName = "July";
        person2.age = 30;
        person2.firstName = "Alex";

        System.out.println(person1.firstName + "" + person1.age);
        System.out.println(person2.firstName + "" + person2.age);
    }
    {        String empty = "";
            String nullString = null;
            boolean isBigger = false;
            double doublePi = 3.14;

            Scanner consoleInput = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            String name = consoleInput.nextLine();

            String firstname;
            String NAME;
            System.out.println(empty);
            System.out.println(nullString);
            System.out.println(isBigger);


            System.out.println("Please enter your age: ");
            int age = consoleInput.nextInt();
            int age2;
            System.out.println(name + "age");

            age = 10;

        if (age<18)
        {
            System.out.println(name + " can't buy alcohol");
        }else{
            System.out.println(name + " can buy alcohol");
        }
    }
}


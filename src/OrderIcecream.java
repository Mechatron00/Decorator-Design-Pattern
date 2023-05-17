import java.util.Scanner;

public class OrderIcecream
{
    private Icecream ic1;
    private Icecream ic2;
    private Icecream ic3;
    private Icecream ic4;

    void order()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CHOOSE AN OPTION TO ORDER:\n");
        System.out.println("*******************************************************************************");
        System.out.println("1.Simple Icecream\n");
        System.out.println("2.Crunchy Nuts\n");
        System.out.println("3.Golden Honey\n");
        System.out.println("4.Special Icecream\n");
        System.out.println("*******************************************************************************");
        int a=sc.nextInt();
        switch (a)
        {
            case 1:
                ic1=new SimpleIcecream();
                System.out.println(ic1.makeIcecream());
                System.out.println("Rs.20");
                break;

            case 2:
                ic2=new NuttyDecorator(new SimpleIcecream());
                System.out.println(ic2.makeIcecream());
                System.out.println("Rs.35");
                break;

            case 3:
                ic3=new HoneyDecorator(new SimpleIcecream());
                System.out.println(ic3.makeIcecream());
                System.out.println("Rs.35");
                break;

            case 4:
                ic4=new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
                System.out.println(ic4.makeIcecream());
                System.out.println("Rs.50");
                break;

            default:
                System.out.println("Option Not Available!");
                break;
        }

    }


}

public class Question1 {
    public static void main(String[] args)
    {
        for (int x=0; x<=30; x++)
        {
            System.out.println(x);
        }
        for (int x=30; x>=0; x--)
        {
            System.out.println(x);
        }
        for(int x=0; x<=18; x+=3)
        {
            System.out.println(x);
        }
        for (int x=10; x>=0; x-=2)
        {
            System.out.println(x);
        }
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= 5; row++)
        {
            for (int column = 1; column <= 5; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
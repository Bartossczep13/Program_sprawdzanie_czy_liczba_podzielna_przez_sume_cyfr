import java.util.Scanner;
class Main {

static String pps(long n)
    {
        long temp = n;
     
        
        int sum = 0;
        while (n != 0)
        {
            int k = (int) n % 10;
            sum += k;
            n /= 10;
        }
        System.out.print("Suma cyfr liczby: ");
        System.out.println(sum);
        if (temp % sum == 0)
            return "TAK";
        
     
        return "NIE";
    }
     
    public static void main(String []args)
    {
      long n;
    System.out.println("Podaj liczbe ktora sprawdzisz \n czy jest podzielna przez sume swoich cyfr");  
    Scanner to = new Scanner(System.in);
    n = to.nextLong();
      
        
        System.out.println(pps(n));
    }
}

    
  

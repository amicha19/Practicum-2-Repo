// public static void main in Java

public class Main {
  
  public static void main(String[] args) {
    int n = 0;
    int sum = 10;

    while(n < 5) {
      sum = sum + n;

      if(args.length != 0 && args[0].equals("trace_on")) {
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);
      }
      n = n + 1;
    }
    
    System.out.println("Sum = " + sum);
  }
}

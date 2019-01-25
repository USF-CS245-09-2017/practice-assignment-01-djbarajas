public class Fibonacci {
    static int fibonacci(int n, String type){
        if(type.equals("iterative")){
            return fibI(n);
        }
        if(type.equals("recursive")){
            return fibR(n);
        }
        System.out.println("Error please chose recursive or iterative");
        return 0;
    }
    static int fibR(int n)
    {
        if (n <= 1)
            return n;
        return fibR(n-1) + fibR(n-2);
    }

    static int fibI(int n)
    {
        if(n == 0){
            System.out.println("Error please use a number greater than 0");
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int sequence[] = new int[n+1];
        sequence[0] = 0;
        sequence[1] = 1;
        for(int i = 2; i <= n; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence[n];

    }
}

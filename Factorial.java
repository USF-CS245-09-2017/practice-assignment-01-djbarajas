public class Factorial {

    static int factorial(int n, String type){
        if(n < 1){
            System.out.println("Error please use a positive number");
            return -1;
        }
        if(type.equals("iterative")){
            return factorialI(n);
        }
        if(type.equals("recursive")){
            return factorialR(n);
        }
        System.out.println("Error please chose recursive or iterative");
        return 0;
    }

    static int factorialI(int n)
    {
        int answer = 1;
        for(int i = n; i > 0; i--){
            answer *= i;
        }
        return answer;
    }

    static int factorialR(int n)
    {
        if(n == 1){
            return 1;
        }
        return n * factorialR(n-1);
    }
}

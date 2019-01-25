public class Factorial {

    static int factorial(int n, String type){
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
        if(n < 1){
            System.out.println("Error, please use numbers greater than 0");
            return 0;
        }
        int answer = 1;
        for(int i = n; i > 0; i--){
            answer *= i;
        }
        return answer;
    }

    static int factorialR(int n)
    {
        if(n < 1){
            System.out.println("Error, please use numbers greater than 0");
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n * factorialR(n-1);
    }
}

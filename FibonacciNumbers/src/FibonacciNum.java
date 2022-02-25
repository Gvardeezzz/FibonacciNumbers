import java.util.ArrayList;
import java.util.Date;

public class FibonacciNum {
    static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i ++) {
            System.out.printf("n:%d f:%d", i, fib(i));
            System.out.println();
        }
    }
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    //faster than recursion
    public static int f(int n){
        if(n <= 1)return n;
        numbers.add(0);
        numbers.add(1);
        for (int i = 1; i < n ; i ++) {
            int current = numbers.get(numbers.size()-1) + numbers.get(numbers.size()-2);
            numbers.add(current);
        }
        return numbers.get(numbers.size()-1);
    }
}


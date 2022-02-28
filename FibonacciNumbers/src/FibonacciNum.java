import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class FibonacciNum {
    static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i ++) {
            System.out.printf("n:%d f:%d", i, fNumbers(i));
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

    public static BigInteger fNumbers(int num){
        if(num<0) {
            System.out.println("Чмсло меньше нуля!");
            return null;
        }
        if(num <= 1)return new BigInteger(String.valueOf(num));
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;
        for (int i = 1; i < num; i++) {
            result = first.add(second);
            first = second;
            second = result;
        }
        return result;
    }

}


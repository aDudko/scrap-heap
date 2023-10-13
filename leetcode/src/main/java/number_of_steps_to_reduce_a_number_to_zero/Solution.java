package main.java.number_of_steps_to_reduce_a_number_to_zero;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        if (num == 0) return num;
        return 1 + (num % 2 == 0 ? numberOfSteps(num / 2) : numberOfSteps(num -1));
    }
}

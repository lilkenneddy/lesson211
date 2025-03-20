package org.example;

public class Main {

public static void main(String[] args) {
    Solution solution = new Solution();
    int[] result = solution.plusOne(new int[]{9, 9, 9});

    // Вивести результат
    for (int num : result) {
        System.out.print(num + " ");
    }
}
}



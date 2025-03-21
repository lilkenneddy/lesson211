package org.example;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Повертаємо, якщо немає переносу
            }
            digits[i] = 0; // Якщо цифра була 9, вона стає 0
        }

        // Якщо всі цифри були 9 (наприклад, [9,9,9] → [1,0,0,0])
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}


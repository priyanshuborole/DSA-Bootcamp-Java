package com.priyanshu.Searching;
//https://leetcode.com/problems/guess-number-higher-or-lower/

class GuessGame{
    int guess(int num) {
        return num;
    }

}

public class GuessNumberHigherLower extends GuessGame {
    /**
     * Forward declaration of guess API.
     * //@param  num   your guess
     *
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */
    int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) == 1) {
                start = mid + 1;
            }
            if (guess(mid) == -1) {
                end = mid - 1;
            }
        }
        return start;
    }

}

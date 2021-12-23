package Loops;

/**
 * Write a code that prints the numbers between 2,000 and 3,000 i.e
 * (2000<=number<3000), which are divisible by 8 but not by 6. (Hint: apply
 * Boolean condition - number%8==0 && number%6!=0)
 * 
 * Note:
 * 
 * Please print all the even numbers on the same line, such as:
 * 
 * 2000 2008 2024 ...
 * 
 * and not on different lines, such as:
 * 
 * 2000
 * 
 * 2008
 * 
 * 2024
 * 
 * ...
 * Input:
 * No input required
 * 
 * Output:
 * 
 * 2000 2008 2024 2032 2048 2056 2072 2080 2096 2104 2120 2128 2144 2152 2168
 * 2176 2192 2200 2216 2224 2240 2248 2264 2272 2288 2296 2312 2320 2336 2344
 * 2360 2368 2384 2392 2408 2416 2432 2440 2456 2464 2480 2488 2504 2512 2528
 * 2536 2552 2560 2576 2584 2600 2608 2624 2632 2648 2656 2672 2680 2696 2704
 * 2720 2728 2744 2752 2768 2776 2792 2800 2816 2824 2840 2848 2864 2872 2888
 * 2896 2912 2920 2936 2944 2960 2968 2984 2992
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 2000; i < 3000; i++) {
            if (i % 8 == 0 && i % 6 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}

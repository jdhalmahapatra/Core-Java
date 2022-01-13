package DSA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//WAP to find out the duplicate number(s) from the given Array of Integer.
//DSA - #1
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 89, 2, 7, 9, 5, 52, 34, 1};
        //int[] b = {1, 2, 5, 89, 2, 17, 76, 7, 9, 5, 52, 34,17, 1, 89};
        List<Integer> duplicates = findDuplicateRecords(a);
//        List<Integer> duplicates2 = findDuplicateRecords2(b);
//        List<Integer> duplicates3 = findDuplicateRecords3(b);
//        List<Integer> duplicates4 = findDuplicateRecords3(b);
        System.out.println(duplicates);
//        System.out.println(duplicates2);
//        System.out.println(duplicates3);
//        System.out.println(duplicates4);
    }

    // #1- Algorithm 1
    //Step 1 - Compare each elements from an array with each other
    //Step 2 - Check both are same or not
    //Step 3 - If found same, then store it another variable
    //Step 4 - If not found, then return no duplicate record/number
    //Time Complexity - O(n^n)
    //Space Complexity - O(1)
   static List<Integer> findDuplicateRecords(int[] array){
        List<Integer> duplicateList = new ArrayList<Integer>();
        int n = array.length;
        int count  = 0;
        for(int i = 0; i < n; i++){
            for (int j= i+1; j<n; j++){
                count++;
                if(array[i] == array[j]){
                    duplicateList.add(array[i]);
                }
                else
                    continue;
            }
        }
       System.out.println(count);
        return duplicateList;
    }

    // #2 - Algorithm 2
    //Step 1 - Sort the Given Array
    //Step 2- Compare the values in one loop by a[i] with a[i+1]
    //If Found return list
    //Time Complexity - O(nlog(n))
    //Space Complexity = O(n)
   static List<Integer> findDuplicateRecords2(int[] array){
        List<Integer> duplicateList = new ArrayList<Integer>();
        Arrays.sort(array);
        System.out.println(array);
        int n = array.length;
        for(int i=0; i<n; i++){
            if(i == n-1){
                break;
            }
            if(array[i] == array[i+1]){
                duplicateList.add(array[i]);
            }
            else
                continue;
        }
        return  duplicateList;
    }

    //#3 - Algorithm3
    // Using Hashmap
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    static List<Integer> findDuplicateRecords3(int[] array){
        List<Integer> duplicateList = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i]))
                duplicateList.add(array[i]);
            else
                map.put(array[i], 1);
        }
        return  duplicateList;
    }

    //#4 - Algorithm
    //Using a Counter Array to keep track of the duplicates
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    static List<Integer> findDuplicateRecords4(int[] array){
        List<Integer> duplicateList = new ArrayList<Integer>();
        int[] counter = new int[100];
        for(int i=0;i<array.length; i++){
            counter[array[i]]++;
            if(counter[array[i]] == 2)
                duplicateList.add(array[i]);
            else
                continue;
        }
        return  duplicateList;
    }
}

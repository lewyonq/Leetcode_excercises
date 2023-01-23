/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle118 {
    public static void main(String[] args) {
        System.out.println(generate(3));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if(numRows >= 1) {
            result.add(new ArrayList<>(Arrays.asList(1)));
        }
        if(numRows >= 2) {
            result.add(new ArrayList<>(Arrays.asList(1,1)));
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> lastRow = result.get(i - 1);
            List<Integer> nextRow = new ArrayList<>(lastRow.size() + 1);

            for (int j = 0; j < lastRow.size() + 1; j++) {
                if (j == 0) {
                    nextRow.add(lastRow.get(0));
                } else if (j == lastRow.size()) {
                    nextRow.add(lastRow.get(j - 1));
                } else {
                    nextRow.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }

            result.add(nextRow);
        }

        return result;
    }
}

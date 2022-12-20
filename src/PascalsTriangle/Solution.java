package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> triangleToReturn = new ArrayList<>();

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previous_row = triangle.get(i -1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previous_row.get(j-1) + previous_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        if (numRows == 0) {
            triangleToReturn.add(1);
            return triangleToReturn.toString();
        }
        String list = triangle.get(numRows -1).toString();
//        System.out.println(list);
//        triangleToReturn.add(triangle.get(numRows))
        return list;
    }

    public static void main(String[] args) {

        System.out.println(generate(3));

    }
}

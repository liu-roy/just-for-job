package org.jayson.offer.array;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInArray {

    public static void main(String[] args) {
//        int[][] plants = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//        int target = 20;

        int[][] plants = {{}};
        int target = 20;

        FindInArray findInArray = new FindInArray();
        boolean targetIn2DPlants = findInArray.findTargetIn2DPlants(plants, target);
        System.out.println(targetIn2DPlants);;

    }

    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        if (plants == null) {
            return false;
        }
        int lineNum = plants.length;
        if (lineNum == 0) {
            return false;
        }
        int columnNum = plants[0].length;
        if (columnNum == 0) {
            return false;
        }
        int temLineNum = lineNum-1;
        int temColumnNum = 0;
        while (temLineNum >= 0 && temColumnNum <= columnNum-1) {
            if (plants[temLineNum][temColumnNum] == target) {
                return true;
            } else if (plants[temLineNum][temColumnNum] > target) {
                temLineNum--;
            } else {
                temColumnNum++;
            }

        }
        return false;

    }
}

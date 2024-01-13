package org.jayson.offer.string;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 *
 * 不开辟新的空间，从后面往前面移动：从前往后涉及到字符移动，时间复杂度O(n2）
 */
public class Replace3String {

    public static void main(String[] args) {

        Replace3String findInArray = new Replace3String();

        String targetIn2DPlants = findInArray.pathEncryption(new StringBuilder("a aef qerf bb"));

        System.out.println(targetIn2DPlants);;

    }

    public String pathEncryption(StringBuilder path) {
        if (path == null) {
            return null;
        }
        //计算空格的数量
        int numOfSpace = 0;
        for (int i = 0; i < path.length(); i++){
            char a = path.charAt(i);
            if (a == ' '){
                numOfSpace ++;
            }
        }
        int oldIndex = path.length()-1;
        int newLength = path.length() + numOfSpace * 2;
        path.setLength(newLength);
        int newIndex = newLength - 1;
        for (int i = oldIndex; i >=0 ;i--) {
            if (path.charAt(i) == ' ') {
                path.setCharAt(newIndex--, '0');
                path.setCharAt(newIndex--, '2');
                path.setCharAt(newIndex--, '%');
            }else {
                path.setCharAt(newIndex--, path.charAt(i));
            }
        }
        return path.toString();

    }

}

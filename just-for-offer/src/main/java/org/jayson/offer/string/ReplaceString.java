package org.jayson.offer.string;

/**
 * 假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。
 */
public class ReplaceString {

    public static void main(String[] args) {

        ReplaceString findInArray = new ReplaceString();

        String targetIn2DPlants = findInArray.pathEncryption("a.aef.qerf.bb");

        System.out.println(targetIn2DPlants);;

    }

    public String pathEncryption(String path) {
        if (path == null) {
            return path;
        }
        char[] charArray = path.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '.') {
                charArray[i] = ' ';
            }
        }
//       return path.replace(".", " ");
        return new String(charArray);
    }

}

package Day12;

public class Problem9 {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        String res = "";

        int itr;

        for (itr = 0; itr < str.length(); itr++) {

            char ch = str.charAt(itr);

            if (ch >= 'A' && ch <= 'Z' ||
                ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9') {

                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }

                res = res + ch;
            }
        }

        System.out.println(res);
    }
}
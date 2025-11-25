public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        int i=0;
        String result ="";
        while (i<str.length()) {
           
           char ch = str.charAt(i);
           if ((ch > 64) && (ch < 91)) { //if its a capital letter ASCII
                result = result + (char)(ch +32);
           }
           else {
                result = result + ch; //if its lowercase, keep it
           }
           i++;
        }
        
        return result;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        for (int l = 0; l<=str1.length() - str2.length(); l++) {
            boolean contains = true;

            for (int i = 0; i<str2.length(); i++) {
                if (str1.charAt(l+i) != str2.charAt(i)) {
                    contains = false;
                    break;
                }
            }
        if(contains) {
            return true;
        }
    }
        return false;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 8 primitive data types
        //6-ish numeric
        //1-ish character
        //1 switch flipper

        // integers -- 4 kinds
        byte tinyNums = 42;                 //  8-bits      -128 to 127
        short mediumSizedNums = -23846;     // 16-bits      -32768 to 32767
        int normalSizedNums = 2843965;      // 32-bits      -2147483648 to 2147483647       MOST USED
        long hugeish4Numbers = 83785499472L; // 64-bits      -9quintillion to 9quintillion

        // reals -- DECIMALS!!
        float lessAccurateNumbers = 39.627F;    // 32-bits      ~7 digits of accuracy (sigfigs)
        double moreAccurageNumbers = 847956.736485903;      // 64-bits      ~15 digits of accuracy      MOST USED

        // characters           characters are really integers
        char singleLetter = '&';            // 16-bits      65535 characters in the bank (UNICODE)
                                        // 'A' == 65        'a' == 97       '0' == 48

        // boolean
        boolean lightSwitch = true;             //  true or false


        String wordsAndPhrases = "Good morning, San Diego!";

    }
}
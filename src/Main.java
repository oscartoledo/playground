public class Main {

    public static void main(String[] args) {
        boolean bool = true; // 1 bit from 0 to 1 (false or true)
        System.out.println("Bool value: " + bool);

        byte word = 55; // 8 bits -128 to 127
        System.out.println("Word value: " + word);

        byte word1 = 127;
        System.out.println("Word1 value: " + word1);
        word1 += 1; // word1 = word1 + 1
        System.out.println("Word1 value: " + word1);

        byte word2 = 0x10;
        System.out.println("Word2 value: " + word2);

        short smallInteger = 32767; // 16 bits from -32,768 to 32,767
        System.out.println("small Integer value: " + smallInteger);

        short smallInteger1 = 32767;
        smallInteger1 += 1;
        System.out.println("small Integer with Overflow value: " + smallInteger1);

        char character = 'E';
        // 16 bits Unicode Characters
        System.out.println("Character value: " + character);

        char character1 = 0b101; // 16 bits Unicode Characters
        System.out.println("Character value: " + character1);

        int integer = 56465465; // 32 bits from -2,147,483,648 to 2,147,483,647
        System.out.println("Integer value: " + integer);

        long longInteger = 1232123154878845L; // 64 bits from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long Integer value: " + longInteger);

        float decimal = 1.1F; // 32 bits
        System.out.println("Decimal value: " + decimal);

        float impossibleDecimal = 0.33333333f;
        System.out.println("Decimal value: " + impossibleDecimal);

        double doubleDecimal = 5254.154654; // 64 bits
        System.out.println("Double decimal value: " + doubleDecimal);

    }
}
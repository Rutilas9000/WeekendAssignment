/**
 * @Class: MyAssignment
 * @Author: Savion Plater
 * @Course: ITEC2140 - 05, Spring 2023
 * @Written: March 27, 2023
 * Description: The program will contain the completed
 * methods and test them by calling the methods with
 * appropriate inputs in the main method.
 */
public class MyAssignment {
    public String reverseDoubleChar(String word){
        String result = "";
        for(int i = word.length()-1; i >= 0; i--)
        {
            result += word.charAt(i) + "" + word.charAt(i);
        }
        return result;
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public String birthdayName(String name){
        return "Happy Birthday "+ name + "!";
    }

    public String missingFront(String str){
        return str.substring(3);
    }

    public String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public String nonStart(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public boolean hasPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }

    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }

    // main method
    public static void main(String[] args){
        MyAssignment method = new MyAssignment();
        //output for reverseDoubleChar()
        System.out.println(method.reverseDoubleChar("Pancakes"));

        //output for sumDigits()
        System.out.println(method.sumDigits(936));

        //output for birthdayName()
        System.out.println(method.birthdayName("Savion"));

        //output for missingFront()
        System.out.println(method.missingFront("Hearts"));

        //output for swapEnds()
        System.out.println(method.swapEnds("Kingdom"));

        //output for everyOther()
        System.out.println(method.everyOther("Drowsy"));

        //output for nonStart()
        System.out.println(method.nonStart("About", "Time"));

        //output for fibonacci()
        System.out.println(method.fibonacci(13));

        //output for luckySum()
        System.out.println(method.luckySum(22, 18, 9));

        //output for hasPalindrome()
        System.out.println(method.hasPalindrome("level"));

        //output for powerOfTwo()
        System.out.println(method.powerOfTwo(9));
    }
}

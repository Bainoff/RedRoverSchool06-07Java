package homework.HW10;

public class CodeWars21 {
//TODO    Write a function to convert a name into initials.
//    This kata strictly takes two words with one space in between them.
//    The output should be two capital letters with a dot separating them.
//    It should look like this:
//    Sam Harris => S.H
//    patrick feeney => P.F

    public class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            char a = name.toUpperCase().charAt(0);
            char b = name.toUpperCase().charAt(name.indexOf(" ") + 1);
            return a + "." + b;
        }
    }
}

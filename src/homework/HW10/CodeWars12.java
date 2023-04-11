package homework.HW10;

public class CodeWars12 {

//TODO    Your task is to create a function that does four basic mathematical operations.
// The function should take three arguments - operation(string/char), value1(number), value2(number).
// The function should return result of numbers after applying the chosen operation.
// Examples(Operator, value1, value2) --> output
    // "('+', " + v1 + ", " + v2 + ") --> " + (v1 + v2)

    public class BasicOperations
    {
        public static Integer basicMath(String op, int v1, int v2)
        {
            int res = 0;
            switch (op) {
                case "+":
                    return res = v1 + v2;
                case "-":
                    return res = v1 - v2;
                case "*":
                    return res = v1 * v2;
                case "/":
                    return res = v1 / v2;
            }
            return res;
        }
    }
}

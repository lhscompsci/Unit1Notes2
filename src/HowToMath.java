import static java.lang.System.*;

public class HowToMath {
    public static void main(String[] args) {

        // Basic Math Operators
        // addition         +
        // subtraction      -
        // multiplication   *
        // division         quotient    /
        //                  remainder   %


        out.println(5 / 2);
        out.println(5 % 2);
        out.println((5.0 / 2));


        // Order of Ops
        // ()
        // unary ops:  ! ++ -- - (negation)
        // * / %
        // + -
        // assignments operators:  = += -= *= /= %=
        // ,

        int num = 10;
        out.println(num);

        num = num + 5;
        out.println(num);

        num = 7 + 10 * 2;
        out.println(num);

        num *= 2;               // num = num * 2;
        out.println(num);

        num /= 5;
        out.println(num);

        // ++ the incrementor
        num++;      // adds 1
        out.println(num);

        // -- the decrementor
        num--;      // subtracts 1
        out.println(num);

        //casting
        int one = 11;
        int two = 5;
        double dec = one / (double)two;

        out.println(dec);

    }
}

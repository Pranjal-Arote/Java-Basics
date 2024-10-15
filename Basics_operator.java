public class Basics_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String m = "Pranjal";
        String c = "Pranjl ";
        System.out.println(m.equals(c));
        System.out.println(a == b);

        // Logical Op e rators:
        // &&,||,!
        /*
         * Logical && Operator:It will resturn true if both the conditions are true
         * Logical || Operator:It will returns true if any of the condition is true
         * Logcal !:It reverse the boolean expressionex. !(A&&B)
         * Assignent operator(=):It assigns the value to the variable
         * Bitwise operator:&,|,^
         * &:=It will add te two values in the boolean form and then the answer will get
         * stored (if 1->1=1,1->0=1,0->1=0,0->0=0)
         * Inclusive (OR)|=It Will add the two values and answer get stored and then the
         * answer will
         * get stored(if 1->1=1,1->0=0,0->1=1,0->0=0)
         * Exclusive (OR) ^=same as the inclusive OR operator but only true->true=false
         * i.e(1->1=0)
         */

        // Logical and(&&) opeartor
        int s = 2;
        int t = 9;
        if (s > t || t != s) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Bitwise Operators
        System.out.println(s & t);
        System.out.println(a | t);
        System.out.println(s ^ t);

    }
}

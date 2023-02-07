public class ExceptionPropogation {

    static  class test {
        void dudee1() {
            int data = 50 / 0;
        }

        void dudee2() {
            dudee1();
        }

        void p() {
            try {
                dudee2();
            } catch (java.lang.Exception e) {
                System.out.println("exception handled");
            }
        }
    }

    public static void main(String args[]) {
        test obj = new test();
        obj.p();
        System.out.println("normal flow...");
    }
}


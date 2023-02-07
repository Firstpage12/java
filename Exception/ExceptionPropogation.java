public class ExceptionPropogation {

    static  class test {
        void m() {
            int data = 50 / 0;
        }

        void n() {
            m();
        }

        void p() {
            try {
                n();
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


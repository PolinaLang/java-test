package nested_classes.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(4,21);
    }
}

class Math {
    private int a = 10;

    public void getResult(final int divider, final int dividend) {
        class Division{
//            private int divider;
//            private int dividend;

//            public int getDivider() {
//                return divider;
//            }
//
//            public void setDivider(int divider) {
//                this.divider = divider;
//            }
//
//            public int getDividend() {
//                return dividend;
//            }
//
//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

            public int getRes() {
                return dividend/divider;
            }

            public int getOstat() {
                return dividend%divider;
            }
        }

        Division division = new Division();
//        division.setDividend(21);
//        division.setDivider(4);
//        System.out.println(a);
//        System.out.println("Делимое = " + division.getDividend());
        System.out.println("Делимое = " + dividend);
//        System.out.println("Делитель = " + division.getDivider());
        System.out.println("Делитель = " + divider);
        System.out.println("Частное = " + division.getRes());
        System.out.println("Остаток = " + division.getOstat());
    }
}
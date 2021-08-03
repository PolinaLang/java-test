package nested_classes.local_inner_class;

public class localInner2 {
    public static void main(String[] args) {
        class Sum implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Sum sum = new Sum();
        System.out.println(sum.doOperation(4, 7));
    }
}

interface Math2{
    int doOperation(int a, int b);
}

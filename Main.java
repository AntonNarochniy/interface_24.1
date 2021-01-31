public class Main {

    public static void main(String[] args) {
        //ДЗ 24
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();
        Test test = new Test();
        test.foo(mi8);
        test.foo(boeing737);
        test.foo2(mi8);


    }
}

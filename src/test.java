public class test {
    public static void main(String[] args) {
        A a = A.getInstance();
        A a2 =A.getInstance();

            System.out.println(a.hashCode());
            System.out.println(a2.hashCode());




    }

}

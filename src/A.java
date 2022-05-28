public class A {
    static  private A a;
    private A(){


    }
    static  public A getInstance(){
        if(a== null)
        a = new A();
        return  a;
    }

}

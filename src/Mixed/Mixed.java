package Mixed;

public class Mixed {
int x;
Integer y;
    public static void main(String[] args) {
        Mixed m = new Mixed();
       // m.g();
       /* A a = new A();
        B b = new B();
        C c = new C();*/
       /*A a2 = new C();

        a2.m1();
        a2.m2();
        a2.m3();
        System.out.println("A to C");*/
        /*c.m1();
        c.m2();
        c.m3();*/
       /* System.out.println(a2.getClass());
        System.out.println(a2.hashCode());
        System.out.println(a2.equals(a2));
        System.out.println(a2.toString());*/
       C c = new C();
       c.go();
        Integer i = new Integer(0);
        i++;
        System.out.println("ti"+i+"text");
        Boolean b = new Boolean("true").booleanValue();
        System.out.println(b);
       // System.out.println(C.mins(1,2));
        //System.out.println(C.SIZE_1);

    }
    public void g(){
        x = y;
        System.out.println(x);
        System.out.println(y);
    }
}

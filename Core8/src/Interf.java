//@FunctionalInterface
public interface Interf {
public abstract void m1(int a,int b);
default void m2() {}
static void m3() {}
//public abstract void m2(int i,int j);
}

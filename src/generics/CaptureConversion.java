package generics;

public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<>(1);
        f1(raw);
        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f2(rawBasic);
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
}

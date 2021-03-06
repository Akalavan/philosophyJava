package containers;

public class TestParam {
    public final int size;
    public final int loops;

    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    public static TestParam[] array(int...values) {
        int size = values.length / 2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for (int i = 0; i < size; i++) {
            result[i] = new TestParam(values[n++], values[n++]);
        }
        return result;
    }

    public static TestParam[] array(String[] value) {
        int[] vals = new int[value.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.decode(value[i]);
        }
        return array(vals);
    }
}

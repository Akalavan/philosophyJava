package reusing;
import static util.Print.*;

class Soap {
    private String s;

    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        print("In constructor Bath()");
        s3 = "Happy3";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }
    public String toString(){
        if (s4 == null)
            s4 = "Happy4";
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        print(bath);
    }

}

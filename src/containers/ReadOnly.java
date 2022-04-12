package containers;

import util.Countries;

import java.util.*;

public class ReadOnly {

    static Collection<String> data = new ArrayList<>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<>(data));
        System.out.println(c);
        //c.add("one");
        List<String> a = Collections.unmodifiableList(new ArrayList<>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next());
//        lit.add("one");

        Set<String> s = Collections.unmodifiableSet(new HashSet<>(data));
        System.out.println(s);
//        s.add("one");

        Map<String, String> m = Collections.unmodifiableMap(new HashMap<>(Countries.capitals(6)));
        System.out.println(m);
  //          m.put("one", "one");

    }
}

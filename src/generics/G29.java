package generics;

import java.util.ArrayList;
import java.util.List;

public class G29 {

    static <T> void f(Holder<List<?>> holder) {
        holder.setValue(new ArrayList<>());
        Object o = holder.getValue();
        List<?> l = holder.getValue();

        Object t = holder.getValue().get(0);
    }
}

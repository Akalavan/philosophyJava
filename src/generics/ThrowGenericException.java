package generics;

import java.util.ArrayList;
import java.util.List;

interface Processor<T, E extends Exception, I extends Exception> {
    void process(List<T> resultCollector) throws E, I;
}

class ProcessRunner<T, E extends Exception, I extends Exception> extends ArrayList<Processor<T, E, I>> {
    List<T> processAll() throws E, I {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E, I> processor :
                this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}

class Failure1 extends Exception {}

class MyEx1 extends Exception {}

class Processor1 implements Processor<String, Failure1, MyEx1> {
    static int count = 3;

    @Override
    public void process(List<String> resultCollector) throws Failure1, MyEx1 {
        if (count-- > 1)
            resultCollector.add("Hep!");
        else
            resultCollector.add("Ho!");
        if (count < 0)
            throw new Failure1();
    }
}

class Failure2 extends Exception {}

class MyEx2 extends Exception {}

class Processor2 implements Processor<Integer, Failure2, MyEx2> {
    static int count = 2;

    @Override
    public void process(List<Integer> resultCollector) throws Failure2, MyEx2 {
        if (count-- == 0)
            resultCollector.add(47);
        else
            resultCollector.add(11);
        if (count < 0)
            throw new Failure2();
    }
}


public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1, MyEx1> runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner.add(new Processor1());
        }

        try {
            System.out.println(runner.processAll());
        } catch (Failure1 | MyEx1 e) {
            System.out.println(e);
        }

        ProcessRunner<Integer, Failure2, MyEx2> runner1 = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner1.add(new Processor2());
        }

        try {
            System.out.println(runner1.processAll());
        } catch (Failure2 | MyEx2 e) {
            System.out.println(e);
        }
    }

}

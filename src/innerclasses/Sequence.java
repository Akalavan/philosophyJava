package innerclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence<T> {
  private List<T> items;
  private int next = 0;
  public Sequence(int size) { items = new ArrayList<>(size); }
  public void add(T x) {
      items.add(x);
  }

  private class SequenceSelector implements Iterator<T> {
    Iterator<T> it = items.iterator();

    @Override
    public boolean hasNext() {
      return it.hasNext();
    }

    @Override
    public T next() {
      return it.next();
    }
  }

  private class SequenceSelectorReverse implements Iterator<T> {
    private int i = items.size() - 1;

    @Override
    public boolean hasNext() {
      return i >= 0;
    }

    @Override
    public T next() {
      return items.get(i--);
    }


  }

  public Iterator<T> selector() {
    return new SequenceSelector();
  }
  public Iterator<T> reverseSelector() {
    return new SequenceSelectorReverse();
  }

  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
//    Iterator selector = sequence.selector();
//
//    while(selector.hasNext()) {
//      System.out.print(selector.next() + " ");
//    }

    Iterator reverseSelector = sequence.reverseSelector();

    while(reverseSelector.hasNext()) {
      System.out.print(reverseSelector.next() + " ");
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

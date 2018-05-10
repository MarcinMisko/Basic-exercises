package mayEighth;


import maySeventh.stos.Element;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicList implements ListContract{
    private ListElement first;
    private ListElement last;
    private int size = 0;


    @Override
    public ListElement getFirst() {
        return first;
    }

    @Override
    public ListElement getLast() {
        return last;
    }

    @Override
    public ListElement get(int index) {

        if (index >= size) {
            return null;
        }
        ListElement element = first;
        while (index-- > 0){
            element = element.getNext();
        }
        return element;
    }

    @Override
    public void add(ListElement element) {
        if (first == null){
            first = element;
            last = first;
        }else {
            element.setPrevious(last);
            last.setNext(element);
            last = last.getNext();
        }
        size++;
    }

    @Override
    public void remove(int index) {
        ListElement toRemove = get(index);
        if (size == 1){
            first = null;
            last = null;
        }else if (toRemove.equals(first)){
            first.getNext().setPrevious(null);
            first = first.getNext();
        }else if (toRemove.equals(last)){
            last.getPrevious().setNext(null);
            last = last.getPrevious();
        }else {
            toRemove.getNext().setPrevious(toRemove.getPrevious());
            toRemove.getPrevious().setNext(toRemove.getNext());
        }

        size--;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

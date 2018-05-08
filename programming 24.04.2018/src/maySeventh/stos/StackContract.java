package maySeventh.stos;

public interface StackContract {

    void push(Element element);
    Element pop();
    Element peek();
    int size();
    boolean isEmpty();
    void show();
    Stack stackReverse();
}

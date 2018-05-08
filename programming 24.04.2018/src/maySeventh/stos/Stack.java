package maySeventh.stos;


public class Stack implements StackContract {
    private int size = 0;
    private Element top;


    @Override
    public void push(Element element) {
        if (!this.isEmpty()) {
            element.setPrevious(this.top);
        }
        this.top = element;
        this.size++;
    }

    @Override
    public Element pop() {
        if (!this.isEmpty()) {
            Element popElement = top;
            this.top = this.top.getPrevious();
            this.size--;
            return popElement;
        }
        return null;
    }

    @Override
    public Element peek() {
        return this.top;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void show() {
        Element temp = top;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getPrevious();
        }
    }

    @Override
    public Stack stackReverse() {
        Stack stackElement = new Stack();
        if (!this.isEmpty()){
            Element element = this.pop();
            element.setPrevious(null);
            stackElement.push(element);
            while (this.size() > 0){
                stackElement.push(this.pop());
            }
        }
        return stackElement;
    }
}


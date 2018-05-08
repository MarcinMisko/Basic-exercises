package maySeventh.stos;

public class Main {
    public static void main(String[] args) {
        Element element0 = new Element(10);
        Element element1 = new Element(20);
        Element element2 = new Element(30);
        Element element3 = new Element(40);
        Element element4 = new Element(50);
        Element element5 = new Element(60);

        Stack stackElement = new Stack();
        stackElement.push(element0);
        stackElement.push(element1);
        stackElement.push(element2);
        stackElement.push(element3);
        stackElement.push(element4);
        stackElement.push(element5);

//        System.out.println("po dodaniu elementów: " +
//                stackElement.size());
//
//        Element tymczasowyElement = stackElement.pop();
//
//        System.out.println("wartość zdjętego elementu: " +
//                tymczasowyElement.getValue());
//
//        System.out.println("po zdjęciu elementu: " +
//                stackElement.size());

        Stack stackRevert = stackElement.stackReverse();
        stackRevert.show();

    }
}

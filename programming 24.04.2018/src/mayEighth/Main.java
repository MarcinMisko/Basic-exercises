package mayEighth;

public class Main {
    public static void main(String[] args) {
//        DynamicList list = new DynamicList();
//        ListElement element1 = new ListElement(3);
//        ListElement element2 = new ListElement(35);
//        ListElement element3 = new ListElement(312);
//
//        list.add(element1);
//        list.add(element2);
//        list.add(element3);

        DynamicList list = new DynamicList();

        list.add(new ListElement(11));
        list.add(new ListElement(22));
        list.add(new ListElement(33));
        list.add(new ListElement(44));

        

        System.out.println("Element o indeksie 2: " + list.get(2).getValue());


    }
}

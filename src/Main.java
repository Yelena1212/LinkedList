public class Main {
    static Item head;

    public static Item addToEnd(int value, Item tail) {
        Item newItem = new Item(value);
        if (head == null) {
            head = newItem;
            return newItem;
        } else {
            tail.nextItem = newItem;
            return newItem;

        }

    }

    /*сделать метод, которы qдобавляет в конце списка. Теqла нет вообще, ест только хеад. Использовать валq*/
    public static void add(int value) {
        Item tmp = new Item(value);
        if (head == null) { // empty list
            head = tmp;
        } else {
            Item current = head;
            while (current.nextItem != null) {
                current = current.nextItem;
            }
            current.nextItem = tmp;
        }
    }

    public static Item addToBegin(int value, Item item) {
        Item newItem = new Item(value);
        if (head == null) {
            //  head = newItem;
            return newItem;
        } else {
//            Item temp = head;
//            head = newItem;
//            newItem = head.nextItem;
            newItem.nextItem = head;
            //  head=newItem;
            return newItem;
        }
    }

    public static void printList() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Item cursor = head;
        while (cursor != null) {
            System.out.print(cursor.age + "->");
            cursor = cursor.nextItem;
        }
    }

    public static Item addAfter(int searchVal, int value, Item item) {
        Item newItem = new Item(value);
        if (head == null) {
            //  head = newItem;
            return newItem;
        }
        Item cursor = head;
        while (cursor != null) {
            if (cursor.age == searchVal) {
                //cursor d4
                Item temp = cursor.nextItem;
                //temp a3
                cursor.nextItem = newItem;
                //c4
                newItem.nextItem = temp;
                return newItem;
            }
            cursor = cursor.nextItem;
        }
        return null;
    }


    public static void main(String[] args) {
//   head= new Item(15)
//        Item tail = null;// = new Item(10);
//        tail = addToEnd(55, tail);
//        tail = addToEnd(44, tail);
        head = addToBegin(3, null);
        head = addToBegin(6, null);
        addAfter(55, 12, null);
        add(7);

//   add(87);
        printList();


//   add(44);
        // head.nextItem = new Item(28);
        //   head.nextItem.prevItem = head;
//        Item item2 = new Item(25);
//        item1.nextItem = item2;
//        item2.prevItem = item1;
//        item2.nextItem = item1;
//        Item first = item1;
//        first.nextItem.age = 35;
//        Item tail = item2;
//        tail.nextItem.age = 20;

        System.out.println();
    }

}
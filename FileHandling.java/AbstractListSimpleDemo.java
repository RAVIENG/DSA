import java.util.AbstractList;

class SimpleList extends AbstractList<String> {
    private String[] data = new String[3];
    private int size = 0;

    @Override
    public boolean add(String s) {
        if (size < data.length) {
            data[size++] = s;
            return true;
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return size;
    }
}

public class AbstractListSimpleDemo {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Elements in SimpleList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

import java.util.*;

public class InsertionRemoveHeap {

    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data) {
            list.add(data);
            int x = list.size() - 1;

            while (x > 0) {
                int par = (x - 1) / 2;

                if (list.get(x) < list.get(par)) {
                    int temp = list.get(x);
                    list.set(x, list.get(par));
                    list.set(par, temp);
                    x = par;
                } else {
                    break;
                }
            }
        }

        // HEAPIFY DOWN
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < list.size() && list.get(left) < list.get(minidx)) {
                minidx = left;
            }

            if (right < list.size() && list.get(right) < list.get(minidx)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = list.get(i);
                list.set(i, list.get(minidx));
                list.set(minidx, temp);
                heapify(minidx);
            }
        }

        public int remove() {
            int data = list.get(0);

            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);

            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(6);
        h.add(7);
        h.add(1);

        System.out.println(h.remove()); // 1
        System.out.println(h.remove()); // 3
    }
}

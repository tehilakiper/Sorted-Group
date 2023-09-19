import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>> implements Iterable<T> {

    private ArrayList<T> elements;

    public SortedGroup() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
        Collections.sort(this.elements);
    }

    public T get(int index) {
        return this.elements.get(index);
    }

    public int size() {
        return this.elements.size();
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public int remove(T element) {
        int count = 0;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            T currentElement = iterator.next();
            if (currentElement.equals(element)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return this.elements.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }
}



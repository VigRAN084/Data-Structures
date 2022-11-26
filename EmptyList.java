import java.util.List;
public class EmptyList<E> extends PolymorphicList<E> {
    public int size() {
        return 0;
    }

    public E get(int index) {
        throw new IndexOutOfBoundsException("based");
    }

    public PolymorphicList<E> add(E toAdd) {
        return new NonemptyList<E>(toAdd, this);
    }

    public PolymorphicList f(int n, int m) {
        return this;
    }
    public String toString() {
        return "";
    }
    public PolymorphicList g(int a, int b) {
        return this;
    }
    
    public PolymorphicList f(int n, E m) {
        return this;
    }
}

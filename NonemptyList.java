public class NonemptyList<E> extends PolymorphicList<E> {
    private E data;
    private PolymorphicList<E> next;

    public NonemptyList(E val, PolymorphicList<E> nextList) {
        data = val;
        next = nextList;
    }

    public int size() {
        return 1 + next.size();
    }

    public E get(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        else if (index == 0) return data;
        else return next.get(index -1 );
    }

    public PolymorphicList<E> add(E toAdd) {
        next = next.add(toAdd);
        return this;
    }

    public PolymorphicList<E> f(int n, E m) {
        if (n == 0) {
            return new NonemptyList<>(m, this);
        }
        else {
            next = next.f(n-1, m);
            return this;
        }
    }

    public PolymorphicList g(int a, int b) {
        if (a > 0) {
            return next.g(a-1, b-1);
        }
        else {
            if (b > -1) {
                next = next.g(a, b-1);
                return this;
            } else return new EmptyList();
        }
    }

    public String toString() {
        return data.toString() + next.toString();
    }
}

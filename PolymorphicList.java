public abstract class PolymorphicList<E> {
    abstract int size();
    abstract E get(int index);
    abstract PolymorphicList<E> add(E toAdd);
    abstract PolymorphicList f(int n, E m);
    abstract PolymorphicList g(int n, int m);
    public abstract String toString();
}

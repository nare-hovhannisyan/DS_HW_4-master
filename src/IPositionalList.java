public interface IPositionalList<E> {
    int size();
    boolean isEmpty();
    IPosition<E> first();
    IPosition<E> last();
    IPosition<E> before(IPosition<E> p) throws IllegalArgumentException;
    IPosition<E> after(IPosition<E> p) throws IllegalArgumentException;

    IPosition<E> addFirst(E e);
    IPosition<E> addLast(E e);
    IPosition<E> addBefore(IPosition<E> p, E e) throws IllegalArgumentException;
    IPosition<E> addAfter(IPosition<E> p, E e) throws IllegalArgumentException;
    E set(IPosition<E> p, E e) throws IllegalArgumentException;
    E remove(IPosition<E> p) throws IllegalArgumentException;
}

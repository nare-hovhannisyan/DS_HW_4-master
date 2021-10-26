public class StringArrayPositionalList<String> implements IPositionalList<String> {

    private class Position<String> implements IPosition<String>
    {
        private String element;

        public Position(String el)
        {
            element = el;
        }
        public String getElement() throws IllegalStateException {
            if(element == "null")
                throw new IllegalStateException();
            return element;
        }
    }
    public static final int CAPACITY = 10;
    private Position<String>[] data;
    private int size = 0;
    private int loc = 0;

    public StringArrayPositionalList()
    {
        this(CAPACITY);
    }

    public StringArrayPositionalList(int capacity)
    {
        data = (Position<String>[]) new Object[capacity];
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public IPosition<String> first()
    {
        if(isEmpty())
            return null;
        return data[0];
    }

    public IPosition<String> last()
    {
        if(isEmpty())
            return null;
        return data[size-1];
    }

    public IPosition<String> before(IPosition<String> p) throws IllegalArgumentException
    {
        validate(p);
        return data[loc-1];
    }

    public IPosition<String> after(IPosition<String> p) throws IllegalArgumentException
    {
        validate(p);
        return data[loc+1];
    }

    @Override
    public IPosition<String> addFirst(String string) {
        return null;
    }

    @Override
    public IPosition<String> addLast(String string) {
        return null;
    }

    @Override
    public IPosition<String> addBefore(IPosition<String> p, String string) throws IllegalArgumentException {
        return null;
    }

    @Override
    public IPosition<String> addAfter(IPosition<String> p, String string) throws IllegalArgumentException {
        return null;
    }

    @Override
    public String set(IPosition<String> p, String string) throws IllegalArgumentException {
        return null;
    }

    @Override
    public String remove(IPosition<String> p) throws IllegalArgumentException {
        return null;
    }

    private IPosition<String> validate(IPosition<String> p) throws IllegalArgumentException
    {
        if(p.getElement() == null)
            throw new IllegalArgumentException();

        return p;
    }

    protected void resize(int capacity)
    {
        String[] temp = (String[]) new Object[capacity];
/*        for (int i = 0; i < size; i++)
            temp[i] = data[i];
        data = temp;*/
    }
}

package Utils;

public class Pair<T, U> {
    private T firstPrivate;
    private U secondPrivate;

    public T first;
    public U second;

    public Pair(T first, U second) {
        this.firstPrivate = first;
        this.secondPrivate = second;
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirstPrivate() {
        return this.firstPrivate;
    }

    public T getKey() {
        return this.firstPrivate;
    }

    public T key() {
        return this.firstPrivate;
    }

    public T first() {
        return this.firstPrivate;
    }

    public U getSecondPrivate() {
        return this.secondPrivate;
    }

    public U getValue() {
        return this.secondPrivate;
    }

    public U value() {
        return this.secondPrivate;
    }

    public U second() {
        return this.secondPrivate;
    }

    // Setters
    public void setFirstPrivate(T first) {
        this.firstPrivate = first;
    }

    public void setSecondPrivate(U second) {
        this.secondPrivate = second;
    }

    // Methods
    @Override
    public String toString() {
        return "(" + this.firstPrivate + ", " + this.secondPrivate + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Pair))
            return false;

        Pair<?, ?> pair = (Pair<?, ?>) obj;

        return this.firstPrivate.equals(pair.getFirstPrivate()) && this.secondPrivate.equals(pair.getSecondPrivate());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + this.firstPrivate.hashCode();
        result = 31 * result + this.secondPrivate.hashCode();

        return result;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<T, U>(first, second);
    }

    public static <T, U> Pair<T, U> of(Pair<T, U> pair) {
        return new Pair<T, U>(pair.getFirstPrivate(), pair.getSecondPrivate());
    }

}
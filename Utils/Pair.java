package Utils;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirst() {
        return this.first;
    }

    public T getKey() {
        return this.first;
    }

    public T key() {
        return this.first;
    }

    public T first() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

    public U getValue() {
        return this.second;
    }

    public U value() {
        return this.second;
    }

    public U second() {
        return this.second;
    }

    // Setters
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }


    // Methods
    @Override
    public String toString() {
        return "(" + this.first + ", " + this.second + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Pair))
            return false;

        Pair<?, ?> pair = (Pair<?, ?>) obj;

        return this.first.equals(pair.getFirst()) && this.second.equals(pair.getSecond());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + this.first.hashCode();
        result = 31 * result + this.second.hashCode();

        return result;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<T, U>(first, second);
    }

    public static <T, U> Pair<T, U> of(Pair<T, U> pair) {
        return new Pair<T, U>(pair.getFirst(), pair.getSecond());
    }

}
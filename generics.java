class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class generics {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hello");
        System.out.println("StringBox = " + stringBox.get());

        Box<Integer> intBox = new Box<>(100);
        System.out.println("IntBox = " + intBox.get());

	}
}

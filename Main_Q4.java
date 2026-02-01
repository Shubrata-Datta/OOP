class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Lion extends Animal {

    private double maneLength;

    public double getManeLength() {
        return maneLength;
    }

    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mane Length: " + maneLength);
    }
}

class Elephant extends Animal {

    private double tuskLength;

    public double getTuskLength() {
        return tuskLength;
    }

    public void setTuskLength(double tuskLength) {
        this.tuskLength = tuskLength;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tusk Length: " + tuskLength);
    }
}

public class Main_Q4 {

    public static void main(String[] args) {

        Animal a1 = new Lion();
        a1.setName("Simba");
        a1.setAge(5);
        ((Lion) a1).setManeLength(25.5);

        Animal a2 = new Elephant();
        a2.setName("Dumbo");
        a2.setAge(10);
        ((Elephant) a2).setTuskLength(40.0);

        Animal[] animals = {a1, a2};

        for (Animal a : animals) {
            a.displayInfo();
            System.out.println();
        }
    }
}


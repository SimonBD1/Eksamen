public abstract class Animal {
    public int hoursSlept;
    int hours;

    public abstract int sleep(int hours);

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.sleep(4));
        System.out.println(cat.sleep(4));
    }
}

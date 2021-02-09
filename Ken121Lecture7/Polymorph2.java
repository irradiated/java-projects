public class Polymorph2 {
    public static void main() {
        Cat pet1 = new Cat("Snowball");
        Dog pet2 = new Dog("Santa's little helper");

        feed(pet1);
        feed(pet2);

        Cat felix = new Cat("Snowball II");
        System.out.println(pet1.equals(felix));
    }

    public static void feed(Animal a) {
        System.out.print("It's time to feed " + a.getName());

        if (a instanceof Cat) {
            System.out.println(", the cat");
            Cat c = (Cat)a;
            c.talk();
        }

        if (a instanceof Dog) {
            System.out.println(", the dog");
        }
    }
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        System.out.println("Animal Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            Animal a = (Animal) o;
            return name.equals(a.getName());
        }
        return false;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("Cat Constructor");
    }

    public void talk() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
        System.out.println("Dog Constructor");
    }
}
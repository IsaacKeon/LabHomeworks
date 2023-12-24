public class Polymorphism {

    public static void main(String[] args) {

        // Method overriding

        Animal myAnimal = new Animal();

        Animal myCat = new Cat();

        Animal myDog = new Dog();

        myAnimal.animalSound();

        myCat.animalSound();

        myDog.animalSound();

        // Method overloading

        int a = add(1, 2);

        int b = add(1, 2, 3);

        System.out.println("Overloaded Method add with two params:" + a);

        System.out.println("Overloaded Method add with three params:" + b);

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

}

class Animal {

    public void animalSound() {

        System.out.println("The animal makes a sound");

    }

}

class Cat extends Animal {

    public void animalSound() {

        System.out.println("The cat says: Meeaow");

    }

}

class Dog extends Animal {

    public void animalSound() {

        System.out.println("The dog says: bow wow");

    }

}
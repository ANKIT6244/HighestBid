public class MainDogg {
    public static void main(String[] args) {

        Dogg dogy = new Dogg();
        dogy.name = "Labrador";
        dogy.Colour = "Black";
        dogy.bark();
        dogy.run();

        Cat cat = new Cat();
        cat.name = "Persion cat";
        cat.pattern = "tabby";
        cat.Meow();
        cat.run();
    }
}

class Animal {
    String name;

    public void run() {
        System.out.println("Animal is running.");
    }
}

class Dogg extends Animal {
    String Colour;

    public void bark() {
        System.out.println("Wooh! Wooh!");
    }
}

class Cat extends Animal {
    String pattern;

    public void Meow() {
        System.out.println("Meow! Meow!");
    }
}

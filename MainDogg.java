public class MainDogg {
    public static void main(String[] args) {

        Dogg dogy = new Dogg();
        dogy.setname("Labrador");
        dogy.setColour("Black");
        dogy.bark();
        dogy.run();
        System.out.println(dogy.getname());
        System.out.println(dogy.getname());

        Cat cat = new Cat();
        cat.setname("Persion cat");
        cat.setPattern("tabby");
        cat.Meow();
        cat.run();
        System.out.println(cat.getname());
        System.out.println(cat.getPattern());

        Puppy pup = new Puppy();
        pup.setSize(25);
        pup.setAge(2);
        pup.sleep();
        pup.run();
        pup.bark();
        System.out.println(pup.getSize() + "Inch");
        System.out.println("Age: " + pup.getAge() + "Years");
    }
}

class Animal {
    private String name;

    public void run() {
        System.out.println("Animal is running.");
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}

class Dogg extends Animal {

    private String Colour;

    public void bark() {
        System.out.println("Wooh! Wooh!");
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }
}

class Cat extends Animal {

    private String pattern;

    public void Meow() {
        System.out.println("Meow! Meow!");
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}

class Puppy extends Dogg {
    private int size;
    private int age;

    public void sleep() {
        System.out.println("Puppy is Sleeping.");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

abstract class Animal{
    public abstract void makeSound();
}
class Dog extends Animal{
    public void makeSound(){System.out.println("dog barks");}
}
class Cat extends Animal{
    public void makeSound(){System.out.println("cat");
    }
}
class Bird extends Animal{public void makeSound()
{System.out.println("bird");
}
    public static void main(String[] args){
        Dog d= new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
        Bird b=new Bird();
        b.makeSound();
    }
}

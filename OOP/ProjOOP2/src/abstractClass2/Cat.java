package abstractClass2;

public class Cat extends Animal {

    public Cat(){
        this.kind = "Mammal";
    }

    @Override
    public void sound() {
        System.out.println("Meow ❤︎");
    }
}

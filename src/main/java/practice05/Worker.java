package practice05;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("My name is "+this.name+". I am "+this.age+" years old,Teaching for the future of the world");
    }
}

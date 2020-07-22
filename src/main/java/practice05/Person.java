package practice05;

public abstract class Person {
    protected String name;
    protected int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public Person(String name,int age){
        this.name= name;
        this.age = age;
    }

    public abstract void introduce();
}

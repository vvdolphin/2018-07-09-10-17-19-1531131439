package practice04;

public class Student extends Person {
    private String className;

    public Student(String name, int age,String className) {
        super(name, age);
        this.className = className;
    }

    @Override
    public void introduce() {
        System.out.println("My name is "+this.name+". I am "
                +this.age+" years old. I am a  student of "
                +className+". Coding for the glory of OOCL");
    }
}

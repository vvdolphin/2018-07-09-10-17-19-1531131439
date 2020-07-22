package practice05;

public class Student extends Person {
    private String className;

    public Student(String name, int age,String className) {
        super(name, age);
        this.className = className;
    }

    public void  setClassName(String className){
        this.className = className;
    }

    @Override
    public void introduce() {

    }


}

package practice04;

public class Student extends Person {
    private int klass;

    public Student(String name, int age,int className) {
        super(name, age);
        this.klass = className;
    }

    public int getKlass(){
        return this.klass;
    }
    @Override
    public String introduce() {
        String msg = super.introduce();
        msg+=" I am a Student. I am at Class "+this.klass+".";
        return msg;
    }
}

package practice05;

public class Student extends Person {
    private int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public void  setKlass(int setKlass){
        this.klass = setKlass;
    }
    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String msg = super.introduce();
        msg +=" I am a Student. I am at Class "+this.klass+".";
        return msg;
    }


}

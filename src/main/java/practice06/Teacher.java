package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }


    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce(){
        String msg =super.introduce();
        if (klass == 0){
            msg +=" I am a Teacher. I teach No Class.";
        }else{
            msg +=" I am a Teacher. I teach Class "+this.klass+".";
        }
        return msg;
    }
}

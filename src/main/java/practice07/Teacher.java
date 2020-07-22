package practice07;

public class Teacher extends Person {
    private Klass klass;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        String msg =super.introduce();
        if (klass == null){
            msg +=" I am a Teacher. I teach No Class.";
        }else{
            msg +=" I am a Teacher. I teach Class "+this.klass.getNumber()+".";
        }
        return msg;
    }

    public String introduceWith(Student student){
        String msg = super.introduce();
        if (student.getKlass().getNumber() == this.klass.getNumber()){
            return msg += " I am a Teacher. I teach "+student.getName()+"." ;
        }else{
            return msg += " I am a Teacher. I don't teach "+student.getName()+"." ;
        }
    }





}

package practice10;


public class Student extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age , Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    @Override
    public String introduce(){
        String msg =super.introduce();

        if (this.klass.getLeader() != null){
            if (this.klass.getLeader().getId()==this.getId()){
                return   msg +=" I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
            }
        }
        return  msg +=" I am a Student. I am at Class "+this.klass.getNumber()+".";
    }
}

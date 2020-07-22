package practice10;


import java.util.Collection;

public class Teacher extends Person {
    private Collection<Klass> classes;


    public Collection<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age, Collection<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        String msg = super.introduce();
        if (classes != null){
            if (classes.size() != 0){
                msg+=" I am a Teacher. I teach Class ";
                for (Klass klass:classes
                ) {
                    msg += klass.getNumber()+", ";

                }
              return  msg = msg.substring(0,msg.length()-2)+".";
            }
        }
        return  msg +=" I am a Teacher. I teach No Class.";
    }

    public boolean isTeaching(Student student){
        for (Klass klass :
             classes) {
            if (klass.isIn(student)){
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student){
        String msg = super.introduce();
        for (Klass klass :
            classes  ) {
            if (student.getKlass().getNumber() == klass.getNumber()){
                return msg += " I am a Teacher. I teach "+student.getName()+"." ;
            }
        }
        return msg += " I am a Teacher. I don't teach "+student.getName()+"." ;

    }

}

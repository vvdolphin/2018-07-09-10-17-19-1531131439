package practice11;

import javax.print.event.PrintEvent;
import java.util.EventObject;
import java.util.Vector;

public class Klass  {
    private int number;
    private Student leader;

    private Vector<TeacherListener> teacherListeners = new Vector<>();

    public void addListener(TeacherListener teacher){
        teacherListeners.add(teacher);
    }



    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        if (this.leader != null){
            return leader;
        }else{
            return null;
        }
    }

    public Klass(int number) {

        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student){
        if (student.getKlass().getNumber() != this.getNumber()){
            System.out.print("It is not one of us.\n");
        }else{
            teacherListeners.forEach(listener->{
                listener.notic(student,1);
            });
            this.leader= student;
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
        teacherListeners.forEach(listener->{
            listener.notic(student,2);
        });
    }

    public boolean isIn(Student student){
        int number = student.getKlass().getNumber();
        if (this.getNumber() == number){
            return true;
        }else {
            return false;
        }
    }

    public void regesit(){

    }


}

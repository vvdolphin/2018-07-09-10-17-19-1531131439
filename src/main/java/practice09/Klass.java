package practice09;

public class Klass {
    private int number;
    private Student leader;

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
            this.leader= student;
        }
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }

}

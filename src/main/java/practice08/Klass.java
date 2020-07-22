package practice08;

public class Klass {
    private int number;
    private Student leader;

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student){
        this.leader= student;
    }

}

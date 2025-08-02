package backround;

public class stu {
    private String name;
    private int  age;
    private double score;
    public stu(String name,int age,int score){
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public boolean isPassed(int score){
        if (score>=5)
            return true;
        else
            return false;
    }
}

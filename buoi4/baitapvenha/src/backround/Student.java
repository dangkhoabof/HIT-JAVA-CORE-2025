package backround;

public class Student {
    private String name;
    private int birthYear;
    private  String addDress;
    private double tx1;
    private double tx2;
    private int nghi;
    private double GPA;
    private double KTHP;

    public Student(String name, int birthYear, String addDress, double tx1, double tx2, int nghi,double KTHP){
        this.name=name;
        this.birthYear=birthYear;
        this.addDress=addDress;
        this.tx1=tx1;
        this.tx2=tx2;
        this.nghi=nghi;
        this.KTHP=KTHP;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public int getNghi() {
        return nghi;
    }

    public void setNghi(int nghi) {
        this.nghi = nghi;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddDress() {
        return addDress;
    }

    public void setAddDress(String addDress) {
        this.addDress = addDress;
    }

    public double getGPA() {
        return tx1*0.2+tx2*0.3+KTHP*0.5;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getKTHP() {
        return KTHP;
    }

    public void setKTHP(double KTHP) {
        this.KTHP = KTHP;
    }
    public int getAge(){
        return  2025-birthYear;
    }
    public void display(){
        System.out.printf("%-8s%-8d%-12s%-8.2f%-8.2f%-8.2f%-8.2f%-8d\n",getName(),2025-getBirthYear(),getAddDress(),getTx1(),getTx2(),getKTHP(),getGPA(),getNghi());
    }
}

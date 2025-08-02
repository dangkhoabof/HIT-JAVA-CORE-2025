package backround;

public class book {
    private String title;
    private  String author;
    public book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void disPlayInfo(){
        System.out.println("day la quyen sach co tua de "+this.title+" cua tac gia "+ this.author);
    }
    public String getTitle(){
        return title;
    }
    public  void setTitle(String title){
        this.title=title;
    }
}

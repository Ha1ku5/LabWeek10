public class Student {
    private String first;
    private String last;

    //constructor, sets name of student
    //Lastname, Firstname
    public Student(String last, String first){
        this.first = first;
        this.last = last;
    }
    //getter
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public String fullName(){
        return first + " " + last;
    }

    //setter
    public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }


}

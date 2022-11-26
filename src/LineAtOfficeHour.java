public class LineAtOfficeHour {
    private Student[] line;
    private int N;
    private int back;

    //constructors
    public LineAtOfficeHour() {
        line = new Student[5];
        N = 0;
        back = 0;
    }

    public LineAtOfficeHour(Student[] line) {
        System.arraycopy(line, 0, this.line, 0, Math.min(line.length, 5));
    }

    public boolean isEmpty() {
        return line.length == 0;
    }

    public boolean isFull(){
        return line.length == 5;
    }
    //returns number of students in line
    public int size(){
        int count = 0;
        for (Student student : line)
            if (student != null)
                count++;
        return count;
    }
    //adds a new student to the end of the line,
    //failing if the line is full
    public void enterLine(Student s){
        if(size() == 5) {
            System.out.println("Sorry, the line is full!");
        } else {
            line[size()] = s;
        }
    }
    //removes the first student in line
    //shifts the line over to the left
    public void seeTeacher(){
        System.out.println(line[0].fullName() + " Saw the teacher.");
        for(int i = 0; i < size() - 1; i++)
            line[i] = line[i + 1];
    }
    //returns list of people in line as string
    //first last, first last, etc...
    public String whosInLine(){
        StringBuilder lineAsString = new StringBuilder();
        for (Student s: line)
            lineAsString.append(s.fullName()).append(", ");
        lineAsString.delete(lineAsString.length() - 2, lineAsString.length() - 1);
        return lineAsString.toString();
    }


}

import javax.sound.sampled.Line;
//000000000000000000000000000000000000000000000000000000000000000000000000000000


public class TestLine {
    public static void main(String[] args) {
        Student jeff = new Student("Jones", "Jeffery");
        Student ava = new Student("Seating", "Available");
        Student joe = new Student("Obama", "Joseph");
        Student jon = new Student("Snow", "Jonathan");
        Student ted = new Student("Trivago", "Hotel");
        Student harry = new Student("Davidson", "Hardly");
        Student ip = new Student("11 pro", "Iphone");

        Student[] someStudents = {jeff, ava, joe, jon, ted};
        LineAtOfficeHour theLine = new LineAtOfficeHour(someStudents);

        System.out.println(theLine.whosInLine());
        System.out.println("number of students in line: " + theLine.size());
        System.out.println("The line is full: " + theLine.isFull()
                + ", with " + theLine.getN() + " students in line.");
        System.out.println("Therefore the back of the line is at index: "
                + theLine.getBack());
        System.out.println();
        //try to add person when line is full
        theLine.enterLine(harry);
        System.out.println();

        //removing a student from the line
        theLine.seeTeacher();
        System.out.println(theLine.whosInLine());
        theLine.seeTeacher();
        System.out.println(theLine.whosInLine());
        System.out.println("number of students in line: " + theLine.size());
        System.out.println("The line is full: " + theLine.isFull()
                + ", with " + theLine.getN() + " students in line.");
        System.out.println();
        theLine.seeTeacher();
        theLine.seeTeacher();
        theLine.seeTeacher();
        System.out.println("The line is empty: " + theLine.isEmpty() + ", with "
                + theLine.getN() + " students in line.");
        theLine.seeTeacher();
    }
}

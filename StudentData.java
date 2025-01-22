public class StudentData implements Comparable<StudentData> {
    private int rollNo;
    private String name;
    private float marks;

    public StudentData(int rollNo, String name, float marks){
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    public String toString(){
        return rollNo+"#"+name+"_"+marks;
    }
    @Override
    public int compareTo(StudentData that) {
        return Float.compare(this.marks, that.marks);
    }
    
    
}

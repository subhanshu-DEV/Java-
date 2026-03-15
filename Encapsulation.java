class Student
{
    private int marks;   // data hidden

    public void setMarks(int m)
    {
        marks = m;
    }

    public int getMarks()
    {
        return marks;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();

        s.setMarks(90);               // value set
        System.out.println(s.getMarks()); // value get
    }
}
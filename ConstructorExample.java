class Student {

    int id;
    String name;

    
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Aman");

        s1.display();
        s2.display();
    }
}
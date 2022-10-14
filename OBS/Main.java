package OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ayşegül", 5350000, "BYLJ");
        Teacher t2 = new Teacher("Graham Bell", 000, "FZK");
        Teacher t3 = new Teacher("Bahar", 999, "MAT");

        Course mat = new Course(t3, "Matematik", "101", "MAT");
        mat.addTeacher(t3);

        Course fizik = new Course(t2, "Fizik", "102", "FZK");
        fizik.addTeacher(t2);


        Course biyoloji = new Course(t1, "Biyoloji", "103", "BYLJ");
        biyoloji.addTeacher(t1);


        Student s1 = new Student("Murat", "123", "1", biyoloji, fizik, mat);
        s1.addBulkExamNote(100, 30, 50,70,100,50,40,90,40);
        s1.isPass();

        Student s2=  new Student("Berkay","12","2",biyoloji,fizik,mat);
        s2.addBulkExamNote(100,70,30,50,80,20,75,40,40);
        s2.isPass();
    }
}

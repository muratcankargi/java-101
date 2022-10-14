package Classes.OBS;

class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    int quizRate;

    Course(Teacher teacher, String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.quiz=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
//            printTeacher();
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}

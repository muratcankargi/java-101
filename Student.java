package Classes.OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course quiz1;
    Course quiz2;
    Course quiz3;
    Course quizRate1;
    Course quizRate2;
    Course quizRate3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int quiz1, int quizRate1, int note2, int quiz2, int quizRate2, int note3, int quiz3, int quizRate3) {

        if (note1 >= 0 && note1 <= 100 && quiz1 >= 0 && quiz1 <= 100 && quizRate1 >= 0 && quizRate1 <= 100 ) {
            this.c1.note = note1;
            this.c1.quiz = quiz1;
            this.c1.quizRate = quizRate1;
        }
        if (note2 >= 0 && note2 <= 100 && quiz2 >= 0 && quiz2 <= 100 && quizRate2 >= 0 && quizRate2<= 100) {
            this.c2.note = note2;
            this.c2.quiz = quiz2;
            this.c2.quizRate = quizRate2;
        }
        if (note3 >= 0 && note3 <= 100 && quiz3 >= 0 && quiz3 <= 100 && quizRate3 >= 0 && quizRate3 <= 100) {
            this.c3.note = note3;
            this.c3.quiz = quiz3;
            this.c3.quizRate = quizRate3;
        }
    }

    void printNote() {
        double result;

        System.out.println(this.c1.name + " Sınav Notu (" + (100 - this.c1.quizRate) + "%) : \t" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu (" + c1.quizRate + "%) : \t" + this.c1.quiz);
        result = ((this.c1.note * (100 - this.c1.quizRate)) / 100.0) + ((this.c1.quiz * this.c1.quizRate) / 100.0);
        this.avarage = result;
        System.out.println(this.c1.name + " Başarı Notu : \t" + result);


        System.out.println(this.c2.name + " Sınav Notu (" + (100 - this.c2.quizRate) + "%) : \t" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu (" + c2.quizRate + "%) : \t" + this.c2.quiz);
        result = ((this.c2.note * (100 - this.c2.quizRate)) / 100.0) + ((this.c2.quiz * this.c2.quizRate) / 100.0);
        this.avarage += result;
        System.out.println(this.c2.name + " Başarı Notu : \t" + result);

        System.out.println(this.c3.name + " Sınav Notu (" + (100 - this.c3.quizRate) + "%) : " + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu (" + c3.quizRate + "%) : " + this.c3.quiz);
        result = ((this.c3.note * (100 - this.c3.quizRate)) / 100.0) + ((this.c3.quiz * this.c3.quizRate) / 100.0);
        this.avarage += result;
        System.out.println(this.c1.name + " Başarı Notu : " + result);

        this.avarage = this.avarage / 3;
        System.out.println("Ortalamanız : " + this.avarage);
    }

    void isPass() {
        System.out.println("=============");

        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız!");
            this.isPass = false;
        }
        printNote();


    }
}

package Classes.OBS;

class Teacher {
    String name;
    int mpNo;
    String branch;

    Teacher(String name,int mpNo,String branch){
        this.name=name;
        this.mpNo=mpNo;
        this.branch=branch;
    }
    void print(){
        System.out.println("Ad : "+this.name);
        System.out.println("Telefon :"+this.mpNo);
        System.out.println("Bölümü : "+this.branch);
    }
}

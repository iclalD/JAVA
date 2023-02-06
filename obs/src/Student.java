public class Student {
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;
    Course mat, fizik, kimya;

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya, Course matSozlu, Course fizikSozlu, Course kimyaSozlu) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.grade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.grade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.grade = kimya;
        }
    }

    public void addSozluNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }
    }

    public void isPass() {
        if (this.mat.grade == 0 || this.fizik.grade == 0 || this.kimya.grade == 0 || this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmedi.");
        } else {
            this.isPass = isCheckPass();
            printGrade();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı geçti!");
            } else {
                System.out.println("Sınıfta kaldı...");
            }
        }
    }

    public void calcAverage() {
        this.average = (((this.mat.grade * 0.80) + (this.mat.sozlu * 0.20)) +
                ((this.fizik.grade * 0.80) + (this.fizik.sozlu * 0.20)) +
                ((this.kimya.grade * 0.80) + (this.kimya.sozlu * 0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printGrade() {
        System.out.println("\n----------------\n");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik notu: " + this.mat.grade);
        System.out.println("Fizik notu: " + this.fizik.grade);
        System.out.println("Kimya notu: " + this.kimya.grade);
        System.out.println("Matematik sözlü notu: " + this.mat.sozlu);
        System.out.println("Fizik sözlü notu: " + this.fizik.sozlu);
        System.out.println("Kimya sözlü notu: " + this.kimya.sozlu);
    }
}
public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course matSozlu = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course fizikSozlu = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course kimyaSozlu = new Course("Kimya", "KMY101", "KMY");


        Teacher t1 = new Teacher("Mahmut Hoca", "905000001000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "905000002000", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "905000003000", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("derra", "1447952", 2, mat, fizik, kimya, matSozlu, fizikSozlu, kimyaSozlu);
        s1.addBulkExamNote(100, 100, 100);
        s1.addSozluNote(100,100,100);
        s1.isPass();

        Student s2 = new Student("fato", "5684512", 3, mat, fizik, kimya, matSozlu, fizikSozlu, kimyaSozlu);
        s2.addBulkExamNote(20, 56, 87);
        s2.addSozluNote(23,56,86);
        s2.isPass();

        Student s3 = new Student("icloş", "2369874", 4, mat, fizik, kimya, matSozlu, fizikSozlu, kimyaSozlu);
        s3.addBulkExamNote(45, 98, 67);
        s3.addSozluNote(86,64,85);
        s3.isPass();
    }
}
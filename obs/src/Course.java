public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int grade;
    int sozlu;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int grade = 0;
        int sozlu = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem başarılı!");
        } else {
            System.out.println(teacher.name + " akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin akademisyeni: " + teacher.name);
        }
    }
}
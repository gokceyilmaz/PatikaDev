public class ogrenciBilgiSistemi {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FIZIK101","FZK");
        Course elektrik = new Course("Elektrik","ELKTRK101","ELKTRK");

        Teacher teach1 =new Teacher("Ayse Hoca","9005005005000","MAT");
        Teacher teach2 =new Teacher("Mahmut Hoca","9005005005001","FZK");
        Teacher teach3 =new Teacher("Ali Hoca","9005005005002","ELKTRK");

        mat.addTeacher(teach1);
        fizik.addTeacher(teach2);
        elektrik.addTeacher(teach3);
        mat.printTeacher();
        fizik.printTeacher();
        elektrik.printTeacher();

        Student s1 = new Student("İnek Şaban","171220100",3,mat,fizik,elektrik);
        s1.addBulkVerbalNote(50,70,80);
        s1.addBulkExamNote(50,70,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","171220101",3,mat,fizik,elektrik);
        s2.addBulkVerbalNote(100,100,100);
        s2.addBulkExamNote(100,90,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail","171220102",3,mat,fizik,elektrik);
        s3.addBulkVerbalNote(55,95,70);
        s3.addBulkExamNote(70,20,95);
        s3.isPass();
    }
}

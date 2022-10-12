public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double generalAverage;
    double oralExamAverage;
    double writtenExamAverage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkOralExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.oralExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralExamNote = kimya;
        }

    }

    public void addBulkWrittenExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.writtenExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.writtenExamNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.writtenExamNote = kimya;
        }

    }
    public void isPass() {

        if (this.mat.oralExamNote == 0 || this.fizik.oralExamNote == 0 || this.kimya.oralExamNote == 0 || this.mat.writtenExamNote == 0 || this.fizik.writtenExamNote == 0 || this.kimya.writtenExamNote == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
            } else {
                this.isPass = isCheckPass();
                printNote();
                System.out.println("Ortalama : " + this.generalAverage);
                if (this.isPass) {
                    System.out.println("Sınıfı Geçti. ");
                } else {
                    System.out.println("Sınıfta Kaldı.");
                }
            }
        }

        public void calcAverage () {
            this.oralExamAverage = (this.fizik.oralExamNote + this.kimya.oralExamNote + this.mat.oralExamNote) / 3.0;
            this.writtenExamAverage = (this.fizik.writtenExamNote + this.kimya.writtenExamNote + this.mat.writtenExamNote) / 3.0;
            this.generalAverage = (oralExamAverage * 0.20) + (writtenExamAverage * 0.80);
        }

        public boolean isCheckPass () {
            calcAverage();
            return this.generalAverage > 55;
        }

        public void printNote () {
            System.out.println("=========================");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Matematik Notu : " + ((this.mat.oralExamNote*0.20)+(this.mat.writtenExamNote*0.80)));
            System.out.println("Fizik Notu : " + ((this.fizik.oralExamNote*0.20)+(this.fizik.writtenExamNote*0.80)));
            System.out.println("Kimya Notu : " + ((this.kimya.oralExamNote*0.20)+(this.kimya.writtenExamNote*0.80)));
        }

    }

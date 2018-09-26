package week2.task3;

public class Task3 {
    class CongNhan {
        private
        String name, sex;
        int age, luong;


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {

            return name;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {

            return sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {

            return age;
        }

        public void setLuong(int luong) {
            this.luong = luong;
        }

        public int getLuong() {

            return luong;
        }

        public void checkSex() {
            if (sex.equals("Male")) {
                System.out.println("Day la nam");
            } else if (sex.equals("Female")) {
                System.out.println("Day la nu");
            }

        }

        public void ThuNhap() {
            if (this.luong > 100000000) {
                System.out.println("Cong nhan co thu nhap cao vcl");
            } else if (10000000 < this.luong && this.luong < 100000000) {
                System.out.println("Cong nhan co thu nhap trung binh");
            } else System.out.println("Cong nhan co thu nhap thap");
        }

        public void KiemTraTuoi() {
            if (this.age > 60) System.out.println("Cong nhan sap nghi huu ");
            if (this.age > 18 && this.age < 60) System.out.println("Cong nhan o do tuoi lao dong");
            else System.out.println("Chua du tuoi lao dong");
        }


    }

    class Students {
        private
        String name, sex, group;
        int rank;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getGroup() {
            return group;
        }

        public void Nhom() {
            if (group.equals("nhom hoc C++")) System.out.println("day la nhom hoc C++");
            else System.out.println("day la nhom hoc java");
        }

        public void XepHang() {
            if (rank < 10) System.out.println("Master");
            else if (rank > 10 && rank < 20) System.out.println("Co trinh do cao");
            else System.out.println("Co trinh do thap");
        }

    }


    class tamgiac {
        private
        double a, b, c;

        public tamgiac(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getA() {
            return a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getB() {
            return b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double getC() {
            return c;
        }

        public void KiemTraDacBiet() {
            if (a == b & b == c) System.out.println("tam giac deu");
            else if (a == b && b == c && c == a) System.out.println("tam giac can");
        }

        public void tamgiacvuong() {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                System.out.println("tam giac vuong");
            else System.out.println("tam giac khong vuong");
        }

        public double chuvi() {
            return a + b + c;
        }

    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

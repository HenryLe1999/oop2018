package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        // array = new int[100];
        //int min=1000000;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int tg = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tg;
                }
            }
        }

        return array[0];
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double cs = weight/(height*height);
        if(cs < 18.5)
            return "Thiếu cân";
        else if(cs >= 18.5 && cs<=22.99)
            return "Bình thường";
        else if(cs >=23 && cs<=24.99)
            return "Thừa cân";
        return "Béo phì";
    }

}

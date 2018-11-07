package week9;

import java.io.*;
import java.nio.channels.Channel;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path){
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writeContentToFile(String path){
        String in ="";
        System.out.println("Nhap xau can them vao :");
        Scanner sc = new Scanner(System.in);
        in = sc.nextLine();
        //xoa du lieu trong file
        try {
            //xoa file
            File file1 = new File(path);// File được tạo ra tại ổ đĩa D
            if(file1.exists()){
                file1.delete();
            }
            //tao file moi
            String in1 = "C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018\\nhan1.txt";
            File file = new File(in1);
            if (file.createNewFile()){
                System.out.println("File tạo thành công!");
            } else {
                System.out.println("File đã tồn tại.");
            }
            FileWriter fw = new FileWriter(file);
            fw.write(in);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace(); // In ra lỗi
        }

    }
    public static void Themvaocuoi(String path){
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            String in ="";
            System.out.println("Nhap xau can them vao :");
            Scanner sc = new Scanner(System.in);
            in = sc.nextLine();

            File file = new File(path);

            // kiểm tra nếu file chưa có thì tạo file mới
            if (!file.exists()) {
                file.createNewFile();
            }
            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(in);
            System.out.println("Xong");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static File findFileByName(String folderPath, String fileName){

        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(),fileName);
                }
            }
        } else {
            System.out.println("folderPath không tồn tại");
        }

        return null;
    }
}

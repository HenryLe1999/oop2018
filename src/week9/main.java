package week9;

public class main {
    public static void main(String [] args){
        String in = "C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018\\nhan.txt";
        String in1 = "C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018\\nhan1.txt";
        String in2 = "C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018\\nhan2.txt";
        String in3 = "C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018\\nhan3.txt";
        System.out.println("cau a : ");
        Utils.readContentFromFile(in);
        System.out.println("cau b : ");
        Utils.writeContentToFile(in1);
        System.out.println("cau c");
        Utils.Themvaocuoi(in2);
        System.out.println("cau d");
        Utils.findFileByName("C:\\Users\\levan.WIN10_SL\\IdeaProjects\\oop20182112018", "nhan2.txt");

    }
}

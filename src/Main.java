import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Nhập vào chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();

        for (int i =  inputString.length() -1 ;i >=0;i--){
            queue.add(inputString.charAt(i));
        }
        String reverString = "";
        while (!queue.isEmpty()){
            reverString = reverString+queue.remove();
        }
        if (inputString.equals(reverString)){
            System.out.println("Đây là chuỗi đối xứng");
        }else {
            System.out.println("Đây không phải là chuỗi đối xứng");
        }
    }
}

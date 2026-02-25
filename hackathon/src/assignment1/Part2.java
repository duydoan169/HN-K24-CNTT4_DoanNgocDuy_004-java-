package assignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        String fullname = "";
        String shortenedName = "";
        String name = "";
        Pattern p = Pattern.compile("[A-Za-z]+");
        Matcher m = p.matcher(input);

        while (m.find()){
            fullname += Character.toUpperCase(m.group().charAt(0)) + m.group().substring(1).toLowerCase() + " ";
            if (shortenedName.length() == 2){
                name = Character.toUpperCase(m.group().charAt(0)) + m.group().substring(1).toLowerCase();
            }else {
                shortenedName += Character.toUpperCase(m.group().charAt(0));
            }
        }
        String username = name + shortenedName;

        System.out.printf("Tên chuẩn: %s\n", fullname.substring(0, fullname.length() - 1));
        System.out.printf("Username: %s\n", username);
    }
}

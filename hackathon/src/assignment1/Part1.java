package assignment1;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        int vowelNum = 0;
        int consonantNum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                char lowerCaseC = Character.toLowerCase(c);
                if(lowerCaseC == 'a' || lowerCaseC == 'i' || lowerCaseC == 'u'
                    || lowerCaseC == 'e' || lowerCaseC == 'o'){
                    vowelNum++;
                }else {
                    consonantNum++;
                }
            }
        }

        if (vowelNum > consonantNum){
            System.out.printf("Nguyên âm nhiều hơn (Nguyên âm: %d, Phụ âm: %d)", vowelNum, consonantNum);
        }else if (vowelNum < consonantNum){
            System.out.printf("Phụ âm nhiều hơn (Nguyên âm: %d, Phụ âm: %d)", vowelNum, consonantNum);
        }else {
            System.out.printf("Nguyên âm bằng phụ âm (Nguyên âm: %d, Phụ âm: %d)", vowelNum, consonantNum);
        }
    }
}

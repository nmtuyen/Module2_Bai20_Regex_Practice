package baitap_Check_PhoneNumber;

import java.util.Scanner;

public class Main {
    private static PhoneNumber phoneNumber = new PhoneNumber();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số điện thoại cần kiểm tra dạng: (xx)-(0xxxxxxxx)");
        System.out.println("Nhập số điện thoại muốn kiểm tra ");
        String phone = scanner.nextLine();
        boolean isvalid = phoneNumber.validate(phone);
        if (isvalid){
            System.out.println("Phone number: "+ phone+ " đúng định dạng");
        }else
            System.out.println("Phone number: "+ phone+ " không đúng định dạng");

    }
}

import javafx.scene.paint.PhongMaterial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();
        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Danh bạ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    phoneBookManager.displayInformation(phoneBooks);
                    break;
                case 2:
                    phoneBookManager.addInformation(phoneBooks);
                    break;
                case 3:
                    phoneBookManager.editProductByName(phoneBooks);
                    break;
                case 4:
                    phoneBookManager.deletePhoneBook(phoneBooks);
                    break;
                case 5:
                    phoneBookManager.searchPhoneBook(phoneBooks);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}

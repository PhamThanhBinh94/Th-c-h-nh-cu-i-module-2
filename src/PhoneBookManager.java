import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookManager {
    public void addInformation(ArrayList<PhoneBook> phoneBooks){
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        String number = scanner.nextLine();
        phoneBook.setNumberTelephone(number);
        System.out.println("Please enter the group");
        String  group = scanner.nextLine();
        phoneBook.setGroupPhoneBook(group);
        System.out.println("Please enter the name");
        String name = scanner.nextLine();
        phoneBook.setName(name);
        System.out.println("Please enter the gender");
        String gender = scanner.nextLine();
        phoneBook.setGender(gender);
        System.out.println("Please enter the address");
        String address = scanner.nextLine();
        phoneBook.setAddress(address);
        phoneBooks.add(phoneBook);
    }

    public void displayInformation(ArrayList<PhoneBook> phoneBooks){
        for (PhoneBook phoneBook: phoneBooks){
            System.out.println((phoneBook.getNumberTelephone()) + "," + phoneBook.getGroupPhoneBook()+ "," +phoneBook.getName()+ "," +phoneBook.getGender()+ "," + phoneBook.getAddress());
        }
    }

    public void editProductByName(ArrayList<PhoneBook> phoneBooks){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number that you want to search: ");
        String number = scanner.nextLine();;
        for (int i=0; i < phoneBooks.size(); i++){
            if (number.equals(phoneBooks.get(i).getNumberTelephone())){
                System.out.println("Please enter the number");
                String number1 = scanner.nextLine();
                phoneBooks.get(i).setNumberTelephone(number1);
                System.out.println("Please enter the group");
                String  group = scanner.nextLine();
                phoneBooks.get(i).setGroupPhoneBook(group);
                System.out.println("Please enter the name");
                String name = scanner.nextLine();
                phoneBooks.get(i).setName(name);
                System.out.println("Please enter the gender");
                String gender = scanner.nextLine();
                phoneBooks.get(i).setGender(gender);
                System.out.println("Please enter the address");
                String address = scanner.nextLine();
                phoneBooks.get(i).setAddress(address);
//                System.out.println(phoneBooks);
                break;
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
            }
        }

    }
    public void deletePhoneBook(ArrayList<PhoneBook> phoneBooks){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number that you want to delete: ");
        String number = scanner.nextLine();
        for (PhoneBook phoneBook: phoneBooks){
            if (phoneBook.getNumberTelephone().equals(number)){
                System.out.println("Bạn có muốn xóa danh bạ không ?");
                String enter = scanner.nextLine();
                if (enter==""){
                    System.exit(0);
                }
                if (enter == "Y") {
                    phoneBooks.remove(phoneBooks.indexOf(phoneBook));
                    System.out.println(phoneBook);
                }
                break;
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
            }
        }
    }
    public void searchPhoneBook(ArrayList<PhoneBook> phoneBooks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number that you want to search: ");
        String number = scanner.nextLine();
        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getNumberTelephone().equals(number)) {
                System.out.println(phoneBook);
            }
        }
    }
    public void writeProductList(ArrayList<PhoneBook> phoneBooks) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        try {
            readWriteFile.writeObjectFile("PhoneBook.txt",phoneBooks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<PhoneBook> readProductList(String path) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        ArrayList<PhoneBook> products = null;
        try {
            products = readWriteFile.readObjectFile(path);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}

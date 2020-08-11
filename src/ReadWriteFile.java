import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

class readWriteFile {
    ArrayList<PhoneBook> readObjectFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
        PhoneBook phoneBook;
        try
        {
            while ((phoneBook = (PhoneBook) objectInputStream.readObject()) == null)
            {
                phoneBooks.add(phoneBook);
            }
        } catch (EOFException ex){
        }
        return phoneBooks;
    }
    void writeObjectFile(String path, ArrayList<PhoneBook> phoneBooks) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (PhoneBook phoneBook: phoneBooks){
            objectOutputStream.writeObject(phoneBook);
        }
    }
}

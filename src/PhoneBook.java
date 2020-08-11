public class PhoneBook {
    private String numberTelephone;
    private String groupPhoneBook;
    private String name;
    private String gender;
    private String address;

    public PhoneBook() {
    }

    public PhoneBook(String numberTelephone, String groupPhoneBook, String name, String gender, String address) {
        this.numberTelephone = numberTelephone;
        this.groupPhoneBook = groupPhoneBook;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public String getGroupPhoneBook() {
        return groupPhoneBook;
    }

    public void setGroupPhoneBook(String groupPhoneBook) {
        this.groupPhoneBook = groupPhoneBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "numberTelephone=" + numberTelephone +
                ", groupPhoneBook='" + groupPhoneBook + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

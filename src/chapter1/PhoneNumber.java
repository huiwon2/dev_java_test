package chapter1;

public class PhoneNumber{
    public final String phoneNumber;

    public PhoneNumber(String rawPhoneNumber){
        this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phonenumber='" + phoneNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumber("010-1234-5678"));
        System.out.println(new PhoneNumber("010 1234 5678"));
        System.out.println(new PhoneNumber("01012345678"));
    }
}

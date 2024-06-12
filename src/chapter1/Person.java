/*package chapter1;

import java.util.ArrayList;
import java.util.List;

class Person<PhoneNumber> {

    public final String name;
    private final List<PhoneNumber> numbers;

    public Person(String name){
        this.name = name;
        numbers = new ArrayList<>();
    }

    public boolean addPhoneNumber(String phoneNumber){
        PhoneNumber phoneNum = new PhoneNumber(phoneNumber);
//        numbers.add(phoneNumber);
//        number가 전화번호 형식일 때 추가 + true
//        전화번호 형식 아닐 때  false
        for(Object c : numbers.toArray()){
            if(!Character.isDigit((Character) c)) return false;

            numbers.add(phoneNumber);
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
    public void main(String[] args) {
        Person person = new Person("홍길동");
        person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person.addPhoneNumber(new PhoneNumber("010 1234 5678"));
        person.addPhoneNumber(new PhoneNumber("01012345678"));
        System.out.println(person);
    }


}

*/
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Phonebook1 phone=new Phonebook1();
        phone.phonebook.add(phone.nameList);
        phone.phonebook.add(phone.numList);

        //Adding

        phone.add("luka","78945");

        System.out.println(phone.phonebook);
        phone.search("luka");

        System.out.println(phone.phonebook);

        // e1(lastname: aca); e2(lastname: coa); e3(lastname: aleksa); e4(stefan);

        PhoneBook phoneBook = new PhoneBook();

        Entry e1 = new Entry("aca", "122");
        Entry e2 = new Entry("coa", "455");
        Entry e3 = new Entry("aleksa", "787");
        Entry e4 = new Entry("stefan", "101");

        phoneBook.insert(e1);
        phoneBook.insert(e2);
        phoneBook.insert(e3);
        phoneBook.insert(e4);

        phoneBook.printAll(); //Showing of lastnames sorted inside of section
        // phoneBook.printAllSectionLetters(); // Section only for letters


        Entry e5 = new Entry("Puvaca", "111");
        Entry e6 = new Entry("Andrijevic", "222");
        Entry e7 = new Entry("Milosevic", "333");
        Entry e8 = new Entry("Topic", "444");

        phoneBook.insert(e5);
        phoneBook.insert(e6);
        phoneBook.insert(e7);
        phoneBook.insert(e8);

        phoneBook.printAllSectionLetters(); 
    }
}


//Input:  insert(e1); insert(e2); insert(e3); insert(e4);
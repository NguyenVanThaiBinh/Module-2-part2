package ContactManage.dal;

import ContactManage.model.ContactObject;

import java.io.*;
import java.util.LinkedList;

public class ContactDataBase {
    static LinkedList<ContactObject> objectLinkedList = new LinkedList<>();

    public void saveFileContact() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ContactFile.csv"));

        String header = "STT, Name, Telephone, Group, Gender, Address, DayOfBirth, Email \n";
        bufferedWriter.write(header);

        for (ContactObject contact : objectLinkedList) {
            String line = contact.toCSVFormat();
            bufferedWriter.write(line);
        }
        bufferedWriter.close();
    }

    public void readFileContact() throws IOException {
        LinkedList<ContactObject> printFile = new LinkedList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("ContactFile.csv"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split(", ");
            if (str[0].equals("STT")) {
                continue;
            }
            ContactObject contactObject = new ContactObject(str[2].trim(), Integer.parseInt(str[3].trim()),
                    str[4].trim(), str[5].trim(), str[6].trim(), str[7].trim(), str[8].trim());
            printFile.add(contactObject);

        }
        for (ContactObject contact : printFile) {
            System.out.println(contact.toString());
        }
        bufferedReader.close();
    }
}

package ContactManage.model;

public class ContactObject {
    private int telephone, stt;
    private String contactGroup;
    private String name;
    private String gender;
    private String address;
    private String dayOfBirth;
    private String email;

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toCSVFormat() {
        return stt + ", " + name + ", " + telephone + ", "
                + contactGroup + ", " + gender + ", "
                + address + ", " + dayOfBirth + ", "
                + email + "\n";
    }

    @Override
    public String toString() {
        return "ContactObject{" +
                "telephone=" + telephone +
                ", contactGroup='" + contactGroup + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public ContactObject(String name, int telephone, String contactGroup,
                         String gender, String address, String dayOfBirth, String email) {

        this.telephone = telephone;
        this.contactGroup = contactGroup;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
    }
    public void addContact(){

    }


}

package class02.dto;

import java.time.LocalDate;

public class DataTransferObject01 {

    private String id;
    private String password;
    private String name;
    private int age;
    private LocalDate birthday;
    private String address;
    private String phone;

    public DataTransferObject01() {

    }

    public DataTransferObject01(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public DataTransferObject01(String id, String password, String name, int age, LocalDate birthday, String address, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
    }
}

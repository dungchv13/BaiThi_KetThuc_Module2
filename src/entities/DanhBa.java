package entities;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private String phone;
    private String name;
    private String gender;
    private String address;

    public DanhBa() {
    }

    public DanhBa(String phone, String name, String gender, String address) {
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "Information{" +
                "phone: '" + phone + '\'' +
                ", name: '" + name + '\'' +
                ", gender: '" + gender + '\'' +
                ", address: '" + address + '\'' +
                '}';
    }
}

package com.selectos.temas.recycledcontacts;

public class Contact {

    private String name;
    private String phone;
    private String email;
    private int idPhoto;

    public Contact(String name, String phone, String email, int idPhoto) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idPhoto = idPhoto;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

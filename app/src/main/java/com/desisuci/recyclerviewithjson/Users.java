package com.desisuci.recyclerviewithjson;

public class Users {
    private String id;
    private String nama;
    private String email;

    public Users(String id, String nama, String email) {
        this.id = id;
        this.nama = nama;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
}

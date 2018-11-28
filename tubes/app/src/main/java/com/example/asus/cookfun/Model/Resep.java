package com.example.asus.cookfun.Model;

public class Resep {
    String fotoUser,namaUser,fotoResep,judulResep,deskripsiResep,waktuResep;

    public Resep(String fotoUser, String namaUser, String fotoResep, String judulResep, String deskripsiResep, String waktuResep) {
        this.fotoUser = fotoUser;
        this.namaUser = namaUser;
        this.fotoResep = fotoResep;
        this.judulResep = judulResep;
        this.deskripsiResep = deskripsiResep;
        this.waktuResep = waktuResep;
    }

    public String getFotoUser() {
        return fotoUser;
    }

    public void setFotoUser(String fotoUser) {
        this.fotoUser = fotoUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getFotoResep() {
        return fotoResep;
    }

    public void setFotoResep(String fotoResep) {
        this.fotoResep = fotoResep;
    }

    public String getJudulResep() {
        return judulResep;
    }

    public void setJudulResep(String judulResep) {
        this.judulResep = judulResep;
    }

    public String getDeskripsiResep() {
        return deskripsiResep;
    }

    public void setDeskripsiResep(String deskripsiResep) {
        this.deskripsiResep = deskripsiResep;
    }

    public String getWaktuResep() {
        return waktuResep;
    }

    public void setWaktuResep(String waktuResep) {
        this.waktuResep = waktuResep;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.pertemuan10;





public class Mahasiswa {

    private String NIM, Nama, Alamat, matakuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5;

    public Mahasiswa(String NIM, String Nama, String Alamat, String matakuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.matakuliah = matakuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }

    public double getNilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String Matakuliah() {
        return matakuliah;
    }
}

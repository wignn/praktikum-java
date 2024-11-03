/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.pertemuan10;

import com.mycompany.mavenproject2.pertemuan10.Mahasiswa;
import java.util.ArrayList;

public class InputDataMahasiswa {

    ArrayList<Mahasiswa> listmahasiswa;

    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList();
    }

    public void insertData(String NIM, String Nama, String Alamat, String matakuliah,
            double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, matakuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listmahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listmahasiswa;
    }

    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}

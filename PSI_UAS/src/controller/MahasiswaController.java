/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import utilities.DatabaseUtilities;
import pojo.Mahasiswa;
import view.MahasiswaFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author itsproinc
 */
public class MahasiswaController {
    private MahasiswaFrame mahasiswaFrame;
    private Mahasiswa mahasiswa;
    Connection conn = DatabaseUtilities.getConnection();
    
    public MahasiswaController(MahasiswaFrame mahasiswaFrame, Mahasiswa mahasiswa) {
        this.mahasiswaFrame = mahasiswaFrame;
        this.mahasiswa = mahasiswa;
    }
    
     public List<Mahasiswa> loadMahasiswas() throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery("SELECT * FROM mahasiswa");

        while(rs.next()){
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNrp(rs.getString("nrp"));
            mhs.setNama(rs.getString("nama"));
            mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
            mhsList.add(mhs);
        }
        
        return mhsList;
    }

    public boolean simpanMahasiswa() throws SQLException {
        Statement statement = conn.createStatement();
        String s = "INSERT INTO mahasiswa (nrp, nama, jenis_kelamin) VALUES ('" + mahasiswa.getNrp() + "', '" + mahasiswa.getNama() + "', '" + mahasiswa.getJenisKelamin()+ "')";
        statement.executeUpdate(s);
        System.out.println("Insert sukses!");
        
        return true;
    }
}

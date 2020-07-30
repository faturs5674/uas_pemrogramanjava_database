/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_faturrahman_1855201018;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cyber Play
 */
public class insert {
     koneksi konek = new koneksi();

    public void insert(int nomorbarang, String namabarang ,int stokbarang,String jenisbarang ,int hargabarang) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "insert into datatoko values('" + nomorbarang + "','" + namabarang + "','"+stokbarang + "','"  + jenisbarang  + "','" + hargabarang + "');";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_faturrahman_1855201018;

import javax.swing.JOptionPane;

/**
 *
 * @author Cyber Play
 */
public class update {

    koneksi konek = new koneksi();

    public void update(int nomorbarang, String namabarang, int stokbarang, String jenisbarang, int hargabarang) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_namabr = "update datatoko set namabarang = '" + namabarang + "'where nomorbarang = '" + nomorbarang + "'";
            String sql_stbr = "update datatoko set stokbarang = '" + stokbarang + "'where nomorbarang = '" + nomorbarang + "'";
            String sql_jnsbr = "update datatoko set jenisbarang = '" + jenisbarang + "'where nomorbarang = '" + nomorbarang + "'";
            String sql_hrbr = "update datatoko set hargabarang = '" + hargabarang + "'where nomorbarang = '" + nomorbarang + "'";
            String sql_nobr = "update datatoko set nomorbarang = '" + nomorbarang + "'where namabarang = '" + namabarang + "'";
            String sql_nobr1 = "update datatoko set nomorbarang = '" + nomorbarang + "'where jenisbarang = '" + jenisbarang + "'";

            statement.executeUpdate(sql_namabr);
            statement.executeUpdate(sql_stbr);
            statement.executeUpdate(sql_jnsbr);
            statement.executeUpdate(sql_hrbr);
            statement.executeUpdate(sql_nobr);
//            statement.executeUpdate(sql_nobr1);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

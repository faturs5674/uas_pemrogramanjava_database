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
public class updatestok {
    koneksi konek = new koneksi();
    public void update(int nomorbarang, int stokbarang ) {

        try {
            konek.koneksi();
            try (java.sql.Statement statement = konek.con.createStatement()) {
                String sql_stok = "update datatoko set stokbarang = '" + stokbarang + "'where nomorbarang = '" + nomorbarang + "'";

                
                statement.executeUpdate(sql_stok);

            }

//            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

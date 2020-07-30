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
public class delete {
     koneksi konek = new koneksi();

    public void delete(int nomorbarang) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "delete from datatoko where nomorbarang = '" + nomorbarang + "'" ;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

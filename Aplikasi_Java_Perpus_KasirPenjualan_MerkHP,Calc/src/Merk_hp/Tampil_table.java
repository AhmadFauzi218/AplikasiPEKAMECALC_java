/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merk_hp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Tampil_table {
    private DefaultTableModel tabel = new DefaultTableModel();
    public Tampil_table(){
        
        getTabel().addColumn("No");
        getTabel().addColumn("Tipe Handphone");
        getTabel().addColumn("Harga Satuan");
       
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
}

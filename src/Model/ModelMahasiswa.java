/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fataelislami
 */
public class ModelMahasiswa {
    String nim,nama;
    
    public ModelMahasiswa(String nim,String nama){
        this.nim=nim;
        this.nama=nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
    
}

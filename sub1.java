/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.rpl;

/**
 *
 * @author yusri
 */
public class sub1 {
    private String merk;
    private String jenis;
    private String warna;
    private String Kategori;
    
   public sub1(String Kategori,String Jenis,String warna,String merk){
       this.merk=merk;
       this.jenis=jenis;
       this.warna=warna;
       this.Kategori=Kategori;
       
       
       System.out.println("Kategori Sepatu:"+Kategori);
       System.out.println("Jenis Sepatu:"+Jenis);
       System.out.println("Merk Sepatu:"+merk);
       System.out.println("Warna Sepatu:"+warna);
   } 
    } 


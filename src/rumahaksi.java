/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eddy
 */
public class rumahaksi {
    public static void main(String[] args) {     
       Rumah Rumahku = new Rumah();
       Rumah Rumahogib = new Rumah();
       Rumah Rumahfathur = new Rumah();
       
       Rumahku.Jumlahpintu = "2";
       Rumahku.Jumlahjendela = "3";
       Rumahku.Jumlahkamar = "4";
       Rumahku.Warnarumah = "kuning";
       Rumahku.Tiperumah = "45";
       
       Rumahogib.Jumlahpintu = "5";
       Rumahogib.Jumlahjendela = "8";
       Rumahogib.Jumlahkamar = "5";
       Rumahogib.Warnarumah = "putih";
       Rumahogib.Tiperumah = "90";
               
       Rumahfathur.Jumlahpintu = "5";
       Rumahfathur.Jumlahjendela = "5";
       Rumahfathur.Jumlahkamar = "6";
       Rumahfathur.Warnarumah = "abu-abu";
       Rumahfathur.Tiperumah = "60";
               
     Rumahku.inforumah();
     Rumahogib.inforumah();
     Rumahfathur.inforumah();
     
    }
}

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.DateFormat; 
import java.util.Date;   
  

class Proses extends Pln{
    	Scanner input = new Scanner(System.in);
	
private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
	
public void input(){
		System.out.print("Nama: ");
		nama = input.nextLine();
		System.out.print("Alamat: ");
		alamat = input.nextLine();
		
}
public void proses()
	{
		
		boolean loop=true;
		
		while(loop){
		System.out.print("Tipe(36/37): ");
		tipe = input.nextInt();
		
		
		if(tipe == 36){
	
		while(loop){
			System.out.print("Blok(A/B): ");
			blok = input.next().charAt(0);
			
		switch(blok){
			case 'A':
			 
			 harga = 500000;
			 System.out.println("Tagihan: "+ harga);
			 loop=false;
		
			 
			break;
			
			case 'B' :
			
			harga = 300000;
			System.out.println("Tagihan: "+ harga);
		    loop=false;
			
			break;
			
			case 'a':
			 
			 harga = 500000;
			 System.out.println("Tagihan: "+ harga);
			 loop=false;
		
			 
			break;
			
			case 'b' :
			
			harga = 300000;
			System.out.println("Tagihan: "+ harga);
		    loop=false;
			
			break;			
				
			default:
			System.out.println("Blok tidak ditemukan, mohon ulangi");
			break;
			
			 
		}
	}
		
		
}			else if(tipe == 37){
			while(loop){
			
			System.out.print("Masukkan blok(A/B) : ");
			blok = input.next().charAt(0);
			
			
			switch(blok){
			case 'A':
			 
			harga = 800000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		    loop=false;
			 
			break;
			
			case 'B' :
			
			harga = 600000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		
			loop=false;
			break;
			

			case 'a':
			 
			harga = 800000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		    loop=false;
			 
			break;
			
			case 'b' :
			
			harga = 600000;
			System.out.println("Harga yang harus dibayar : "+ harga);
		
			loop=false;
			break;
						
			default:
			System.out.println("Blok tidak ditemukan, mohon ulangi");
			break;
			
		}
	}
			
}
		else{
			System.out.println("Tipe tidak ditemukan, mohon ulangi");
		}
	}		
	
}

public void pembayaran(){
    	
    	
    	System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<harga){
			
			if(bayar<harga){
				System.out.println("Nominal Uang Kurang, Mohon cek kembali");
				
	            System.out.print("Bayar: "+"Rp.");
		        bayar= input.nextInt();
			
				}else{
					System.out.print("Bayar: "+"Rp.");
		        bayar= input.nextInt();
				}
	
		
		}
    	
}

public void cetak(){
		System.out.println("");
		System.out.println("		FORM PEMBAYARAN");
		System.out.println("Tanggal : "+getTanggal()+"  "+" Waktu sekarang : "+getWaktu());
		System.out.println("Nama pelanggan           : "+ nama);
		System.out.println("Alamat pelanggan         : "+ alamat);
		System.out.println("Nominal			         : "+"Rp."+ harga);
		System.out.println("Jumlah bayar 	    	 : "+"Rp."+ bayar);
		System.out.println("Kembaliaan               : "+"Rp."+ (bayar-harga));
		
		
	}
  
	
}

public class Motor extends Kendaraan {
	public void bahanbakar() {
	System.out.println("Motor bahan bakar Bensin Premium");
	}  
	
	public static void main(String args[]){  
	Kendaraan ken = new Kendaraan();
    Kendaraan a = new Truk();
	Kendaraan b = new Motor();
	ken.bahanbakar();
    a.bahanbakar();  
	b.bahanbakar();
  }  
} 
 
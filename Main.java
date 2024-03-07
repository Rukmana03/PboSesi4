   public class Main {
        public static void main(String[] args) {
            // Membuat objek segitiga
            SegitigaSiku segitigaSiku = new SegitigaSiku(3, 4);
            SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(5, 6);
            SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(7);
            SegitigaSembarang segitigaSembarang = new SegitigaSembarang(3, 4, 5);
    
            // Mencetak luas dan keliling segitiga
            System.out.println("Segitiga Siku-siku:");
            System.out.println("Luas: " + segitigaSiku.luas());
            System.out.println("Keliling: " + segitigaSiku.keliling());
            System.out.println();
    
            System.out.println("Segitiga Sama Kaki:");
            System.out.println("Luas: " + segitigaSamaKaki.luas());
            System.out.println("Keliling: " + segitigaSamaKaki.keliling());
            System.out.println();
    
            System.out.println("Segitiga Sama Sisi:");
            System.out.println("Luas: " + segitigaSamaSisi.luas());
            System.out.println("Keliling: " + segitigaSamaSisi.keliling());
            System.out.println();
    
            System.out.println("Segitiga Sembarang:");
            System.out.println("Luas: " + segitigaSembarang.luas());
            System.out.println("Keliling: " + segitigaSembarang.keliling());
            System.out.println();
    
            // Membuat objek persegi
            Persegi persegi = new Persegi(4);
    
            // Mencetak luas dan keliling persegi
            System.out.println("Persegi:");
            System.out.println("Luas: " + persegi.luas());
            System.out.println("Keliling: " + persegi.keliling());
            System.out.println();
    
            // Membuat objek lingkaran
            Lingkaran lingkaran = new Lingkaran(5);
    
            // Mencetak luas dan keliling lingkaran
            System.out.println("Lingkaran:");
            System.out.println("Luas: " + lingkaran.luas());
            System.out.println("Keliling: " + lingkaran.keliling());
        }
    }
    


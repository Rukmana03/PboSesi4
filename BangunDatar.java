import java.lang.Math;

class BangunDatar {
    // Metode untuk menghitung luas
    public double luas() {
        return 0.0;
    }
    
    // Metode untuk menghitung keliling
    public double keliling() {
        return 0.0;
    }
}

class Segitiga extends BangunDatar {
    protected double a, b, c; // Panjang sisi-sisi segitiga
    
    // Konstruktor untuk segitiga dengan sisi-sisi a, b, c
    public Segitiga(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Menghitung keliling segitiga
    @Override
    public double keliling() {
        return a + b + c;
    }
    
    // Menghitung luas segitiga menggunakan rumus Heron
    @Override
    public double luas() {
        double s = keliling() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class SegitigaSiku extends Segitiga {
    // Konstruktor untuk segitiga siku-siku dengan alas dan tinggi
    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
    }
}

class SegitigaSamaKaki extends Segitiga {
    // Konstruktor untuk segitiga sama kaki dengan alas dan tinggi
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + (tinggi / 2) * (tinggi / 2)));
    }
}

class SegitigaSamaSisi extends Segitiga {
    // Konstruktor untuk segitiga sama sisi dengan panjang sisi
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }
}

class SegitigaSembarang extends Segitiga {
    // Konstruktor untuk segitiga sembarang dengan panjang sisi-sisi
    public SegitigaSembarang(double a, double b, double c) {
        super(a, b, c);
    }
}

class Persegi extends BangunDatar {
    protected double sisi; // Panjang sisi persegi
    
    // Konstruktor untuk persegi dengan panjang sisi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    // Menghitung luas persegi
    @Override
    public double luas() {
        return sisi * sisi;
    }
    
    // Menghitung keliling persegi
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    protected double radius; // Jari-jari lingkaran
    
    // Konstruktor untuk lingkaran dengan jari-jari
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    // Menghitung luas lingkaran
    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }
    
    // Menghitung keliling lingkaran
    @Override
    public double keliling() {
        return 2 * Math.PI * radius;
    }
}

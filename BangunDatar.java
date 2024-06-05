package week9;

public class BangunDatar 
{

    private int panjang;
    private int lebar;
    private int sisi;
    private double alas;
    private double tinggi;
    private double radius;
    private static final double pi = 3.14;

    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double alas, double tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public BangunDatar(double radius)
    {
        this.radius = radius;
    }

    public int luas(int a)
    {
        return a*a;
    }

    public int luas(int a, int b)
    {
        return a*b;
    }

    public double luas(double a)
    {
        return pi*a*a;
    }

    public double luas(double a, double b)
    {
        return (a*b)/2;
    }

    public int keliling(int a)
    {
        return 4*a;
    }

    public int keliling(int a, int b)
    {
        return (2*a)+(2*b);
    }

    public double keliling(double a)
    {
        return pi*2*a;
    }

    public int getSisi()
    {
        return sisi;
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getPi()
    {
        return pi;
    }

}
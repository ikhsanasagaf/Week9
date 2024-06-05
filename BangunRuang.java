package week9;

public class BangunRuang extends BangunDatar 
{
    private int tinggi;
    private double tinggiTab;

    public BangunRuang(int panjang, int lebar, int tinggi)
    {
        super(panjang,lebar);
        this.tinggi = tinggi;
    }

    public BangunRuang(int sisi)
    {
        super(sisi);
    }

    public BangunRuang(double radius, double tinggiTab)
    {
        super(radius);
        this.tinggiTab = tinggiTab;
    }

    public int volume()
    {
        return super.getSisi()*super.getSisi()*super.getSisi();
    }

    public int volume(int tinggi)
    {
        return super.getPanjang()*super.getLebar()*tinggi;
    }

    public double volume(double tinggiTab)
    {
        return super.getPi()*super.getRadius()*super.getRadius()*tinggiTab;
    }
}
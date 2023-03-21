package Bailab6.Cau2;
import java.util.Scanner;

public class HocSinh {
    public String hoten;
    public String lop;
    private float toan;
    private float ly;
    private float hoa;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    public double diemtrungbinh(){
        return (this.getHoa()+this.getLy()+this.getToan())/3;
    }
    public void nhap(){
        System.out.print("Nhap ho va ten: ");
        Scanner sc=new Scanner(System.in);
        hoten= sc.nextLine();
        System.out.print("Nhap lop: ");
        lop= sc.nextLine();
        System.out.print("Nhap diem toan: ");
        toan=sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        hoa=sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        ly=sc.nextFloat();
    }
    public void xuatthongtin(){
        System.out.println("Ho ten:"+this.getHoten()+", Lop:"+this.getLop()+",DiemTb:"+this.diemtrungbinh()+"");
    }
}
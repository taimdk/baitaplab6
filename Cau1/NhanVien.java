package Cau1;

public class NhanVien {
    public String ten;
    public double luong;
    public NhanVien(){
        
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public NhanVien(String ten){
        this.ten=ten;
    }
    public String loainhanvien(){
        return "loainhanvien";
    }
    public void tinhluong(){
        
    }
    public void xuatthongtin(){
        
    }
}
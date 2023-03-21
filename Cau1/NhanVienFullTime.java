package Cau1;

public class NhanVienFullTime extends NhanVien {
    private int loaichucvu;
    private int  ngaylamthem;
    public NhanVienFullTime(){
        
    }
    public NhanVienFullTime(String ten, int ngaylamthem, int loaichucvu){
        super();
    }
    
    public int getLoaichucvu() {
        return loaichucvu;
    }

    public void setLoaichucvu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }

    public int getNgaylamthem() {
        return ngaylamthem;
    }

    public void setNgaylamthem(int ngaylamthem) {
        this.ngaylamthem = ngaylamthem;
    }
    
    @Override
    public String loainhanvien(){
        return "NhanVienFullTime";
    }
    @Override
    public void tinhluong(){
        System.out.println("Luong nhan vien full time 41tr/thang");
    }
}
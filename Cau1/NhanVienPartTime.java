package Cau1;


public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    public NhanVienPartTime(){
        
    }
     public NhanVienPartTime (String ten, int ngaylamthem, int loaichucvu){
        super();
    }

    public int getGiolamviec() {
        return giolamviec;
    }

    public void setGiolamviec(int giolamviec) {
        this.giolamviec = giolamviec;
    }
     
    @Override
    public String loainhanvien(){
        return "NhanVienPartTime";
    }
    @Override
    public void tinhluong(){
        System.out.println("Luong nhan vien part time 35ngan/gio.");
    }
}
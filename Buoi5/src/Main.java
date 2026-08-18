import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sinhvien> danhSach = new ArrayList<>();
        danhSach.add(new Sinhvien("001", "An", 7.3, 5.0, 6.5));
        danhSach.add(new Sinhvien("002", "Bình", 8.2, 9.1, 5.0));
        danhSach.add(new Sinhvien("003", "Hoa", 8.0, 7.2, 6.5));
        danhSach.add(new Sinhvien("004", "Cường", 6.9, 5.3, 7.5));
        danhSach.add(new Sinhvien("005", "Lan", 8.5, 6.5, 5.5));
        System.out.println(danhSach);
        System.out.println("danh sách sinh viên");
        for (Sinhvien sv : danhSach) {
            sv.inThongTin();
        }
        Sinhvien svDiemCaoNhat = danhSach.get(0);
        for (Sinhvien sv : danhSach) {
            if (sv.tinhDiemTrungBinh()> svDiemCaoNhat.tinhDiemTrungBinh()) {
                svDiemCaoNhat =sv;
            }
        }
        System.out.println("sinh viên có điểm cao nhất là");
    }
}
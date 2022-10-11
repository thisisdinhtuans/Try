/*
DANH SÁCH MẶT HÀNG

Bài làm tốt nhất
Bài toán quản lý danh sách mặt hàng trong đó mỗi mặt hàng sẽ có các thông tin:

Mã mặt hàng: tự động tăng, tính từ MH001
Tên mặt hàng: xâu ký tự độ dài không quá 100
Đơn vị tính: xâu ký tự độ dài không quá 10
Giá mua: số nguyên dương không quá 7 chữ số
Giá bán: số nguyên dương không quá 7 chữ số
Viết chương trình nhập danh sách mặt hàng, sắp xếp theo lợi nhuận (giá bán trừ đi giá mua) giảm dần. Nếu lợi nhuận bằng nhau thì in ra theo thứ tự mã tăng dần. 

Input

Dòng đầu ghi số M là số mặt hàng (không quá 40).

Tiếp theo là thông tin của M mặt hàng, mỗi mặt hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)

Output

Ghi ra danh sách mặt hàng có đầy đủ thông tin ở trên và lợi nhuận tính được (mỗi thông tin cách nhau một khoảng trống)

Ví dụ

Input	
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000

Output
MH002 Ao khoac nam Cai 240000 515000 275000
MH001 Ao phong tre em Cai 25000 41000 16000
 

Giới hạn thời gian: 2s

Giới hạn bộ nhớ: 150000 Kb
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class MatHang implements Comparable<MatHang>{
    private String name, donVi;
    private int code, gm, gb;
    
    public MatHang(int code, String name, String donVi, int gm, int gb){
        this.code = code;
        this.name = name;
        this.donVi = donVi;
        this.gm = gm;
        this.gb = gb;
    }
    
    public String sua(int i){
        String tam = String.valueOf(i);
        String s = "MH0";
        if(tam.length()==1){
            return s+"0"+tam;
        }
        return s+tam;
    }
    
    @Override
    public String toString(){
        return sua(code) + " " + name +" "+ donVi+" "+ String.valueOf(gm)+" "+String.valueOf(gb)+" "+String.valueOf(gb-gm);
    }
    
    @Override
    public int compareTo(MatHang a){
        return (a.gb-a.gm) - (this.gb-this.gm);
    }
}

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList();
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String donVi = sc.nextLine();
            int gm = Integer.parseInt(sc.nextLine());
            int gb = Integer.parseInt(sc.nextLine());
            MatHang a = new MatHang(i, name, donVi, gm, gb);
            arr.add(a);
        }
        Collections.sort(arr);
        for(MatHang i : arr){
            System.out.println(i);
        }
    }
}
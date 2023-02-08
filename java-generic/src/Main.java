import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Ưu điểm của genneric:
//        + cho phép người dùng tự định nghĩa kiểu dữ liệu truyền vào 1 cách linh hoạt
//        + phát hiện lỗi ngay tại thời điểm biên dịch
//        + không cần ép kiểu dữ liệu
//        + xây dựng thuật toán tổng quát, giúp tái sử dụng code
//        + giúp xây dựng các class, function, interface chung

//        Quy ước đặt tên cho genneric
//        E - element (phần tử)
//        T - type (kiểu)
//        K - key (khóa)
//        V - value (giá trị)
//        N - number (số)
//        Chú ý: các kiểu trên chỉ là quy ước ta có thể sử dụng bất cứ kí tự nào không làm thay đổi
//        giá trị của nó

//        ví dụ với arrayList
//        <interger> là genneric được truyền
        ArrayList <Integer> sinhVien = new ArrayList<Integer>();
        sinhVien.add(1);
        sinhVien.add(2);
        sinhVien.add(3);
    }
}
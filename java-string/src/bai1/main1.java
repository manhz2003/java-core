package bai1;

public class main1 {
//    Khái niệm: Là 1 chuỗi của các kí tự unicode
//    chuỗi con: cắt 1 chuỗi cần lấy từ chuỗi ban đầu
//    nối chuỗi: nối 2 chuỗi khác nhau thành 1 chuỗi
//
public static void main(String[] args) {
//    khai báo 1 biến kiểu String
    String name = "mạnh";

//    substring (cắt chuỗi)
//    hàm subString có 2 tham số truyền vào, tham số thứ nhất là index bắt đầu, tham số thứ 2 là index kết thúc

    String myName = "Nguyễn Thế Mạnh !";
    String firstName = myName.substring(0, 10);
    System.out.println(firstName);

//    vị trí bắt đầu bằng 11, nếu không truyền tham số thứ 2 thì vị trí cuối cùng là vị trí kết thúc của chuỗi
    String lastName = myName.substring(11);
    System.out.println(lastName);

//    nối chuỗi
    String firstString = "hello ";
    String lastString = "world !";
    String fullString = firstString + lastString;
    System.out.println(fullString);
}
}

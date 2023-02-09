package bai2;

public class main2 {
    public static void main(String[] args) {
//        duyệt từng phần tử trong chuỗi kí tự
        String name = "nguyen the manh";
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
//        chuỗi trong java là bất biến vì không thể thay đổi bất kì kí tự nào của 1 chuỗi
//        name.charArt(0) = 'N' => không hợp lệ

//       equal so sánh 2 đối tượng bằng nhau, == so sánh 2 biến trỏ đến cùng 1 ô nhớ

        String a = "mạnh";
        String b = "mạnh";

//        == kết quả là true vì a và b cùng trỏ đến 1 ô nhớ
        System.out.println(a == b);

        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = new String("HEllo");

//        str1 và str2 là 2 đối tượng khác nhau nên ở 2 vùng nhớ khác nhau sử dụng == sẽ trả về false
        System.out.println(str1 == str2);

//        sử dụng equal trả về true vì đối tượng có giá trị giống nhau
        System.out.println(str1.equals(str2));

//        trả về false vì 2 đối tượng là 2 giá trị khác nhau
        System.out.println(str1.equals(str3));

//        sử dụng equalInoreCase so sánh 2 đối tượng = nhau không phân biệt hoa thường
        System.out.println(str1.equalsIgnoreCase(str3));


//        chuỗi rỗng ( không tồn tại giá trị)
        String z = "";

//        chuỗi null ( không xác định được giá trị)
        String x = null;
    }
}

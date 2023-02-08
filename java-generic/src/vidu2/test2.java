package vidu2;

public class test2 {
    public static void main(String[] args) {
//        ví dụ về sử dụng 2 tham số genneric, truyền > 2 tương tự

//        từ class ví dụ 2 tạo ra các đối tượng có sử dụng 2 tham số genneric
        vidu2  <String, String> a = new vidu2<>("dog", "con chó"); // có thể truyền 2 đối số cùng kiểu dữ liệu
        vidu2  <String, String> a1 = new vidu2<>("cat", "con mèo");

        vidu2  <String, Integer> a2 = new vidu2<>("one", 1); // hoặc truyền 2 đối số khác kiểu nhau

        person male = new person("mạnh");
        person female = new person("anh");

//        sau khi tạo 2 đối tượng male và female ta truyền 2 tham số person vào genneric thay cho K và V
        vidu2 <person, person> p1 = new vidu2<>(male, female);  // ghép cặp 2 đối tượng với nhau

//       sau khi ghép nối hoặc chuyển đổi song ta có thể sử lý tùy các mục đính ví dụ như so sánh, tìm kiếm, sắp xếp ....
        System.out.println(a.getKey() + " = "+a.getValue()); // hiển thị

    }
}

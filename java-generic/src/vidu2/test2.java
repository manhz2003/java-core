package vidu2;

public class test2 {
    public static void main(String[] args) {
//        chạy class ví dụ 2, ngoài ví dụ truyền 2 tham số genneric ta có thể truyền bao nhiêu tham số khác tùy thích
//        truyền vào 2 đối số kiểu dữ liệu là String
        vidu2  <String, String> a = new vidu2<>("dog", "con chó");
        vidu2  <String, String> a1 = new vidu2<>("cat", "con mèo");
        vidu2  <String, String> a2 = new vidu2<>("one", "số 1");

        vidu2  <String, Integer> a3 = new vidu2<>("one", 1); // có thể truyền 2 kiểu dữ liệu khác nhau

        person male = new person("mạnh");
        person female = new person("anh");
        vidu2 <person, person> p1 = new vidu2<>(male, female);  // ghép cặp 2 đối tượng với nhau

//       sau khi ghép nối hoặc chuyển đổi song ta có thể sử lý tùy các mục đính ví dụ như so sánh, tìm kiếm, sắp xếp ....
        System.out.println(a.getKey() + " = "+a.getValue());
    }
}

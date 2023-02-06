package vidu1;

public class vidu1 {
//    ví dụ về phương thức genneric sử dụng kiểu T
//    in các giá trị của các mảng sau

    public static <T> void printInfo (T[] t){
        for (T x : t) {
            System.out.print(x+" ");
        }
        System.out.println(); // xuống dòng mới sau mỗi lần gọi và thực hiện hàm
    }

    public static void main(String[] args) {
        Integer [] num = {1, 2, 3, 4, 5};
        String [] name = {"mạnh", "dũng", "tùng", "thảo"};
        Double [] diem = {1.2, 1.3, 1.4, 1.5};

        printInfo(num); // từng mảng được truyền vào hàm là đối số của tham số t
        printInfo(name);
        printInfo(diem);

    }
}

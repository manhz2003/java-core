package vidu2;

public class vidu2 <K, V>{
//    ví dụ về lớp sử dụng genneric sử dụng kiểu K V (truyền từ 2 tham số trở lên)
//    chuyển đổi qua lại giữa 2 giá trị, ví dụ như dịch từ, ....

    private K key;
    private V value;

    public vidu2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

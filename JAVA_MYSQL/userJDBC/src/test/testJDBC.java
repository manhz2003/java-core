package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBC;

public class testJDBC {
    public static void main(String[] args) {

        try {
            // Bước 1: Tạo kết nối
            Connection connection = JDBC.getConnection();

            // Bước 2: Tạo ra đối tượng statement
            Statement st = connection.createStatement();

            // Bước 3: Thực thi một câu lệnh SQL
            String sql = "INSERT INTO sinhVien(id, name, age, address)"
                    + "VALUES (6, \"Nguyễn Quang Dũng\", 17, \"Hà Nội\")";

            int check = st.executeUpdate(sql);

            // Bước 4: xử lý kết quả
            System.out.println("Số dòng thay đổi: "+ check);
            if(check>0) {
                System.out.println("Thêm dữ liệu thành công!");
            }else {
                System.out.println("Thêm dữ liệu thất bại!");
            }

            // Bước 5: ngắt kết nối
            JDBC.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

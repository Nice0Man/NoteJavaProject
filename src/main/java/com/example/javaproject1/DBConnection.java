package com.example.javaproject1;

import com.example.javaproject1.module.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static final String HOST = "localhost";
    private static final String PORT = "5433";
    private static final String DBNAME = "notes";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "";
    static String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DBNAME;
    private static final DBConnection dbc = new DBConnection(URL,USERNAME,PASSWORD);
    private Connection connection;

    private DBConnection(String url, String username, String password){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Не удалось соедениться с базой данных.");
        }
    }

    public static DBConnection getDBC(){
        return dbc;
    }

    public List<Category> getCategory() throws SQLException{
        Statement st = connection.createStatement();
        String sql = "SELECT category_id, category_name FROM notes.notes.tcategory";
        ResultSet res = st.executeQuery(sql);
        List<Category> list = new ArrayList<>();
        while (res.next()){
            int categoryId = res.getInt("category_id");
            String categoryName = res.getString("category_name");
            Category category = new Category(categoryId,categoryName);
            list.add(category);
        }
        return list;
    }
}

package com.example.javaproject1;

import com.example.javaproject1.module.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private Button btnCon;

    @FXML
    private TableView<Category> dbTab;

    @FXML
    private Label welcomeText;

    @FXML
    void dbLoad(ActionEvent event) {

    }
    private void btnHandler(){
        try{
            DBConnection dbConn = DBConnection.getDBC();
            dbTab.getColumns().clear();
            dbTab.getItems().clear();
            TableColumn<Category,Integer> firsCol = new TableColumn<>("Идентификатор категории");
            TableColumn<Category,String> secondCol = new TableColumn<>("Название категории");
            firsCol.setCellValueFactory(new PropertyValueFactory<>("categoryId"));
            secondCol.setCellValueFactory(new PropertyValueFactory<>("category"));
            dbTab.getColumns().addAll(firsCol,secondCol);
            dbTab.getItems().addAll(dbConn.getCategory());
        }catch(SQLException e){
            System.out.println("Не удалось полчуить данные.");
        }
    }
    public void closeBtn(ActionEvent actionEvent) {

    }
}
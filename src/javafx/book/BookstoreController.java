package practice.book;

import enums.RepoType;
import factory.Factory;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.awt.print.Book;

public class BookstoreController {


    public TextField txtBookID;
    public TextField txtBookName;
    public TextField txtAuthor;
    public TextField txtPrice;

    public void Save(ActionEvent actionEvent) {
        try {
            // them book
            Book s=  new Book(txtBookID.getText()., txtBookName.getText(),txtAuthor.getText(),txtPrice.getText());
            StudentRepository sr = (StudentRepository) Factory.createRepository(RepoType.STUDENT);
            if(sr.create(s)){
                backToList(null);
                return;
            }
            throw new Exception("Không thêm được dữ liệu");
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void Exit(ActionEvent actionEvent) {
    }
}

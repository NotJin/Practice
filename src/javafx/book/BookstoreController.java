package javafx.book;

import entities.Book;
import enums.RepoType;
import factory.Factory;
import impls.BookRepository;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class BookstoreController {


    public TextField txtBookID;
    public TextField txtBookName;
    public TextField txtAuthor;
    public TextField txtPrice;

    public void Save(ActionEvent actionEvent) {
        try {
            // them book
            Book s=  new Book( txtBookID.getText(),txtBookName.getText(),txtAuthor.getText(),txtPrice.getText());
            BookRepository sr = (BookRepository) Factory.createRepository(RepoType.BOOKS);
            if(sr.save(s)){

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

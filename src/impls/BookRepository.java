package impls;

import database.Connector;
import entities.Book ;
import interfaces.IRepository;

import java.util.ArrayList;

public class BookRepository {
    public boolean save(Book b){
        try {
            Connector connector = Connector.getInstance();
            String sql_txt = "insert into students(name,email,mark,gender) values(?,?,?,?)";
            ArrayList parameters = new ArrayList();
            parameters.add(b.getName());
            parameters.add(b.getId());
            parameters.add(b.getAuthor());
            parameters.add(b.getPrice());
            return connector.execute(sql_txt,parameters);
        }catch (Exception e){
        }
        return false;
    }
}

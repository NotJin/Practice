package interfaces;

import java.util.ArrayList;

public interface IRepository<E> {
    ArrayList<E> all();
    Boolean save(E s);
    Boolean exit(E s);
    E find(int id);
}

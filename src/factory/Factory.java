package factory;

import enums.RepoType;
import impls.BookRepository;
import interfaces.IRepository;

public class Factory {
    public static IRepository createRepository(RepoType type){
        switch (type){
            case BOOKS: return (IRepository) new BookRepository();
            default: throw new IllegalArgumentException("Class not found");
        }
    }
}

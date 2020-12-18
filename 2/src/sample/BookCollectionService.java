package sample;

public class BookCollectionService {
    public static boolean rateBook(int rate, Book book){
        Boolean result = true;
        book.rate = rate;
        return result;
    }

    public static boolean addBook(Book book, BookCollection collection){
        Boolean result = true;
        return result;
    }

    public static boolean removeBook(User user, Book book, BookCollection collection){
        Boolean result = true;
        return result;
    }

    public static Compilation createCompilation(User user, Compilation compilation){
        user.addCompilation(compilation);
        return compilation;
    }

    public static boolean removeCompilation(User user, Compilation compilation){
        Boolean result = true;
        user.removeCompilation(compilation);
        return result;
    }

    public static Compilation editCompilation(User user, Compilation compilation){
        user.editCompilation(compilation);
        return compilation;
    }

    public static BookCollection editPrivatCollection(User user, BookCollection collection){
        user.editPrivateCollection(collection);
        return collection;
    }
}

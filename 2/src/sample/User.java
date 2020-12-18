package sample;

import java.util.Set;

public class User {
    private static String name;
    private static String password;
    private static Set<Compilation> compilations;
    private static BookCollection privateCollection;

    public static boolean addBook(Book book){
        Boolean result = true;
        return result;
    }

    public static boolean removeBook(Book book){
        Boolean result = true;
        return result;
    }

    public static boolean addCompilation(Compilation compilation){
        Boolean result = true;
        compilations.add(compilation);
        return result;
    }

    public static boolean removeCompilation(Compilation compilation){
        Boolean result = true;
        compilations.remove(compilation);
        return result;
    }

    public static boolean editCompilation(Compilation compilation){
        Boolean result = true;
        User username = new User();
        compilation.getUserEditorPrivilegie(username);
        return result;
    }

    public static boolean editPrivateCollection(BookCollection privateCollection){
        Boolean result = true;
        User username = new User();
        privateCollection.removeUserViewerPrivilege(username);
        return result;
    }
}

package sample;

import java.util.Set;

public class Compilation {
    private static User owner;
    private static Set<User> editors;
    private static Set<User> viewers;

    Compilation(User user){
        owner = user;
    }

    public static boolean getUserEditorPrivilegie(User user){
        boolean result = true;
        editors.add(user);
        return result;
    }

    public static boolean removeUserEditorPrivilegie(User user){
        boolean result = true;
        editors.remove(user);
        return result;
    }

    public static boolean getUserViewerPrivilegie(User user){
        boolean result = true;
        viewers.add(user);
        return result;
    }

    public static boolean removeUserViewerPrivilegie(User user){
        boolean result = true;
        editors.remove(user);
        return result;
    }
}

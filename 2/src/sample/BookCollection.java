package sample;

import java.util.Set;

public class BookCollection {
    private static User owner;
    private static Set<User> editors;
    private static Set<User> viewers;

    public static boolean getUserEditorPrivilege(User user){
        Boolean result = true;
        editors.add(user);
        return result;
    }

    public static boolean removeUserEditorPrivilege(User user){
        Boolean result = true;
        editors.remove(user);
        return result;
    }

    public static boolean getUserViewerPrivilege(User user){
        Boolean result = true;
        viewers.add(user);
        return result;
    }

    public static boolean removeUserViewerPrivilege(User user){
        Boolean result = true;
        viewers.remove(user);
        return result;
    }
}

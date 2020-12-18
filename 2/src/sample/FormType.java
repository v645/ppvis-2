package sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class FormType {
    public static Set<String> formType;
    FormType(){
        formType.add("CreateCompilation");
        formType.add("RemoveCompilation");
        formType.add("EditCompilation");
        formType.add("LoadBook");
        formType.add("RemoveBook");
        formType.add("EditPrivateCollection");
        formType.add("CollectionView");
    }
}

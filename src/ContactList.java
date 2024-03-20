import java.util.ArrayList;
import java.util.Iterator;

public class ContactList implements Iterable<Contact> {
    private ArrayList<Contact> myList = new ArrayList<>();

    public ContactList(){}
    public void addContact(Contact a){
        myList.add(a);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Contact> iterator() {
        return myList.iterator();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact person1 = new Contact("John","john@johnmail.john");
        Contact person2 = new Contact("James","james@jamesmail.james");
        Contact person3 = new Contact("Jake","jake@jakemail.jake");

        ContactList list = new ContactList();
        list.addContact(person1);
        list.addContact(person2);
        list.addContact(person3);

        for(Contact a:list){
            System.out.println(a);
        }
    }
}
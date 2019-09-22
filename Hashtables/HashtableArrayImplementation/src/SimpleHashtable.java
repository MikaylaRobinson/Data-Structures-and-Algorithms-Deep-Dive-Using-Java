public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    // adding a value to the hashtable
    public void put(String key, Employee employee) {
        // getting the hashed key for the entered key
        int hashedKey = hashKey(key);
        // Flash warning if the key already exists
        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        }
        else {
            // if the key didn't already exist, add the employee to that position
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    // mapping key provided to an integer
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

}

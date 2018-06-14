
# Linked list to `array list`
```
    public static void main(String[] args) {


        // Linked list to array list

        ArrayList<String> copy = new ArrayList<>();
        LinkedList<String> list_of_names = new LinkedList<>();
        list_of_names.add("Samuel");
        list_of_names.add("Foster");
        list_of_names.add("Junior");
        
        copy.addAll(list_of_names);


    }

```
```
     public static void main(String[] args) {

        // Linked list to array list

        LinkedList<String> list_of_names = new LinkedList<>();

        String[] names = new String[3];

        list_of_names.add("Samuel");
        list_of_names.add("Foster");
        list_of_names.add("Junior");

        for (int i = 0; i < names.length ; i++) {
            names[i] = list_of_names.get(i).toString();
        }

        for (String name : names) {
            System.out.println(name);
        }


    }
```

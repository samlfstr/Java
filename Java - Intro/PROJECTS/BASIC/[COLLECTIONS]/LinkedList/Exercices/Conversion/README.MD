
# Linked list to `array list`

    public static void main(String[] args) {


        // Linked list to array list

        ArrayList<String> copy = new ArrayList<>();
        LinkedList<String> list_of_names = new LinkedList<>();
        list_of_names.add("Samuel");
        list_of_names.add("Foster");
        list_of_names.add("Junior");
        
        copy.addAll(list_of_names);


    }

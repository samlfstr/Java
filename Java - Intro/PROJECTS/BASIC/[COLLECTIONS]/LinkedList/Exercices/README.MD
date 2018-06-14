
# Joining two `linked list`

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        // Joining two linked list
        
        LinkedList<String> `list_of_names` = new LinkedList<>();
        LinkedList<String> other_list = new LinkedList<>();
        `list_of_names`.add("Samuel");
        `list_of_names`.add("Foster");
        `list_of_names`.add("Junior");
        other_list.add("Mother fkr");

        other_list.addAll(`list_of_names`);

        other_list.forEach(System.out::println);




    }
}

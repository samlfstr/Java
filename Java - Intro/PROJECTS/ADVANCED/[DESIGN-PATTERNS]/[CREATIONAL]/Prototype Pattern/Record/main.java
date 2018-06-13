package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String mysql = "select * from movies where title = '?';";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();

        Statement first_statement = new Statement(mysql,parameters,record);




    }
}

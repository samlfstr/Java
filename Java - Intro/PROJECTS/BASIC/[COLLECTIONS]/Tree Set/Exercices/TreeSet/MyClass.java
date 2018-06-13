package com.pluralsight;

public class MyClass implements Comparable<MyClass>{

    private String label;
    private String value;

    public String get_label(){ return this.label; }
    public String get_value(){ return this.value; }

    MyClass() {}

    MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String toString() {return value + " | " + label;}


    public boolean equals(Object o){
        // si l'object o n'est pas une instance de la class MyClass return false
        if(!(o instanceof MyClass)) return false;
        MyClass other = (MyClass) o;
        return other.label.equals(this.label) && other.value.equals(this.value);
    }

    public int compareTo(MyClass my_class){
        return value.compareTo(my_class.value);
    }


}

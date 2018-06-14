
# Check a `particular` element

    public static void main(String[] args) {
    
    

        // Check a particular element
        

        LinkedList<String> list_of_names = new LinkedList<>();
        list_of_names.add("Samuel");
        list_of_names.add("Foster");
        list_of_names.add("Junior");



        boolean contain = list_of_names.contains("Samuel");
        if(contain) System.out.println("Yes it does"); else System.out.println("No it doesn't");
        
   }

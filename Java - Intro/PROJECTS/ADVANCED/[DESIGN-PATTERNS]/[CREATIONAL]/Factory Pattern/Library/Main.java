public class Main {
    public static void main(String[] args) {

      BookCreator bookCreator = new BookCreator();
      bookCreator.createBook(BookTypes.ADVENTURE);
      bookCreator.get_adventure().bookDescription();


    }

}

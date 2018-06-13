public class BookCreator {


    private Adventure adventure;
    public Adventure get_adventure(){ return this.adventure; }
    private void set_adventure(Adventure adventure){ this.adventure = adventure; }

    private Erotic erotic;
    public Erotic get_erotic(){ return this.erotic; }
    private void set_erotic(Erotic erotic){ this.erotic = erotic; }

    private ScienceFiction scfi;
    public ScienceFiction get_scfi(){ return this.scfi; }
    private void set_scfi(ScienceFiction scfi){ this.scfi = scfi; }

    public void createBook(BookTypes types){
        switch (types){
            case SCIENCE_FICTION:
                set_scfi(new ScienceFiction());
            case EROTIC:
                set_erotic(new Erotic());
            case ADVENTURE:
                set_adventure(new Adventure());
        }
    }

}

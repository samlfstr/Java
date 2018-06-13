
public class App {


    private King king;
    private Castle castle;
    private Army army;


    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.makeCastle());
        setArmy(factory.makeArmy());
    }

    //region Prop_King
    public King getKing() {
        return king;
    }
    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }
    private void setKing(final King king) {
        this.king = king;
    }
    //endregion

    //region Prop_Castle
    public Castle getCastle() {
        return castle;
    }
    Castle getCastle(final KingdomFactory factory) {
        return factory.makeCastle();
    }
    private void setCastle(final Castle castle) {
        this.castle = castle;
    }
    //endregion

    //region Prop_Army
    public Army getArmy() {
        return army;
    }
    Army getArmy(final KingdomFactory factory) {
        return factory.makeArmy();
    }
    private void setArmy(final Army army) {
        this.army = army;
    }
    //endregion


    public static class FactoryMaker {

        public enum KingdomType {
            ELF, ORC
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }


}

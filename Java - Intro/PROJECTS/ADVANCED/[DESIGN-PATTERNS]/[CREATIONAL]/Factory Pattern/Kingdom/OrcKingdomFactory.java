public class OrcKingdomFactory implements KingdomFactory{

    @Override
    public Castle makeCastle() {
        return new OrcCastle();
    }

    @Override
    public Army makeArmy() {
        return new OrcArmy();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }
}

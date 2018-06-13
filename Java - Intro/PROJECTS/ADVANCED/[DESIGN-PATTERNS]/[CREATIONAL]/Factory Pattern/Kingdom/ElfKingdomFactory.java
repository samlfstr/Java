public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new ElfCastle();
    }

    @Override
    public Army makeArmy() {
        return new ElfArmy();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }
}

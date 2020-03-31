package kata;

class Locker
{
    final String name;
    private final int box;

    public Locker(String name, int box) {
        this.name = name;
        this.box = box;
    }

    boolean canAcceptPackageOfSize(int packageSize) {
        return box >= packageSize;
    }
}

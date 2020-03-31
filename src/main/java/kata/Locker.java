package kata;

class Locker
{
    final String name;
    private final Boxes boxes2;

    public Locker(String name, int[] boxes) {
        this.name = name;
        this.boxes2 = new Boxes(boxes);
    }

    boolean canAcceptPackageOfSize(int packageSize) {
        return boxes2.boxesCanAcceptPackageOfSize(packageSize);
    }

}

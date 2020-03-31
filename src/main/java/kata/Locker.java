package kata;

class Locker
{
    final String name;
    private final int[] boxes;

    public Locker(String name, int[] boxes) {
        this.name = name;
        this.boxes = boxes;
    }

    boolean canAcceptPackageOfSize(int packageSize) {
        return boxes[0] >= packageSize;
    }
}

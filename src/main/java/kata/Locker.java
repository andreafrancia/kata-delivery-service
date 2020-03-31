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
        for(int box: boxes) {
            if(box >= packageSize)
                return true;
        }
        return false;
    }
}

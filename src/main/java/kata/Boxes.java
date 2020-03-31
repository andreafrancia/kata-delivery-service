package kata;

class Boxes implements Container {

    final int[] boxes;

    Boxes(int[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public boolean boxesCanAcceptPackageOfSize(int packageSize) {
        for(int box: boxes) {
            if(box >= packageSize)
                return true;
        }
        return false;
    }
}

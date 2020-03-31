package kata;

class Boxes {

    final int[] boxes;

    Boxes(int[] boxes) {
        this.boxes = boxes;
    }

    boolean boxesCanAcceptPackageOfSize(int packageSize) {
        for(int box: boxes) {
            if(box >= packageSize)
                return true;
        }
        return false;
    }
}

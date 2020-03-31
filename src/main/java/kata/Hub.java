package kata;

class Hub implements Container {
    @Override
    public boolean boxesCanAcceptPackageOfSize(int packageSize) {
        return true;
    }
}

package kata;

class CollectionPoint
{
    final String name;
    private final Container container;

    public CollectionPoint(String name, int[] container) {
        this.name = name;
        this.container = new Boxes(container);
    }

    boolean canAcceptPackageOfSize(int packageSize) {
        return container.boxesCanAcceptPackageOfSize(packageSize);
    }

}

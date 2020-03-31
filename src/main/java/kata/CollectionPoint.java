package kata;

class CollectionPoint
{
    final String name;
    private final Container container;

    public CollectionPoint(String name, Container container) {
        this.name = name;
        this.container = container;
    }

    boolean canAcceptPackageOfSize(int packageSize) {
        return container.boxesCanAcceptPackageOfSize(packageSize);
    }

}

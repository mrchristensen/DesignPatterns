package DesignPatterns.Proxy.ProxyLazyLoading;

public class Part2Proxy implements Part2Interface {
    Part2Implementation part2;
    String fileName;

    public Part2Proxy(String fileName) {
        part2 = null;
        this.fileName = fileName;
    }

    @Override
    public void set(int row, int col, String value) {
        if(part2 == null){
            loadObject();
        }
        part2.set(row, col, value);
    }

    @Override
    public String get(int row, int col) {
        if(part2 == null){
            loadObject();
        }
        return part2.get(row, col);
    }

    private void loadObject() {
        part2 = new Part2Implementation(fileName);
        System.out.println("Object was lazily loaded");
    }
}

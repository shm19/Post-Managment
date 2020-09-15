package ir.ac.kntu;

public enum Method {
    AIR(2), LAND(1), SEA(1.5);
    private final double multiplier;

    Method(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public static Method choose() {
        System.out.println("choose your method");
        Method[] methods = Method.values();
        for (int i = 0; i < methods.length; i++) {
            System.out.println((i + 1) + " --> " + methods[i]);
        }
        int option = ScannerHelper.nextInt(methods.length);
        return methods[option - 1];
    }
}

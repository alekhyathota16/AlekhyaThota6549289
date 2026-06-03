public  class TypeCasting{
    public static void main(String[] args) {
        double d = 24.5;
        int age = (int) d;
        System.out.println("Double to Int:");
        System.out.println("Original Double : "+d);
        System.out.println("After Casting : "+age);
        System.out.println();

        int cost = 75;
        double d1 = cost;
        System.err.println("Int to Double : ");
        System.out.println("Original Int : "+cost);
        System.out.println("Afetr Casting :"+d1);
    }
}
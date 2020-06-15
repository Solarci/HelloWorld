public class PrimitivesVsObjectArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[1] = 2;
        for (int sa : a) {
            System.out.println(sa);
        }
        Integer[] b = new Integer[5];
        for (Integer sa : b) {
            System.out.println(sa);
        }
    }
}

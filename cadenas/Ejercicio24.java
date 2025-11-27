public class Ejercicio24 {
    public static void main(String[] args) {
        
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        numsRandom(nums1, nums2);

        for (int i = 0; i < nums1.length; i++) {
            int resultado = nums1[i] + nums2[i];

            System.out.print(nums1[i] + " + " + nums2[i] + " = " + resultado);
            System.out.println();
        }
    }

    public static void numsRandom(int a[], int b[]) {
        for (int i = 0; i < b.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            b[i] = (int) (Math.random() * 10) + 1;
        }
    }
}

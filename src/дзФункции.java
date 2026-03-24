public class дзФункции {
    public static void main(String[] args) {
        byte [] nums1 = new byte [] {5,6,8};

        int summ1 = summaArray(nums1);
        System.out.println("сумма 1: " + summ1);
        byte[] nums2 = new byte [] {5,7,3,7,6,8};
        int summ2 = summaArray(nums2);
        System.out.println("Сумма 2: " + summ2);
            }
            public static int summaArray(byte[] arr){
        int summa = 0;
                for (int i = 0; i < arr.length; i++)
                    summa += arr[i];
                return summa;

                }
            }



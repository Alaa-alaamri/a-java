public class task4 {

        static int findMissingNo(int[] arr, int n) {
            int val;
            int nextval;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 0 || arr[i] > n)
                    continue;

                val = arr[i];

                while (arr[val - 1] != val) {
                    nextval = arr[val - 1];
                    arr[val - 1] = val;
                    val = nextval;
                    if (val <= 0 || val > n)
                        break;
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }

            return n + 1;
        }

        public static void main(String[] args) {
            int arr[] = {3,4,-1,1};
            int arr_size = arr.length;

            int missing = findMissingNo(arr, arr_size);

            System.out.println("The smallest positive"
                    + " missing number is " + missing);
        }
    }




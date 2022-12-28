public class Main {
    public static void main(String[] args) {
        // Javaでは要素番号は０から開始なので、以下の初期値も１引いたものとしている
        int [] bins = bitSort(new int[]{1, 5, 2, 0, 3, 4});

        for(int bin: bins){
            System.out.println(bin);
        }
    }

    private static int[] bitSort(int[] data)   {
        int n = data.length;
        int[] bins = new int[n];
        int i;

        for(i = 0; i <= n - 1; i++){
            bins[data[i]] = data[i];
        }

        return bins;
    }
}
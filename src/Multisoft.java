public class Multisoft {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int[] a = {5,8,9,0,66,18};
        for (int i = 1; i < a.length; i++) {
            if ((a[i] % 2 == 0) && a[i-1] % 3 == 0){
            s.append(a[i] / 2);
            }
            else {
                s.append(a[i] * 2);
            }
        }
        System.out.println(s);
    }
}

public class C_3_18 {
    static int[] a={1,2,3,4,5,6,8,7,2,3,47,2,8,2,6,3,2,7};
    static public void run(){
        int[] t;
        int[] a1;
        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    System.out.println(a[i]+"= "+a[j]);

              }

            }
           // System.out.println(a[i]+" ");

        }
      //  System.out.println(t);
    }

    public static void main(String[] args) {
run();
    }
}

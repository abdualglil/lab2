public class ha {
        static int[] a={1,2,3,4,5};
        static int[] b={6 ,7, 8 ,9 ,10};
        static int[] ab=new int[10];
    static public void Merge(){
        int c=b.length;
        for (int i = 0; i < a.length; i++) {
            ab[i]=a[i];
            ab[c]=b[i];
            c++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ab[i]);
        }
    }

    public static void main(String[] args) {
        Merge();
    }
}

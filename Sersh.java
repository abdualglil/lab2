public class Sersh {
   static int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    static public void sersh(int e){
        int low=0;
         int high=a.length;
        int mod=low+((high-low)/2);
        int j=mod;
        boolean  te=false;
       while (j<a.length && !te)

        {

            if(e==a[j]){
                te=true;
                System.out.println("{"+a[j]+"}");
            }
            else if (e>a[j]){
            low=mod+1;
                mod=low+((high-low)/2);
                j=mod;
            }
            else if (e<a[j]){
            high=mod-1;
            mod=low+((high-low)/2);
            j=mod;
            }


        }
    }

    public static void main(String[] args) {
        sersh(15);
    }
}

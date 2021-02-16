public class neee {
   static int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20} ;
    static public void sersh(int x){
        for (int i = (a.length/2)-1; i < a.length;) {
          //  System.out.println("i"+i+"a"+a[i]);
            if(x==a[i]){
                System.out.println("{"+a[i]+"}");break;
            }
            else if (x>a[i]){
                System.out.println("i="+i+" a="+a[i]);
                i=i+((a.length-i)/2);
                if (a[i-1]==x)i=i=i-1;
                System.out.println("i="+i+" a="+a[i]);
            }
            else if (x<a[i]){
                System.out.println("2i="+i+" 2a="+a[i]);
                float q=i-((float)i/2);
                i=(int)q;
                System.out.println("2i="+i+" 2a="+a[i]);
            }

        }

    }

    public static void main(String[] args) {
      sersh(4);

    }
}

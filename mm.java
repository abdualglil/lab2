
class GFG{

    static class eleCount {
        int e;
        int c;
    };

    static void moreThanNdK(int arr[], int n, int k)
    {

        if (k < 2)
            return;


        eleCount []temp = new eleCount[k - 1];
        for (int i = 0; i < k - 1; i++)
            temp[i] = new eleCount();
        for (int i = 0; i < k - 1; i++) {
            temp[i].c = 0;
        }


        for (int i = 0; i < n; i++)
        {
            int j;


            for (j = 0; j < k - 1; j++)
            {
                if (temp[j].e == arr[i])
                {
                    temp[j].c += 1;
                    break;
                }
            }


            if (j == k - 1) {
                int l;


                for (l = 0; l < k - 1; l++)
                {
                    if (temp[l].c == 0)
                    {
                        temp[l].e = arr[i];
                        temp[l].c = 1;
                        break;
                    }
                }

			/* If all the position in the
			temp[] are filled, then decrease
			count of every element by 1 */
                if (l == k - 1)
                    for (l = 0; l < k-1; l++)
                        temp[l].c -= 1;
            }
        }

        /*Step 3: Check actual counts of
         * potential candidates in temp[]*/
        for (int i = 0; i < k - 1; i++)
        {

            // Calculate actual count of elements
            int ac = 0; // actual count
            for (int j = 0; j < n; j++)
                if (arr[j] == temp[i].e)
                    ac++;

            // If actual count is more than n/k,
            // then print it
            if (ac > n / k)
                System.out.print("Number:" + temp[i].e
                        + " Count:" + ac +"\n");
        }
    }

    /* Driver code */
    public static void main(String[] args)
    {
        System.out.print("First Test\n");
        int arr1[] = { 4, 5, 6, 7, 8, 4, 4 };
        int size = arr1.length;
        int k = 3;
        moreThanNdK(arr1, size, k);

        System.out.print("\nSecond Test\n");
        int arr2[] = { 4, 2, 2, 7 };
        size = arr2.length;
        k = 3;
        moreThanNdK(arr2, size, k);

        System.out.print("\nThird Test\n");
        int arr3[] = { 2, 7, 2 };
        size = arr3.length;
        k = 2;
        moreThanNdK(arr3, size, k);

        System.out.print("\nFourth Test\n");
        int arr4[] = { 2, 3, 3, 2 };
        size = arr4.length;
        k = 3;
        moreThanNdK(arr4, size, k);

    }
}

// This code contributed by Princi Singh .

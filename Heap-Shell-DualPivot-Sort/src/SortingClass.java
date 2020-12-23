public class SortingClass {

	
	/*this consturctor made just creating an object
	 *There is no attribute so there is not any parametre
	 */
	public SortingClass() 
	{}
	
	public void heapSort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 

        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
    } 
  
    
     /*  To heapify a subtree rooted with node i which is 
     *  an index in arr[]. n is size of heap 
    */
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 

    /* function to sort arr using shellSort */
    int shellSort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            /* Do a gapped insertion sort for this gap size. 
             * The first gap elements a[0..gap-1] are already 
             * in gapped order keep adding one more element 
             * until the entire array is gap sorted 
             */
            for (int i = gap; i < n; i += 1) 
            { 
                /* add a[i] to the elements that have been gap 
                   sorted save a[i] in temp and make a hole at 
                   position i 
                 */
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    }
    
    
    
    
    //DualPivotQuickSort
    void dualPivotSort(int[] arr, int left, int right) {
        if (right > left) {
            // Choose outermost elements as pivots
            if (arr[left] > arr[right]) qSwap(arr, left, right);
            int p = arr[left], q = arr[right];

            // Partition A according to invariant below
            int l = left + 1, g = right - 1, k = l;
            while (k <= g) {
                if (arr[k] < p) {
                	qSwap(arr, k, l);
                    ++l;
                } else if (arr[k] >= q) {
                    while (arr[g] > q && k < g) --g;
                    qSwap(arr, k, g);
                    --g;
                    if (arr[k] < p) {
                    	qSwap(arr, k, l);
                        ++l;
                    }
                }
                ++k;
            }
            --l; ++g;

            // Swap pivots to final place
            qSwap(arr, left, l); qSwap(arr, right, g);

            // Recursively sort partitions
            dualPivotSort(arr, left, l - 1);
            dualPivotSort(arr, l + 1, g - 1);
            dualPivotSort(arr, g + 1, right);
        }
    }

    void qSwap(int[] arr, int i, int j) {
        final int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
	
}

void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
        int best = i;
       
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[best]) {
                best = j;
            }
        }

        swap(arr, i, best);
    }
}
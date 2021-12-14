// Binary Search JETS Psueldo code

int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;


    while (left <= right) {
        int mid = (left + right) / 2;

//        If value at middle is greater than target
//         then move the right marker 1 to the left of the middle  
        if (arr[mid] > target) {
            right = mid - 1;

//         If value at middle is less than target
//         then move the left marker 1 to the right of the middle  
        } else if (arr[mid] < target) {
            left = mid + 1;

//         If value at middle equals target, 
//         then the algorithm found the target in the array
        } else {
            return mid;
        }
    }

    // If left & right markers overlapped eachother,
    // then the target is not in the array
    return -1;
}
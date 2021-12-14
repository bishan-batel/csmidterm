Collection arrayToCollection(int[] arr) {
    Collection data = new Collection();

    for (int i = 0; i < arr.length; i++) {
        data.add(arr[i]);
    }

    return data;
 }
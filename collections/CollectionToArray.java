int[] collectionToArray(Collection data) {
    int size = 0;

    data.resetNext();
    while (data.hasNext()) {
        data.getNext();
        size++;
    }

    int[] arr = new int[size];
    data.resetNext();
    for (int i = 0; i < size; i++) {
        arr[i] = data.getNext();
    }

    return arr;
}
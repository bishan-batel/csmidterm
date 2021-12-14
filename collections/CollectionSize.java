int collectionSize(Collection data) {
    int size = 0;

    while (data.hasNext()) {
        data.getNext();
        size++;
    }

    return size;
}
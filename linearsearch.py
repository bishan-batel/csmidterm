def main():


    # Question 6
    data = Collection() 

    response = "y";
    while response == "y":
        data.add( input("Enter a name: ") )
        response = input("Do you have any names? (y/n)")
    data.print();


class Collection:
    def __init__(self) -> None:
        self.arr = []; 
        self.pointer = -1;

    def print(self):
        out = "["
        for i in self.arr:
            out += str(i) + ", "
        out += "]"
        print(out)

    # Fundamental Operations
    def add(self, val):
        self.arr.append(val);

    def getNext(self):
        self.pointer = self.pointer + 1;
        return self.arr[self.pointer];

    def resetNext(self):
        self.pointer = -1;

    def hasNext(self):
        return self.pointer < len(self.arr) - 1;

    def isEmpty(self):
        return self.arr.len() == 0;
    

if __name__ == "__main__":
    main();
class DynamicArray {

	int[] dynamicArray;
	int size;

    public DynamicArray(int size) {
    	//constructor initialse a new array and the size(elements stored) of the dynamic array
    	dynamicArray = new int [size];
    	size=0;
    }

    //returns the number of elements stored in the dynamic array
    public int length() {
        return size;
    }

    //returns element at index k in the array
    public int select(int k) {
    	//Base case
    	if(k>dynamicArray.length-1 || k<0){
    		System.out.println("Index out of range");
    		return -1;
    	}
        return dynamicArray[k];
    }

    //Sets the k:th elements to o in the dynamic array
    public void store(int o, int k) {
    	//Base case
    	if(k>dynamicArray.length-1 || k<0){
    		System.out.println("Index out of range");
    	}
    	dynamicArray[k]=o;
    }

    //increases the size of the dynamic array by 1 and set the endmost element to o
    public void push(int o) {
    
    	//check if the next element to be pushed will be outside the current length of the dynamic array
    	if(size+1>dynamicArray.length-1){
    		//if so extend the length of the array
    		extend();
    	}

    	dynamicArray[size]=o;
    	size++;
    }

    //returns the endmost element and decrease the size of the dynamic array by 1
    public int pop() {
    	size--;
        return dynamicArray[size];
    }

    //increases the length of the array by 20.
    private void extend() {
    	//create a new array with increased length	
    	int [] tempArray = new int[dynamicArray.length+20];
    	//copy elements to new array
    	for (int i = 0; i<size; i++){
    		tempArray[i] = select(i);
    	}
		
		dynamicArray = new int [tempArray.length];
    	dynamicArray = tempArray;
    }
}

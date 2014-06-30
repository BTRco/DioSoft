package secondTask;

public class OuterUnion {

    private int[] fullSizeArray;
    private int fullArraySize;
    private int currenFullArrayFieldNumber;

    public int[] outerUnion(int[] firstArray, int[] secondArray){

        if (firstArray == null){
            firstArray = new int[0];
        }  else if (secondArray == null){
            secondArray = new int[0];
        }

        fullSizeArray = checkFullArraySizeAndInitiateIt(firstArray.length, secondArray.length);

        outerUnionArrayAddNumbers(firstArray, secondArray);
        outerUnionArrayAddNumbers(secondArray, firstArray);

        return decreaseArray(fullSizeArray);
    }

    private int[] checkFullArraySizeAndInitiateIt(int firstArraySize, int secondArraySize){

        if (firstArraySize > secondArraySize){
            fullArraySize = firstArraySize;
        }
        else {
            fullArraySize = secondArraySize;
        }

        int[] fullArray = new int[fullArraySize];
        return fullArray;

    }

    private void outerUnionArrayAddNumbers(int[] firstArray, int[] secondArray){
        for (int i = 0; i < firstArray.length; i++){
            if (isTwoNumbersAreSimilar(i, firstArray, secondArray)){
                if (!isThisNumberIsDuplicate(firstArray[i])){
                    fullSizeArray[currenFullArrayFieldNumber] = firstArray[i];
                    currenFullArrayFieldNumber++;
                }
            }
        }
    }



    private boolean isTwoNumbersAreSimilar(int i, int[] firstArray, int[] secondArray){

        if (i < firstArray.length){
            for (int j = 0; j < secondArray.length; j++){
                if (firstArray[i] == secondArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isThisNumberIsDuplicate(int dublicateNumberCheked){
        for (int j = 0; j < fullArraySize; j++){
            if (fullSizeArray[j] == dublicateNumberCheked){
                return true;
            }
        }
        return false;
    }

    private int[] decreaseArray(int[] arrayToDecrease){
        int nonZeroArrayLength=0;
        for (int i = 0; i < arrayToDecrease.length; i++){
            if (arrayToDecrease[i] !=0){
                nonZeroArrayLength++;
            }
        }
        int[] decreasedArray = new int[nonZeroArrayLength];
        for (int i = 0; i < nonZeroArrayLength; i++){
            decreasedArray[i] = arrayToDecrease[i];
        }
        return decreasedArray;
    }

    public void arrayOutput (int[] arrayToOutput){
        for (int anArrayToOutput : arrayToOutput) {
            System.out.print(anArrayToOutput + " ");
        }
        System.out.println(" ");
    }
}

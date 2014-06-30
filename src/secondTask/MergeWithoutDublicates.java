package secondTask;

public class MergeWithoutDublicates {

    private int[] fullSizeArray;
    private int fullArraySize;
    private int currenFullArrayFieldNumber;

    public int[] mergeWithoutDublicates(int[] firstArray, int[] secondArray){

        if (firstArray == null){
            firstArray = new int[0];
        }

        if (secondArray == null){
            secondArray = new int[0];
        }

        fullSizeArray = checkFullArraySizeAndInitiateIt(firstArray.length, secondArray.length);

        outerUnionArrayAddNumbers(firstArray);
        outerUnionArrayAddNumbers(secondArray);

        return decreaseArray(fullSizeArray);
    }

    private int[] checkFullArraySizeAndInitiateIt(int firstArraySize, int secondArraySize){

        int[] fullArray = new int[firstArraySize+secondArraySize];
        return fullArray;

    }

    private void outerUnionArrayAddNumbers(int[] array){
        for (int i = 0; i < array.length; i++){
           if (!isThisNumberIsDuplicate(array[i])){
                    fullSizeArray[currenFullArrayFieldNumber] = array[i];
                    currenFullArrayFieldNumber++;
           }
        }
    }

    private boolean isThisNumberIsDuplicate(int dublicateNumberCheked){
        for (int j = 0; j < fullSizeArray.length; j++){
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

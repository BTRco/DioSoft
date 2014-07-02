/**package secondTask;

private class InnerUnion {

    private InnerUnion(Builder builder) {
        this.fullArraySize = builder.fullArraySize;
        this.fullSizeArray = builder.fullSizeArray;
    }

    private final int[] fullSizeArray;
    private final int fullArraySize;
    private final int currenFullArrayFieldNumber;

    public static class Builder{

        private int[] fullSizeArray;
        private int fullArraySize;
        private int currentFullArrayFieldNumber = 0;

        public Builder() {

        }

        public Builder(InnerUnion original) {
            this.fullSizeArray = original.fullSizeArray;
            this.fullArraySize = original.fullArraySize;
        }

        public Builder fullSizeArray(int[] fullSizeArray) {
            this.fullSizeArray = fullSizeArray;
            return this;
        }

        public Builder fullArraySize(int fullArraySize) {
            this.fullArraySize = fullArraySize;
            return this;
        }

        public InnerUnion build(){
            return new InnerUnion(this);
        }
    }

}
**/



/**
 public int[] innerUnion(int[] firstArray, int[] secondArray){

 if (firstArray == null){
 firstArray = new int[0];
 }

 if (secondArray == null){
 secondArray = new int[0];
 }

 fullSizeArray = checkFullArraySizeAndInitiateIt(firstArray.length, secondArray.length);

 for (int i = 0; i < fullArraySize; i++){
 if (isTwoNumbersAreSimilar(i, firstArray, secondArray)){
 if (!isThisNumberIsDuplicate(firstArray[i])){
 fullSizeArray[currenFullArrayFieldNumber] = firstArray[i];
 currenFullArrayFieldNumber++;
 }
 }
 }

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

 private boolean isTwoNumbersAreSimilar(int i, int[] firstArray, int[] secondArray){

 if (i < firstArray.length){
 for (int j = 0; j < secondArray.length; j++){
 if (firstArray[i] == secondArray[j]) {
 return false;
 }
 }
 }
 return false;
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
 **/

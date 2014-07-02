package firstTask;

public class MergeArrays {



    public NewPerson[] mergeArrays (NewPerson[] array1, NewPerson[] array2){

        int unionArrayLength = array1.length+array2.length;
        int currentPositionInUnionArray = 0;
        NewPerson[] unionArray = new NewPerson[unionArrayLength];  //сделать чтобы дубликаты не добавлялись
        for (int i = 0; i < array1.length; i++, currentPositionInUnionArray++){
                unionArray[currentPositionInUnionArray] = array1[i];
        }

        for (int i = 0; i < array2.length; i++, currentPositionInUnionArray++){
                unionArray[currentPositionInUnionArray] = array2[i];
        }

        NewPerson temp;

        for (int i = 0; i < unionArrayLength; i++){
            temp = unionArray[i];
            for (int j =i+1; j < unionArrayLength; j++){
                if (unionArray[j] == temp){
                    unionArray[j] = null;
                }
            }
        }

        NewPerson[] mergedArray = new NewPerson[unionArrayLength];
        int current = 0;
        for (int i = 0; i < unionArrayLength; i++){
            if (unionArray[i] != null){
                mergedArray[current] = unionArray[i];
                current++;
            }
        }

        return mergedArray;
    }
}

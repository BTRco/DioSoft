package firstTask;

public class Company {
    public static void main(String[] args) {
        MergeArrays mergeArrays = new MergeArrays();

        NewPerson[] persons1;
        NewPerson[] persons2;
        NewPerson bogdan = new NewPerson.Builder()
                .personAge(23)
                .personName("Bogdan")
                .personAddress("Ukraine, Kyiv")
                .build();
        NewPerson dima = new NewPerson.Builder()
                .personName("Dima")
                .personAddress("Russia")
                .personAge(22)
                .build();
        NewPerson sasha = new NewPerson.Builder()
                .personAge(231)
                .personName("Sasha")
                .personAddress("Ukraine, Kyiv")
                .build();
        NewPerson vasja = new NewPerson.Builder()
                .personName("Vasja")
                .personAddress("Russia")
                .personAge(222)
                .build();

        persons1 = new NewPerson[]{bogdan, bogdan, dima};
        persons2 = new NewPerson[]{sasha, bogdan, dima};

        ServiceDelegate serviceDelegate = new ServiceDelegate(mergeArrays);

       NewPerson[] mergedArray = serviceDelegate.mergeArrays(persons1, persons2);
       for (int i = 0; i < mergedArray.length; i++){
           if (mergedArray[i] != null) {
               System.out.println(mergedArray[i]);
           }
       }

 }









    /**NewPerson[] newPersons = new NewPerson[10];                      //Person objects array with 10 size
    public int numberOfPerson;                              //Number of added person

    public void outputArray(){                              //Method for output array to console
        for (int i = 0; i < newPersons.length; i++){
            if (newPersons[i] != null){
                System.out.println(newPersons[i].toString());
            }
        }
    }

    public void addToArray(NewPerson newPerson){                  //Method for add Person object to array
        if (numberOfPerson < newPersons.length) {
            newPersons[numberOfPerson++] = newPerson;
        } else increaseArray(newPerson);
    }

    private void increaseArray(NewPerson newPerson){              //Method for increase initial array
        NewPerson[] persons1 = new NewPerson[newPersons.length+5];
        for (int i = 0; i < newPersons.length; i++){
            persons1[i] = newPersons[i];
        }
        newPersons = persons1;
        addToArray(newPerson);
    }

    @Override
    public boolean equals(Object obj) {


        if (newPersons == obj){
            return true;
        }

        if (obj == null || newPersons == null){
            return false;
        }

        if (!(obj instanceof Company)){
            return false;
        }

        Company objP = (Company) obj;

        if (newPersons.length != objP.newPersons.length){
            return false;
        }

        for (int i = 0; i < newPersons.length; i++){
            if (newPersons[i] != null && objP.newPersons[i] != null)
            if (!(newPersons[i].equals(objP.newPersons[i]))){
                return false;
            }
        }
    return true;
    } **/
}

package firstTask;

public class Company {

    Person[] persons = new Person[10];
    public int numberOfPerson;

    public void outputArray(){
        for (int i = 0; i < persons.length; i++){
            if (persons[i] != null){
                System.out.println(persons[i].toString());
            }
        }
    }

    public void addToArray(Person person){
        if (numberOfPerson < persons.length) {
            persons[numberOfPerson++] = person;
        } else increaseArray(person);
    }

    private void increaseArray(Person person){
        Person[] persons1 = new Person[persons.length+5];
        for (int i = 0; i < persons.length; i++){
            persons1[i] = persons[i];
        }
        persons = persons1;
        addToArray(person);
    }

    @Override
    public boolean equals(Object obj) {


        if (persons == obj){
            return true;
        }

        if (obj == null || persons == null){
            return false;
        }

        if (!(obj instanceof Company)){
            return false;
        }

        Company objP = (Company) obj;

        if (persons.length != objP.persons.length){
            return false;
        }

        for (int i = 0; i < persons.length; i++){
            if (persons[i] != null && objP.persons[i] != null)
            if (!(persons[i].equals(objP.persons[i]))){
                return false;
            }
        }
    return true;
    }
}

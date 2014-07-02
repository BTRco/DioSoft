package firstTask;

public class ServiceDelegate {

    private final MergeArrays resourse;

    public ServiceDelegate(MergeArrays resourse){
        this.resourse = resourse;
    }

    public NewPerson[] mergeArrays (NewPerson[] array1, NewPerson[] array2){
        System.out.println("In service delegate class");
        return resourse.mergeArrays(array1, array2);
    }


}

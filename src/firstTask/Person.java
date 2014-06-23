package firstTask;

public class Person {

    final private String personName;
    final private String personAddress;
    final private int personAge;
    final private Post personPost;

    public Person(String personName, String personAddress, int personAge, Post personPost) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personAge = personAge;
        this.personPost = personPost;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public int getPersonAge() {
        return personAge;
    }

    public Post getPersonPost() {
        return personPost;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personAge=" + personAge +
                ", personPost=" + personPost +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (!(obj instanceof Person)){
            return false;
        }

        if (this.getPersonName().equals(((Person) obj).getPersonName())){
            if (this.getPersonAddress().equals(((Person) obj).getPersonAddress())){
                if (this.getPersonAge() == ((Person) obj).getPersonAge()){
                    if (this.getPersonPost() ==((Person) obj).getPersonPost()){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + (int) personAge;
        result = prime * result + (personAddress == null ? 0 : personAddress.hashCode());
        result = prime * result + (personName == null ? 0 : personName.hashCode());
        return result;
    }




}


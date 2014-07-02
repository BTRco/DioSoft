package firstTask;

public class NewPerson {

    final private String personName;
    final private String personAddress;
    final private int personAge;
    final private Post personPost;

    private NewPerson(Builder builder) {
        this.personName = builder.personName;
        this.personAddress = builder.personAddress;
        this.personAge = builder.personAge;
        this.personPost = builder.personPost;
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

        if (!(obj instanceof NewPerson)){
            return false;
        }

        if (this.getPersonName().equals(((NewPerson) obj).getPersonName())){
            if (this.getPersonAddress().equals(((NewPerson) obj).getPersonAddress())){
                if (this.getPersonAge() == ((NewPerson) obj).getPersonAge()){
                    if (this.getPersonPost() ==((NewPerson) obj).getPersonPost()){
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



    public static class Builder{
        private String personName;
        private String personAddress;
        private int personAge;
        private Post personPost;

        public Builder(){

        }

        public Builder(NewPerson original){
            this.personName = original.personName;
            this.personAddress = original.personAddress;
            this.personAge = original.personAge;
            this.personPost = original.personPost;
        }

        public Builder personName(String name){
            this.personName = name;
            return this;
        }

        public Builder personAddress(String address){
            this.personAddress = address;
            return this;
        }

        public Builder personAge(int age){
            this.personAge = age;
            return this;
        }

        public Builder personPost(Post post){
            this.personPost = post;
            return this;
        }

        public NewPerson build(){
            return new NewPerson(this);
        }
    }

}


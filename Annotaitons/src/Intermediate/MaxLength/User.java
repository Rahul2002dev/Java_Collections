package Intermediate.MaxLength;

public class User {

    @MaxlengthAnnotation(value = 10)
    public String name;

    User(String name) throws NoSuchFieldException{
        MaxlengthAnnotation len = (MaxlengthAnnotation) User.class.getField("name").getAnnotation(MaxlengthAnnotation.class);
        if(name.length() > len.value()){
            throw  new IllegalArgumentException("length limit is execed");
        }

        this.name = name;
    }


    public String getName(){
        return name;
    }

}

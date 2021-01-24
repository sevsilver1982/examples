package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @Expose()
    @SerializedName(value = "FullName", alternate = "full_name")
    private String name;

    @Expose(serialize = false, deserialize = false)
    private String email;

    @Expose()
    private Integer age;

    private transient Boolean isDeveloper;

    public User(String name, String email, Integer age, Boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }

}

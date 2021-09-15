package model;

import android.os.Parcel;
import android.os.Parcelable;

public class dataa implements Parcelable {

    private String name;
    private String age;
    private String address;


    public dataa(String name, String age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected dataa(Parcel in){
        name = in.readString();
        age = in.readString();
        address = in.readString();
    }

    public static final Creator<dataa> CREATOR = new Creator<dataa>() {
        @Override
        public dataa createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public dataa[] newArray(int size) {
            return new dataa[size];
        }
    };

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

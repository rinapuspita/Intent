package id.ac.polinema.intent;

import android.os.Parcel;
import android.os.Parcelable;

class User implements Parcelable {
    private String username;
    private String name;
    private int age;

    public User(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }

    protected User(Parcel in) {
        username = in.readString();
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<model.User> CREATOR = new Creator<model.User>() {
        @Override
        public model.User createFromParcel(Parcel in) {
            return new model.User(in);
        }

        @Override
        public model.User[] newArray(int size) {
            return new model.User[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeInt(age);
    }
}



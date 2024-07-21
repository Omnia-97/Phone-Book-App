package com.example.firebasedemo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
  String userName;
  String phoneNum;
  String groupName;

    public User(String userName, String phoneNum, String groupName) {
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.groupName = groupName;
    }

    public User() {
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
    @Bindable
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        notifyPropertyChanged(BR.phoneNum);
    }
    @Bindable
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
        notifyPropertyChanged(BR.groupName);
    }
}

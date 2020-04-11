package marbala.com.m4muscle.BaseClasses;

/**
 * Created by Mahir on 24/03/2018.
 */

public class BaseModel {
    private Class<?> classType;
    private String model;
    private boolean isEncrypted;

    public Class<?> getClassType() {
        return classType;
    }

    public void setClassType(Class<?> classType) {
        this.classType = classType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    public BaseModel(Class<?> classType, String model, boolean isEncrypted) {
        this.classType = classType;
        this.model = model;
        this.isEncrypted = isEncrypted;
    }
}

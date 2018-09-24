package be.pxl.generics.demoles1;

public class GenericsHolder<T> {
    private T objectToHold;

    public GenericsHolder(){
    }

    public GenericsHolder(T objectToHold){
        this.objectToHold = objectToHold;
    }

    public T getObjectToHold() {
        return objectToHold;
    }

    public void setObjectToHold(T objectToHold) {
        this.objectToHold = objectToHold;
    }
}

package be.pxl.generics.demoles1;

public class Gsm {
    private String serialNu;

    public Gsm(String serialNu) {
        this.serialNu = serialNu;
    }

    public String getSerialNu() {
        return serialNu;
    }

    public void setSerialNu(String serialNu) {
        this.serialNu = serialNu;
    }

    @Override
    public String toString() {
        return "Gsm{" +
                "serialNu='" + serialNu + '\'' +
                '}';
    }
}

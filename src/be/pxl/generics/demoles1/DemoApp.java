package be.pxl.generics.demoles1;

public class DemoApp {
    public static void main(String[] args) {
        Holder holder = new Holder(new Gsm("4545457878dff"));
        // System.out.println(holder.getObject().toString());

        holder = new Holder(new Pint(12.5));

        // System.out.println(holder.getObject());

        //Get GSM instance
        Pint pint = new Pint(0);
        Gsm gsm = new Gsm("");
        if(holder.getObject() instanceof Pint){
             pint = (Pint)holder.getObject();
        }else {
            gsm = (Gsm)holder.getObject();
        }

        //System.out.println(pint.toString() + "\n" + gsm.toString());



        // Generics
        GenericsHolder<Pint> holderOfPints = new GenericsHolder<>();
        holderOfPints.setObjectToHold(new Pint(5));
        Pint pint2 = holderOfPints.getObjectToHold();
        System.out.println(holderOfPints.getObjectToHold());
    }
}

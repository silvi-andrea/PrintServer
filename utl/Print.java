import java.io.InputStream;

public class Print{

    private InputStream in;

    public Print(InputStream in) {
        this.in = in;
    }

    public short int print(){
        try {
            //locate printer
            PrintService printService = PrintServiceLookup.lookupDefaultPrintService();

            //create a print job
            DocPrintJob job = printService.createPrintJob();

            //define the format of print document
            DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

            //print the data
            Doc doc = new SimpleDoc(in, flavor, null);
            job.print(doc, null);

            is.close();
            return 0;

        } catch (Exception e) {
            return e.hashCode();
        }
    }
}

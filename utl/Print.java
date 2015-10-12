import java.io.InputStream;

public class Print{

    private InputStream in;
    private Log logger;

    public Print(InputStream in) {
        this.in = in;
        logger = new Log();
    }

    public InputStream getInputStream(){
        return in;
    }

    public short int print(){
        try {
            //locate printer
            PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
            log.logStat("found system default print service.");
            
            //create a print job
            DocPrintJob job = printService.createPrintJob();
            log.logStat("creating new print job on system default print service.");
            
            //define the format of print document
            DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            log.logStat("detected format ["+flavor+"]");
            
            //print the data
            Doc doc = new SimpleDoc(in, flavor, null);
            job.print(doc, null);

            is.close();
            log.logStat("print was successful!");
            return 0;

        } catch (Exception e) {
            log.logErr(e.hasCode(), "some unexpected error occured, call a monkey wizard to solve the issue, or ask Google.");
            return e.hashCode();
        }
    }
}

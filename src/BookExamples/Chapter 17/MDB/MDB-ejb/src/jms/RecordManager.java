package jms;
import java.sql.Timestamp;
import java.util.ArrayList;

// Referenced classes of package trail.mdb:
//            CalculationRecord

public class RecordManager
{

    public RecordManager()
    {
    }

    public static void addRecord(Timestamp sent, double result)
    {
        if(crs.size() > maxSize)
            crs.remove(0);
        Timestamp processed = new Timestamp(System.currentTimeMillis());
        crs.add(new CalculationRecord(sent, processed, result));
    }

    public static CalculationRecord getRecord(long sent)
    {
        for(int i = 0; i < crs.size(); i++)
        {
            CalculationRecord cr = crs.get(i);
            if(cr.sent.equals(new Timestamp(sent)))
                return cr;
        }

        return null;
    }

    private static ArrayList<CalculationRecord> crs = new ArrayList<CalculationRecord>();
    private static int maxSize = 100;

}
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Converter
{

    public double mph2kph(double mph)
    {
        return mph*1.609;
    } //miles per hour to km per hour

    public double cel2fahr(double celsius)
    {
        return (celsius * 9.0/5.0) + 32.0; //transforming celcious to fahrenheit
    }

    public double p2dol(double pounds)
    {
       return pounds * 1.28398;
    } 

    public double sec2hours(double sec)
    {
        return sec/3600;
    }


    public String mph2kph_printing(double mph)
    {
        // the DecimalFormat is needed to configure the precision (number of decimals)
        // of the double variable when converting to string
        return Double.toString(mph) + " mph = " +
                new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(mph2kph(mph)) + " kph";
    }

    public boolean mph2kph_compare(double mph1, double mph2)
    {
        return mph2kph(mph1) >= mph2kph(mph2);
    }

    public double[] convert_array(String type, double[] values)
    {
        double[] out_values = new double[values.length];
        if (type.equals("mph2kph")) {
            for (int i = 0; i < values.length; i++) {
                out_values[i] = mph2kph(values[i]);
            }
        }
        else if (type.equals("cel2fahr")) {
            for (int i = 0; i < values.length; i++) {
                out_values[i] = cel2fahr(values[i]);
            }
        }
        else if (type.equals("p2dol")) {
            for (int i = 0; i < values.length; i++) {
                out_values[i] = p2dol(values[i]);
            }
        }
        else if (type.equals("sec2hours")) {
            for (int i = 0; i < values.length; i++) {
                out_values[i] = sec2hours(values[i]);
            }
        }
        return out_values;
    }


}



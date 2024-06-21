import com.google.gson.annotations.SerializedName;

public class ConversionRates {
 //   @SerializedName("conversion_rates") Poderia ser feito dessa forma, porém, para manter o cód limpo foi criada a classe moeda.
 //   private ConversionRates conversionRates;
    @SerializedName("USD")
    double usd;
    @SerializedName("ARS")
    double ars;
    @SerializedName("BRL")
    double brl;
    @SerializedName("COP")
    double cop;

//    public ConversionRates getConversionRates() {
//        return conversionRates;
//    }
//
//    public void setConversionRates(ConversionRates conversionRates) {
//        this.conversionRates = conversionRates;
//    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getArs() {
        return ars;
    }

    public void setArs(double ars) {
        this.ars = ars;
    }

    public double getBrl() {
        return brl;
    }

    public void setBrl(double brl) {
        this.brl = brl;
    }

    public double getCop() {
        return cop;
    }

    public void setCop(double cop) {
        this.cop = cop;
    }

    @Override
    public String toString() {
        return "usd:" + usd +
                ", ars:" + ars +
                ", brl:" + brl +
                ", cop:" + cop +
                '}';
    }
}

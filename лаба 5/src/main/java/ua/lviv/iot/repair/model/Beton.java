package ua.lviv.iot.repair.model;

public class Beton extends AbstractMaterials{
    protected String betonBrend;

    public Beton(String materialsBrand,String materialsColor,double priceInUAH,int materialSize,String companyOfManufactures,boolean neededForSockets,String betonBrend){
        super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets);
        this.betonBrend=betonBrend;
    }

    public String getHeaders() {
        return super.getHeaders() + ", betonBrend";
    }

    public String toCSV() {
        return super.toCSV() + ", " +  "betonBrend = " + getBetonBrend();
    }

    private String getBetonBrend() {
        return betonBrend;
    }

    public String betonBrend() {
        return betonBrend;
    }
}

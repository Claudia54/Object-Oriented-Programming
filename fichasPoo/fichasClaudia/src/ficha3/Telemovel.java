public class Telemovel {
    private String marca;
    private String modelo;
    private int x;
    private int y;
    private int dim_fotos_app;
    private int dim_fotos;
    private int dim_app;
    private int espaço;
    private int num_fotos;
    private int appnum_inst;
    private String app_inst;

    public Telemovel(){
        marca ="";
        modelo= "";
        x=0;
        y=0;
        dim_fotos_app =0;
        dim_fotos =0;
        dim_app=0;
        espaço=0;
        num_fotos=0;
        appnum_inst=0;
        app_inst ="";
    }

    public Telemovel(String marca, String modelo, int x, int y, int dim_fotos_app, int dim_fotos, int dim_app, int espaço,
            int num_fotos, int appnum_inst, String app_inst) {
        this.marca = marca;
        this.modelo = modelo;
        this.x = x;
        this.y = y;
        this.dim_fotos_app = dim_fotos_app;
        this.dim_fotos = dim_fotos;
        this.dim_app = dim_app;
        this.espaço = espaço;
        this.num_fotos = num_fotos;
        this.appnum_inst = appnum_inst;
        this.app_inst = app_inst;
    }

    @Override
    public String toString() {
        return "Youtube [app_inst=" + app_inst + ", appnum_inst=" + appnum_inst + ", dim_app=" + dim_app
                + ", dim_fotos=" + dim_fotos + ", dim_fotos_app=" + dim_fotos_app + ", espaço=" + espaço + ", marca="
                + marca + ", modelo=" + modelo + ", num_fotos=" + num_fotos + ", x=" + x + ", y=" + y + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDim_fotos_app() {
        return dim_fotos_app;
    }

    public void setDim_fotos_app(int dim_fotos_app) {
        this.dim_fotos_app = dim_fotos_app;
    }

    public int getDim_fotos() {
        return dim_fotos;
    }

    public void setDim_fotos(int dim_fotos) {
        this.dim_fotos = dim_fotos;
    }

    public int getDim_app() {
        return dim_app;
    }

    public void setDim_app(int dim_app) {
        this.dim_app = dim_app;
    }

    public int getEspaço() {
        return espaço;
    }

    public void setEspaço(int espaço) {
        this.espaço = espaço;
    }

    public int getNum_fotos() {
        return num_fotos;
    }

    public void setNum_fotos(int num_fotos) {
        this.num_fotos = num_fotos;
    }

    public int getAppnum_inst() {
        return appnum_inst;
    }

    public void setAppnum_inst(int appnum_inst) {
        this.appnum_inst = appnum_inst;
    }
 
    public String getApp_inst() {
        return app_inst;
    }

    public void setApp_inst(String app_inst) {
        this.app_inst = app_inst;
    }
    
}

import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "placa")
public class Veiculo
{   
    @DatabaseField(generatedId = true)
    private String cor;
    
    @DatabaseField
    private String placa;
    
    @DatabaseField
    public int passageiro;

//Start GetterSetterExtension Source Code

    /**GET Method Propertie Cor*/
    public String getCor(){
        return this.cor;
    }//end method getCor

    /**SET Method Propertie Cor*/
    public void setCor(String cor){
        this.cor = cor;
    }//end method setId

    /**GET Method Propertie Placa*/
    public String getPlaca(){
        return this.placa;
    }//end method getFullName

    /**SET Method Propertie Placa*/
    public void setPlaca(String placa){
        this.placa = placa;
    }//end method placa

    /**GET Method Propertie Modelo*/
    public int getPassageiro(){
        return this.passageiro;
    }//end method getPassageiro

    /**SET Method Propertie Modelo*/
    public void setPassageiro(int Passageiro){
        this.passageiro = passageiro;
    }//end method setPassageiro


//End GetterSetterExtension Source Code


}//End class

package programadaniel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linha = null;
    private String coluna [] = {"id", "nome", "quantidade","marca","modelo", "numero"};
    
    public ModeloTabela (ArrayList lin, String[] col){
        setLinha(lin);
        setColuna(col);
        
    }
    public ArrayList getLinha(){
        return linha;
    }
    public void setLinha (ArrayList dados){
        linha = dados;
    }
    public String[] getColuna(){
        return coluna;
    }
    public void setColuna (String[] nomes){
        coluna = nomes;  
    }
    public int getColumnCount(){
        return coluna.length;
    }
    public int getRowCount(){
        return linha.size();
    }
    public String getColNome(int numCol){
        return coluna[numCol];
    }
    public Object getValueAt (int numLin, int numCol){
        Object[] linha = (Object[])getLinha().get(numLin);
        return linha[numCol];
    }
    
}

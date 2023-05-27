package org.example.modelo;

import org.example.persistencia.AmdDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaAmd implements TableModel {

    private ArrayList<Amd> datos;
    public static final int COLUMS = 6;
    private AmdDAO adao;

    public ModeloTablaAmd() {
        adao = new AmdDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaAmd(ArrayList<Amd> datos, AmdDAO adao) {
        this.datos = datos;
        this.adao = adao;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Velocidad de Memoria";
            case 3:
                return "Tamano de memoria";
            case 4:
                return "Frecuencia";
            case 5:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Amd tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getVelocidadM();
            case 3:
                return tmp.getTamanoM();
            case 4:
                return tmp.getFrecuencia();
            case 5:
                return tmp.getUrlImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setVelocidadM((int) aValue);
                break;
            case 3:
                datos.get(rowIndex).setTamanoM((int) aValue);
                break;
            case 4:
                datos.get(rowIndex).setFrecuencia((int) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrlImagen((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean eliminarDatos(String index){
        boolean resultado = false;
        try {
            if (adao.delete(index)){
                System.out.println("Ha sido eliminado exitosamente");
                resultado = true;
            }else {
                System.out.println("Error al eliminar");
                System.out.println(index);
                resultado = false;
            }

        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public void cargarDatos(){

        try{
            datos = adao.obtenerTodo();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarAmd(Amd amd){
        boolean resultado = false;

        try{
            if(adao.insertar(amd)){
                datos.add(amd);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

   public Amd getAmdAtIndex(int idx){
        return datos.get(idx);
   }

   public boolean updateAmd(Amd amd) {
       boolean resultado = false;

       try {
           if (adao.update(amd)) {
               System.out.println("Se modifico correctamente");
               resultado = true;
           } else {
               resultado = false;
               System.out.println("No se pudo modificar");
           }
       } catch (SQLException sqle) {
           System.out.println(sqle.getMessage());
       }
        return resultado;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import interfaz.Agregar;
import interfaz.ListadoClientes;
import interfaz.NuevoProducto;
import interfaz.RegistroCliente;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static int[][] pasarDatosMatriz(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) tabla1.getValueAt(i, j);
            }
        }
        return m;
    }

    public static void llenadoTabla(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Producto> productos = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = productos.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(productos.get(i).getNombre(), i, 1);
            tm.setValueAt(productos.get(i).getTipo(), i, 2);
            tm.setValueAt(productos.get(i).getMarca(), i, 3);
            tm.setValueAt(productos.get(i).getUnidades(), i, 4);
            tm.setValueAt(productos.get(i).getGarantia(), i, 5);
            tm.setValueAt(productos.get(i).getGenero(), i, 6);
            tm.setValueAt(productos.get(i).getClasificacion(), i, 7);
            tm.setValueAt(productos.get(i).getPrecio(), i, 8);

        }

    }

    public static void llenadoTabla(JTable tabla, ArrayList<Producto> productos) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = productos.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(productos.get(i).getNombre(), i, 1);
            tm.setValueAt(productos.get(i).getTipo(), i, 2);
            tm.setValueAt(productos.get(i).getMarca(), i, 3);
            tm.setValueAt(productos.get(i).getUnidades(), i, 4);
            tm.setValueAt(productos.get(i).getGarantia(), i, 5);
            tm.setValueAt(productos.get(i).getGenero(), i, 6);
            tm.setValueAt(productos.get(i).getClasificacion(), i, 7);
            tm.setValueAt(productos.get(i).getPrecio(), i, 8);

        }

    }
    
    public static void llenadoProductos(JTable tabla, ArrayList<Producto> productos) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = productos.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(productos.get(i).getNombre(), i, 1);
            tm.setValueAt(productos.get(i).getMarca(), i, 3);
            tm.setValueAt(productos.get(i).getUnidades(), i, 4);
            tm.setValueAt(productos.get(i).getGarantia(), i, 5);
            tm.setValueAt(productos.get(i).getPrecio(), i, 6);
        }

    }

     public static void llenadoProductos(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Producto> productos = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = productos.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(productos.get(i).getNombre(), i, 1);
            tm.setValueAt(productos.get(i).getMarca(), i, 3);
            tm.setValueAt(productos.get(i).getUnidades(), i, 4);
            tm.setValueAt(productos.get(i).getGarantia(), i, 5);
            tm.setValueAt(productos.get(i).getPrecio(), i, 6);
        }

    }

    public static void llenadoTablaClientes(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Persona> personas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = personas.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(personas.get(i).getCedula(), i, 1);
            tm.setValueAt(personas.get(i).getNombre(), i, 2);
            tm.setValueAt(personas.get(i).getApellido(), i, 3);
            tm.setValueAt(personas.get(i).getSexo(), i, 4);
        }

    }

    public static void llenadoTablaClientes(JTable tabla, ArrayList<Persona> personas) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = personas.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(personas.get(i).getCedula(), i, 1);
            tm.setValueAt(personas.get(i).getNombre(), i, 2);
            tm.setValueAt(personas.get(i).getApellido(), i, 3);
            tm.setValueAt(personas.get(i).getSexo(), i, 4);
        }

    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList productos = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                productos.add(p);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return productos;

    }

    public static void volcado(ObjectOutputStream salida, ArrayList productos) {
        for (int i = 0; i < productos.size(); i++) {
            try {
                salida.writeObject(productos.get(i));
            } catch (IOException ex) {
                Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void volcadoClientes(ObjectOutputStream salida, ArrayList personas) {
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void radioButtons(String genero, String ruta, JTable tabla, JRadioButton radiob, JRadioButton radiob2, JRadioButton radiob3) {
        int i;
        Producto p;

        ArrayList<Producto> productos = Helper.traerDatos(ruta);
        i = tabla.getSelectedRow();
        p = productos.get(i);

        genero = p.getGenero();

        if (genero.equalsIgnoreCase("Masculino")) {
            radiob2.setSelected(true);
        }
        if (genero.equalsIgnoreCase("Femenino")) {
            radiob3.setSelected(true);
        }
        if (genero.equalsIgnoreCase("Unisex")) {
            radiob.setSelected(true);
        }
    }

    public static void checkBoxes(String clasificacion, String ruta, JTable tabla, JCheckBox Check, JCheckBox Check2) {
        int i;
        Producto p;

        ArrayList<Producto> productos = Helper.traerDatos(ruta);
        i = tabla.getSelectedRow();
        p = productos.get(i);

        clasificacion = p.getClasificacion();

        if (clasificacion.equalsIgnoreCase("De Consumo")) {
            Check.setSelected(true);
            Check2.setSelected(false);
        }
        if (clasificacion.equalsIgnoreCase("De Negocio")) {
            Check2.setSelected(true);
            Check.setSelected(false);
        }
        if (clasificacion.equalsIgnoreCase("De Consumo y De Negocio")) {
            Check.setSelected(true);
            Check2.setSelected(true);
        }
    }

    public static String getGenero(String genero, JRadioButton radiob, JRadioButton radiob2, JRadioButton radiob3) {

        if (radiob.isSelected()) {
            genero = radiob.getText();
        }
        if (radiob2.isSelected()) {
            genero = radiob2.getText();
        }
        if (radiob3.isSelected()) {
            genero = radiob3.getText();
        }
        return genero;
    }

    public static String getClasificacion(String clasificacion, JCheckBox Check, JCheckBox Check2) {

        if (Check.isSelected()) {
            clasificacion = Check.getText();
        }
        if (Check2.isSelected()) {
            clasificacion = Check2.getText();
        }
        if (Check.isSelected() && Check2.isSelected()) {
            clasificacion = Check.getText() + " y " + Check2.getText();
        }
        return clasificacion;
    }

    public static void mercancia(JTable tabla, String ruta, String tipo, String marca, String garantia, String genero, String clasificacion) {
        ArrayList<Producto> productos = traerDatos(ruta);
        ArrayList<Producto> productosFiltro = new ArrayList();

        for (int i = 0; i < productos.size(); i++) {
       
            if (productos.get(i).getTipo().equalsIgnoreCase(tipo)) {
                productosFiltro.add(productos.get(i));
            }
            if (productos.get(i).getMarca().equals(marca)) {
                productosFiltro.add(productos.get(i));
            }
            if (productos.get(i).getGarantia().equals(garantia)) {
                productosFiltro.add(productos.get(i));
            }
            if (productos.get(i).getGenero().equals(genero)) {
                productosFiltro.add(productos.get(i));
            }
            if (productos.get(i).getClasificacion().equals(clasificacion)) {
                productosFiltro.add(productos.get(i));
            }
        }
        llenadoTabla(tabla, productosFiltro);
    }

    public static void ListadoClientes(JTable tabla, String ruta, String cedula) {
        ArrayList<Persona> personas = traerDatos(ruta);
        ArrayList<Persona> personasFiltro = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCedula().equals(cedula)) {
                personasFiltro.add(personas.get(i));
            }

        }

        llenadoTablaClientes(tabla, personasFiltro);
    }

    public static void mercancia1(JTable tabla, String ruta, String nombre) {
        ArrayList<Producto> productos = traerDatos(ruta);
        ArrayList<Producto> productoFiltro = new ArrayList();
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                productoFiltro.add(productos.get(i));
            }
        }

        llenadoProductos(tabla, productoFiltro);
    }

     
     
}

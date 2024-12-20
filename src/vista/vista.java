package vista;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class vista extends javax.swing.JFrame {
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private DefaultTableModel tableModel;
    private List<Militar> militares;
    private JPopupMenu popupMenu;
    private JTable jTable1;
    private JButton jButton; // Declare jButton
    

    public vista() {
        militares = new ArrayList<>();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanel jPanel2 = new javax.swing.JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        JButton jButton5 = new javax.swing.JButton();
        JButton jButton4 = new javax.swing.JButton();
        JButton jButton3 = new javax.swing.JButton();
        JButton jButton2 = new javax.swing.JButton();
        JButton jButton1 = new javax.swing.JButton();
        JButton jButton6 = new javax.swing.JButton(); // Nuevo botón
        JLabel jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        

        // Configuración de la tabla
        tableModel = new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Nombre", "Rango", "Identificacion"
            }
        );
        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

    
        // El popup funciona siempre y cuando existan militares en la tabla ;)
        popupMenu = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("Copiar");
        JMenuItem pasteItem = new JMenuItem("Pegar");
        JMenuItem cutItem = new JMenuItem("Cortar");
        
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        popupMenu.add(cutItem);

        // Add mouse listener to show popup menu
        jTable1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            private void showPopup(MouseEvent e) {
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        

        
        jButton5.setText("Resetear información");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar militares");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar militares");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar militar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear militar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Mostrar nombres y agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("GESTION MILITAR");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addGap(18, 18, 18)
                    .addComponent(jButton2)
                    .addGap(18, 18, 18)
                    .addComponent(jButton3)
                    .addGap(18, 18, 18)
                    .addComponent(jButton4)
                    .addGap(18, 18, 18)
                    .addComponent(jButton5)
                    .addGap(18, 18, 18)
                    .addComponent(jButton6)
                    .addContainerGap(32, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
        );

        jTabbedPane1.addTab("Gestion de soldados", jPanel2);

        JPanel tareasPanel = new JPanel(new BorderLayout());

        JPanel botonesPanel = new JPanel();
        JButton asignarTareaButton = new JButton("Asignar tarea");
        asignarTareaButton.addActionListener(evt -> asignarTarea());
        JButton graficarButton = new JButton("Generar gráfico");
        graficarButton.addActionListener(evt -> mostrarGrafico(tareasPanel));

        botonesPanel.add(asignarTareaButton);
        botonesPanel.add(graficarButton);

        tareasPanel.add(botonesPanel, BorderLayout.NORTH);

        jTabbedPane1.addTab("Asignar", tareasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
        );


        pack();
    }

    private void mostrarGrafico(JPanel panel) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Map<String, Integer> tareasCount = new HashMap<>();
        for (Militar militar : militares) {
            String tarea = militar.getTarea();
            if (!tarea.isEmpty()) {
                tareasCount.put(tarea, tareasCount.getOrDefault(tarea, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : tareasCount.entrySet()) {
            dataset.addValue(entry.getValue(), "Soldados", entry.getKey());
        }

        JFreeChart barChart = ChartFactory.createBarChart(
            "Misiones Asignadas", "Tarea", "Cantidad de Soldados", dataset);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(500, 300));

        panel.removeAll();
        panel.add(chartPanel, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();


    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );


        // Panel tab1 para regañar y asignar tareas
        JPanel tab1Panel = new JPanel();
        JButton regañarButton = new JButton("Regañar Militar");
        regañarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                regañarMilitar();
            }
        });

        JButton asignarTareasButton = new JButton("Asignar tarea");
        asignarTareasButton.addActionListener(evt -> asignarTarea());

        tab1Panel.add(regañarButton);
        tab1Panel.add(asignarTareasButton);

        ((JTabbedPane) jTabbedPane1).addTab("Gestionar tareas", tab1Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
        );

        pack();
    }

    private void copiar() {
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        if (row != -1 && col != -1) {
            String value = (String) jTable1.getValueAt(row, col);
            StringSelection stringSelection = new StringSelection(value);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }

    private void pegar() {
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        if (row != -1 && col != -1) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            try {
                String value = (String) clipboard.getData(DataFlavor.stringFlavor);
                jTable1.setValueAt(value, row, col);
            } catch (UnsupportedFlavorException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para regañar a un soldado y bajar su rango
    private void regañarMilitar() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del militar a regañar:");
        if (id != null) {
            for (Militar militar : militares) {
                if (militar.getIdentificacion().equals(id)) {
                    militar.reducirRango();
                    JOptionPane.showMessageDialog(this, "El rango del militar ha sido reducido.");
                    actualizarTabla();  // Actualiza la tabla para reflejar el cambio
                    // Si el rango es "Soldado Raso", eliminarlo de la lista
                    if ("Soldado Raso".equals(militar.getRango())) {
                        militares.remove(militar);
                        actualizarTabla(); // Actualiza la tabla después de la eliminación
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Militar no encontrado");
        }
    }

    // Método para asignar tarea a un soldado
    private void asignarTarea() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del militar para asignar tarea:");
        if (id != null) {
            for (Militar militar : militares) {
                if (militar.getIdentificacion().equals(id)) {
                    String tarea = JOptionPane.showInputDialog("Ingrese la tarea a asignar:");
                    if (tarea != null) {
                        militar.setTarea(tarea);
                        JOptionPane.showMessageDialog(this, "Tarea asignada: " + tarea);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Militar no encontrado");
        }
    }

    // Método para asignar rango según el número ingresado
    private String obtenerRango(int numero) {
        switch (numero) {
            case 1: return "Soldado Raso";
            case 2: return "Teniente";
            case 3: return "Capitán";
            case 4: return "Coronel";
            default: return "Rango Desconocido";
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del militar:");
        int rangoNum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango (1=Soldado Raso, 2=Teniente, 3=Capitán, 4=Coronel):"));
        String rango = obtenerRango(rangoNum);
        String id = JOptionPane.showInputDialog("Ingrese la identificación:");

        Militar militar = new Militar(nombre, rango, id);
        militares.add(militar);

        tableModel.addRow(new Object[]{nombre, rango, id});
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        String id = JOptionPane.showInputDialog("Ingrese la identificación del militar:");
        if (id != null) {
            for (Militar militar : militares) {
                if (militar.getIdentificacion().equals(id)) {
                    JOptionPane.showMessageDialog(this, militar.toString());
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Militar no encontrado");
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        actualizarTabla();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        String id = JOptionPane.showInputDialog("Ingrese la identificación del militar a eliminar:");
        if (id != null) {
            for (Militar militar : militares) {
                if (militar.getIdentificacion().equals(id)) {
                    militares.remove(militar);
                    actualizarTabla();
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Militar no encontrado");
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        militares.clear();
        actualizarTabla();
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        // Mostrar nombres y agregar militares
        for (Militar militar : militares) {
            JOptionPane.showMessageDialog(this, "Nombre: " + militar.getNombre() + " - Rango: " + militar.getRango());
        }
    }

    private void actualizarTabla() {
        tableModel.setRowCount(0);  // Limpiar la tabla antes de actualizarla
        for (Militar militar : militares) {
            tableModel.addRow(new Object[]{militar.getNombre(), militar.getRango(), militar.getIdentificacion()});
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new vista().setVisible(true);
        });
    }
}

class Militar {
    private String nombre;
    private String rango;
    private String identificacion;
    private String tarea;

    public Militar(String nombre, String rango, String identificacion) {
        this.nombre = nombre;
        this.rango = rango;
        this.identificacion = identificacion;
        this.tarea = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void reducirRango() {
        switch (rango) {
            case "Coronel":
                rango = "Capitán";
                break;
            case "Capitán":
                rango = "Teniente";
                break;
            case "Teniente":
                rango = "Soldado Raso";
                break;
            case "Soldado Raso":
                break;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRango: " + rango + "\nIdentificación: " + identificacion + "\nTarea: " + tarea;
    }
}

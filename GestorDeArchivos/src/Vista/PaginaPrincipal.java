
package Vista;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;//libreria para usar la clase ImageIcon
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;//libreria para usar Jlabel
import javax.swing.JOptionPane;
import Modelo.Archivos;
import Modelo.MostrarImage;
import Modelo.RepMusica;
import Modelo.RepVideo;
import javafx.scene.media.Media;
import javax.swing.table.DefaultTableModel; // importación para el modelo de la tabla
    

public final class PaginaPrincipal extends javax.swing.JFrame {
    
    
        // Configurar el modelo de la tabla1 para musica
        DefaultTableModel modeloT = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Artista", "Álbum", "Género", "Duración Seg", "Año", "Ruta", "Tamaño (MB)"}, 
            0
        );
        
        //Configurar el modelo de la tabla para la musica repetida
        DefaultTableModel modeloMusicaR = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Artista", "Álbum", "Género", "Duración Seg", "Año", "Ruta", "Tamaño (MB)"}, 
            0
        );
        
        // Configurar el modelo de la tableVideo
        DefaultTableModel modeloVideo = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Duración Seg", "Ruta", "Tamaño (MB)"}, 
            0
        );
        
        //Configurar el modelo de la tabla para videos repetidos
        DefaultTableModel modeloVideoR = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Duración Seg", "Ruta", "Tamaño (MB)"}, 
            0
        );
        
        
        // Configurar el modelo de la tableImagen
        DefaultTableModel modeloImagen = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Ruta", "Fecha de creación", "Fecha de modificación", "Tamaño (MB)", "Aparato", "Modelo"}, 
            0
        );
        
        // Configurar el modelo de las images repetidas
        DefaultTableModel modeloImagenR = new DefaultTableModel(
            new Object[]{"Nombre", "Extensión", "Ruta", "Fecha de creación", "Fecha de modificación", "Tamaño (MB)", "Aparato", "Modelo"}, 
            0
        );
        
        File[] archivoSeleccionado;// declaración de una variable global para poder utlizarla en otros metodos del JFrame
        private RepMusica cancion;
        
        
    public PaginaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        cancion = new RepMusica(""); // Inicializar con una ruta vacía
        
        //Modelos de las tablas
        jTable1.setModel(modeloT);
        tableVideos.setModel(modeloVideo);
        tableImagen.setModel(modeloImagen);
        tableRepetidosMusica.setModel(modeloMusicaR);
        tableRepetidosVid.setModel(modeloVideoR);
        tableRepetidosImg.setModel(modeloImagenR);
        
        //No mostar mis txt para pruebas
        txtPrueba.setVisible(false);
        txtPruebaVid.setVisible(false);
        txtPrueba3.setVisible(false);
        
         //Imagenes de botones
         btnReproducir.setIcon(setIcono("/Imagenes/video.png/",btnReproducir));
         btnReproducirVid.setIcon(setIcono("/Imagenes/video.png/",btnReproducirVid));
         btnMostrarImg.setIcon(setIcono("/Imagenes/video.png/",btnMostrarImg));
         btnCrearPlaylist.setIcon(setIcono("/Imagenes/musica.png/",btnCrearPlaylist));
         btnEliminarCancion.setIcon(setIcono("/Imagenes/eliminar1.png/",btnEliminarCancion));
         btnEliminarVid.setIcon(setIcono("/Imagenes/eliminar1.png/",btnEliminarVid));
         btnEliminarImg.setIcon(setIcono("/Imagenes/eliminar1.png/",btnEliminarImg));
         btnDetenerCancion.setIcon(setIcono("/Imagenes/stop-button.png/",btnDetenerCancion));
        
         
         //Cambio de tamaño del boton
         btnReproducir.setPressedIcon(setIconoPresionado("/Imagenes/video.png/", btnReproducir,1,1));
         btnReproducirVid.setPressedIcon(setIconoPresionado("/Imagenes/video.png/", btnReproducirVid,1,1));
         btnMostrarImg.setPressedIcon(setIconoPresionado("/Imagenes/video.png/", btnMostrarImg,1,1));
         btnCrearPlaylist.setPressedIcon(setIconoPresionado("/Imagenes/musica.png/",btnCrearPlaylist,1,1));
         btnEliminarCancion.setPressedIcon(setIconoPresionado("/Imagenes/eliminar.png/",btnEliminarCancion,1,1));
         btnEliminarVid.setPressedIcon(setIconoPresionado("/Imagenes/eliminar.png/",btnEliminarVid,1,1));
         btnEliminarImg.setPressedIcon(setIconoPresionado("/Imagenes/eliminar.png/",btnEliminarImg,1,1));
         btnDetenerCancion.setPressedIcon(setIconoPresionado("/Imagenes/stop-button.png/",btnDetenerCancion,1,1));
         
         
         //Imagenes de labels
         SetImageLabel(lblCarpeta,"/Imagenes/carpeta1.png/");
         SetImageLabel(lblAgregarRuta,"/Imagenes/anadir1.png/");
         SetImageLabel(lblMusica,"/Imagenes/multimedia1.png/");
         SetImageLabel(lblImagen,"/Imagenes/galeria-de-imagenes1.png/");
         SetImageLabel(lblDuplicados,"/Imagenes/duplicar1.png/");
         SetImageLabel(lblVideo,"/Imagenes/clapperboard.png/");
         
         
         //SetImageLabel(lblMostrarImagen, "/Imágenes/Capturas de pantalla/Captura de pantalla (1).png/");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCarpeta = new javax.swing.JLabel();
        btnAgregarRuta = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        btnVideo = new javax.swing.JButton();
        btnDuplicados = new javax.swing.JButton();
        lblAgregarRuta = new javax.swing.JLabel();
        lblMusica = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblDuplicados = new javax.swing.JLabel();
        txtPrueba = new javax.swing.JTextField();
        txtPruebaVid = new javax.swing.JTextField();
        btnImagenes = new javax.swing.JButton();
        lblVideo = new javax.swing.JLabel();
        txtPrueba3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblGestorPro = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVideos = new javax.swing.JTable();
        btnReproducirVid = new javax.swing.JButton();
        txtRuta2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadArchivosVideo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDuplicadosVideo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTamañoDuplicadosVideo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPesoTotalVideo = new javax.swing.JTextField();
        btnEliminarVid = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReproducir = new javax.swing.JButton();
        btnEliminarCancion = new javax.swing.JButton();
        btnCrearPlaylist = new javax.swing.JButton();
        txtCantidadArchivosMusica = new javax.swing.JTextField();
        txtDuplicadosMusica = new javax.swing.JTextField();
        txtPesoTotalMusica = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTamañoDuplicadosMusica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDetenerCancion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableImagen = new javax.swing.JTable();
        btnMostrarImg = new javax.swing.JButton();
        btnEliminarImg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtRuta3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPesoTotalImg = new javax.swing.JTextField();
        txtTamañoDuplicadosImg = new javax.swing.JTextField();
        txtDuplicadosImg = new javax.swing.JTextField();
        txtCantidadArchivosImg = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblMostrarImagen = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableRepetidosMusica = new javax.swing.JTable();
        btnImagenesDup = new javax.swing.JButton();
        btnVideoDup = new javax.swing.JButton();
        btnMusicaDup = new javax.swing.JButton();
        btnEliminarMusicaDup = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtRutaDupMusica1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTamañoDuplicadosMusica1 = new javax.swing.JTextField();
        txtDuplicadosMusica1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnImagenesDup1 = new javax.swing.JButton();
        btnVideoDup1 = new javax.swing.JButton();
        btnMusicaDup1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableRepetidosVid = new javax.swing.JTable();
        btnEliminarVidDup = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtRutaDupVideo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDuplicadosVideo1 = new javax.swing.JTextField();
        txtTamañoDuplicadosVideo1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnImagenesDup2 = new javax.swing.JButton();
        btnVideoDup2 = new javax.swing.JButton();
        btnMusicaDup2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableRepetidosImg = new javax.swing.JTable();
        btnEliminarImgDup = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtRutaDupImg1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDuplicadosImg1 = new javax.swing.JTextField();
        txtTamañoDuplicadosImg1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 227, 207));

        btnAgregarRuta.setBackground(new java.awt.Color(187, 34, 51));
        btnAgregarRuta.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnAgregarRuta.setForeground(new java.awt.Color(250, 227, 207));
        btnAgregarRuta.setText("Agregar Ruta");
        btnAgregarRuta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAgregarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRutaActionPerformed(evt);
            }
        });

        btnMusica.setBackground(new java.awt.Color(187, 34, 51));
        btnMusica.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnMusica.setForeground(new java.awt.Color(250, 227, 207));
        btnMusica.setText("Música ");
        btnMusica.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });

        btnVideo.setBackground(new java.awt.Color(187, 34, 51));
        btnVideo.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnVideo.setForeground(new java.awt.Color(250, 227, 207));
        btnVideo.setText("Video");
        btnVideo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoActionPerformed(evt);
            }
        });

        btnDuplicados.setBackground(new java.awt.Color(187, 34, 51));
        btnDuplicados.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnDuplicados.setForeground(new java.awt.Color(250, 227, 207));
        btnDuplicados.setText("Mostrar Duplicados");
        btnDuplicados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDuplicados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuplicadosActionPerformed(evt);
            }
        });

        btnImagenes.setBackground(new java.awt.Color(187, 34, 51));
        btnImagenes.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnImagenes.setForeground(new java.awt.Color(250, 227, 207));
        btnImagenes.setText("Imagenes");
        btnImagenes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImagenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAgregarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDuplicados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDuplicados, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPruebaVid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrueba3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgregarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnDuplicados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDuplicados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPruebaVid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrueba3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 230, 730));

        jPanel1.setBackground(new java.awt.Color(187, 34, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestorPro.setFont(new java.awt.Font("Geomanist Black", 1, 48)); // NOI18N
        lblGestorPro.setForeground(new java.awt.Color(250, 227, 207));
        lblGestorPro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestorPro.setText("GESTOR PRO");
        lblGestorPro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblGestorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 870, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 880, 130));

        tableVideos.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        tableVideos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Duración", "Ruta", "Tamaño"
            }
        ));
        tableVideos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVideosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableVideos);

        btnReproducirVid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReproducirVid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReproducirVidMouseClicked(evt);
            }
        });

        txtRuta2.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel7.setText("Ruta:");

        jLabel8.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad de archivos");

        txtCantidadArchivosVideo.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel9.setText("Archivos Duplicados");

        txtDuplicadosVideo.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel10.setText("Tamaño Total Duplicados");

        txtTamañoDuplicadosVideo.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel11.setText("Tamaño Total de Archivos");

        txtPesoTotalVideo.setEditable(false);

        btnEliminarVid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarVidMouseClicked(evt);
            }
        });
        btnEliminarVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReproducirVid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarVid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 426, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTamañoDuplicadosVideo)
                                    .addComponent(txtCantidadArchivosVideo)
                                    .addComponent(txtDuplicadosVideo)
                                    .addComponent(txtPesoTotalVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addComponent(jScrollPane2)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnReproducirVid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarVid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRuta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadArchivosVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesoTotalVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setToolTipText("");
        jPanel4.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Artista", "Albúm", "Género", "Duración", "Año", "Ruta", "Tamaño"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Extensión");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Artista");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Albúm");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Género");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Duración");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Año");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Ruta");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Tamaño");
        }

        btnReproducir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReproducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReproducirMouseClicked(evt);
            }
        });

        btnEliminarCancion.setToolTipText("");
        btnEliminarCancion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCancionActionPerformed(evt);
            }
        });

        btnCrearPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtCantidadArchivosMusica.setEditable(false);

        txtDuplicadosMusica.setEditable(false);

        txtPesoTotalMusica.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad de archivos");

        jLabel3.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel3.setText("Archivos Duplicados");

        jLabel4.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel4.setText("Tamaño Total de Archivos");

        txtTamañoDuplicadosMusica.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel5.setText("Tamaño Total Duplicados");

        btnDetenerCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerCancionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel6.setText("Ruta:");

        txtRuta.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnCrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDetenerCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTamañoDuplicadosMusica, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtCantidadArchivosMusica)
                            .addComponent(txtDuplicadosMusica)
                            .addComponent(txtPesoTotalMusica)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadArchivosMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesoTotalMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarCancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDetenerCancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        tableImagen.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        tableImagen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Ruta", "Fecha de cración", "Fecha de modificación", "Tamaño MB", "Aparato", "Modelo"
            }
        ));
        tableImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableImagenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableImagen);

        btnMostrarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarImgActionPerformed(evt);
            }
        });

        btnEliminarImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarImgMouseClicked(evt);
            }
        });
        btnEliminarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImgActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel12.setText("Ruta:");

        txtRuta3.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad de archivos");

        jLabel14.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel14.setText("Archivos Duplicados");

        jLabel15.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel15.setText("Tamaño Total Duplicados");

        jLabel16.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel16.setText("Tamaño Total de Archivos");

        txtPesoTotalImg.setEditable(false);

        txtTamañoDuplicadosImg.setEditable(false);

        txtDuplicadosImg.setEditable(false);

        txtCantidadArchivosImg.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTamañoDuplicadosImg)
                            .addComponent(txtCantidadArchivosImg)
                            .addComponent(txtDuplicadosImg)
                            .addComponent(txtPesoTotalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtRuta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadArchivosImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesoTotalImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMostrarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        tableRepetidosMusica.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        tableRepetidosMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tableRepetidosMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRepetidosMusicaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableRepetidosMusica);

        btnImagenesDup.setBackground(new java.awt.Color(187, 34, 51));
        btnImagenesDup.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnImagenesDup.setForeground(new java.awt.Color(250, 227, 207));
        btnImagenesDup.setText("Imagenes");
        btnImagenesDup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImagenesDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagenesDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesDupActionPerformed(evt);
            }
        });

        btnVideoDup.setBackground(new java.awt.Color(187, 34, 51));
        btnVideoDup.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnVideoDup.setForeground(new java.awt.Color(250, 227, 207));
        btnVideoDup.setText("Video");
        btnVideoDup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVideoDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVideoDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoDupActionPerformed(evt);
            }
        });

        btnMusicaDup.setBackground(new java.awt.Color(187, 34, 51));
        btnMusicaDup.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnMusicaDup.setForeground(new java.awt.Color(250, 227, 207));
        btnMusicaDup.setText("Música ");
        btnMusicaDup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMusicaDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusicaDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaDupActionPerformed(evt);
            }
        });

        btnEliminarMusicaDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarMusicaDup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMusicaDupMouseClicked(evt);
            }
        });
        btnEliminarMusicaDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMusicaDupActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel17.setText("Ruta:");

        txtRutaDupMusica1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel18.setText("Tamaño Total Duplicados");

        txtTamañoDuplicadosMusica1.setEditable(false);

        txtDuplicadosMusica1.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel19.setText("Archivos Duplicados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnEliminarMusicaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRutaDupMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTamañoDuplicadosMusica1)
                                    .addComponent(txtDuplicadosMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnImagenesDup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnVideoDup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnMusicaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagenesDup, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVideoDup, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusicaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarMusicaDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtRutaDupMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosMusica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        btnImagenesDup1.setBackground(new java.awt.Color(187, 34, 51));
        btnImagenesDup1.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnImagenesDup1.setForeground(new java.awt.Color(250, 227, 207));
        btnImagenesDup1.setText("Imagenes");
        btnImagenesDup1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImagenesDup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagenesDup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesDup1ActionPerformed(evt);
            }
        });

        btnVideoDup1.setBackground(new java.awt.Color(187, 34, 51));
        btnVideoDup1.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnVideoDup1.setForeground(new java.awt.Color(250, 227, 207));
        btnVideoDup1.setText("Video");
        btnVideoDup1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVideoDup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVideoDup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoDup1ActionPerformed(evt);
            }
        });

        btnMusicaDup1.setBackground(new java.awt.Color(187, 34, 51));
        btnMusicaDup1.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnMusicaDup1.setForeground(new java.awt.Color(250, 227, 207));
        btnMusicaDup1.setText("Música ");
        btnMusicaDup1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMusicaDup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusicaDup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaDup1ActionPerformed(evt);
            }
        });

        tableRepetidosVid.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        tableRepetidosVid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableRepetidosVid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRepetidosVidMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableRepetidosVid);

        btnEliminarVidDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVidDup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarVidDupMouseClicked(evt);
            }
        });
        btnEliminarVidDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVidDupActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel20.setText("Ruta:");

        txtRutaDupVideo1.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel21.setText("Archivos Duplicados");

        txtDuplicadosVideo1.setEditable(false);

        txtTamañoDuplicadosVideo1.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel22.setText("Tamaño Total Duplicados");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnEliminarVidDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRutaDupVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTamañoDuplicadosVideo1)
                                    .addComponent(txtDuplicadosVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnImagenesDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnVideoDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnMusicaDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagenesDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVideoDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusicaDup1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarVidDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtRutaDupVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel9);

        btnImagenesDup2.setBackground(new java.awt.Color(187, 34, 51));
        btnImagenesDup2.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnImagenesDup2.setForeground(new java.awt.Color(250, 227, 207));
        btnImagenesDup2.setText("Imagenes");
        btnImagenesDup2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImagenesDup2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagenesDup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesDup2ActionPerformed(evt);
            }
        });

        btnVideoDup2.setBackground(new java.awt.Color(187, 34, 51));
        btnVideoDup2.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnVideoDup2.setForeground(new java.awt.Color(250, 227, 207));
        btnVideoDup2.setText("Video");
        btnVideoDup2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVideoDup2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVideoDup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoDup2ActionPerformed(evt);
            }
        });

        btnMusicaDup2.setBackground(new java.awt.Color(187, 34, 51));
        btnMusicaDup2.setFont(new java.awt.Font("Geomanist Black", 1, 12)); // NOI18N
        btnMusicaDup2.setForeground(new java.awt.Color(250, 227, 207));
        btnMusicaDup2.setText("Música ");
        btnMusicaDup2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMusicaDup2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusicaDup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaDup2ActionPerformed(evt);
            }
        });

        tableRepetidosImg.setFont(new java.awt.Font("Geomanist Book", 0, 12)); // NOI18N
        tableRepetidosImg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tableRepetidosImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRepetidosImgMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableRepetidosImg);

        btnEliminarImgDup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarImgDup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarImgDupMouseClicked(evt);
            }
        });
        btnEliminarImgDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImgDupActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Geomanist Bold", 0, 14)); // NOI18N
        jLabel23.setText("Ruta:");

        txtRutaDupImg1.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel24.setText("Archivos Duplicados");

        txtDuplicadosImg1.setEditable(false);

        txtTamañoDuplicadosImg1.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Geomanist Book", 1, 14)); // NOI18N
        jLabel25.setText("Tamaño Total Duplicados");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnEliminarImgDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRutaDupImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDuplicadosImg1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(txtTamañoDuplicadosImg1))
                                .addGap(361, 361, 361))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnImagenesDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnVideoDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnMusicaDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagenesDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVideoDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusicaDup2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarImgDup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtRutaDupImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuplicadosImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamañoDuplicadosImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 880, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //funcionalidad de los botones
    private void btnAgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRutaActionPerformed
       /* Ruta ruta = new Ruta();//Creamos un objeto de tipo Ruta (ventana donde esta el selector de archivos)
        ruta.setDefaultCloseOperation(PaginaPrincipal.DISPOSE_ON_CLOSE);//Esto permite que, al cerrar la ventana secundaria, no se cierre la ventana principal
        ruta.setVisible(true);//Hace que la ventana sea visible*/
       
        JFileChooser jFileChooser1 = new JFileChooser();
        jFileChooser1.setMultiSelectionEnabled(true); // Permitir seleccionar múltiples archivos
        jFileChooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//filtro que nos permite elegir que es lo que se selecciona
        int respuesta = jFileChooser1.showOpenDialog(null);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
            
            
            File nombre = jFileChooser1.getSelectedFile();
            archivoSeleccionado = jFileChooser1.getSelectedFiles();
            
            
            String[] extensiones = {".mp3", ".wma", ".flv"}; //Declaración de extensiones para música
            modeloT.setRowCount(0); // Limpiar datos anteriores
            
            String[] extensionesVid = {".mp4"}; //Declaración de extensiones para videos
            modeloVideo.setRowCount(0); // Limpiar datos anteriores
            
           String[] extensionesImg = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
           modeloImagen.setRowCount(0);
            
            //objeto para la musica 
            Archivos archivoMusica = new Archivos(archivoSeleccionado);
            double tamanioByte = archivoMusica.tamanioArchivos(archivoSeleccionado, extensiones);
            double tamanioGB = tamanioByte / (1024 * 1024 * 1024);//Convierte el tamaño a GB
               
            long cantidad = 0;
            double tamanioByte1 = 0;
            double tamanioGB1 = 0;
            long cantidadDup = 0;
            
            //objeto para video
            RepVideo archivoVideo = new RepVideo(archivoSeleccionado);
            double tamanioByteVid = archivoVideo.tamanioArchivos(archivoSeleccionado, extensionesVid);
            double tamanioGBVid = tamanioByteVid / (1024 * 1024 * 1024);//Convierte el tamaño a GB
               
            long cantidadVid = 0;
            double tamanioByteVid1 = 0;
            double tamanioGBVid1 = 0;
            long cantidadDupVid = 0;
            
            //objeto para imagen
           MostrarImage archivoImg = new MostrarImage(archivoSeleccionado);
           double tamanioByteImg = archivoImg.tamanioArchivos(archivoSeleccionado, extensionesImg);
           double tamanioGBImg = tamanioByteImg / (1024 * 1024 * 1024);//Convierte el tamaño a GB
            
            long cantidadImg = 0;
            double tamanioByteImg1 = 0;
            double tamanioGBImg1 = 0;
            long cantidadDupImg = 0;
            
               
            //bucle para entrar a los archivos
            for(File archivo : archivoSeleccionado){
                //declaración para musica
                cantidad = archivoMusica.contarArchivo(archivo, extensiones);
                tamanioByte1 = archivoMusica.tamanioArchivosDuplicados(archivo, extensiones);
                cantidadDup = archivoMusica.archivosDuplicados(archivo, extensiones);
                archivoMusica.mostrarArchivosMusica(archivo, modeloT, extensiones);//Meter los datos en bucle al JTable
                
                //declaración para video
                cantidadVid = archivoVideo.contarArchivo(archivo, extensionesVid);
                tamanioByteVid1 = archivoVideo.tamanioArchivosDuplicados(archivo, extensionesVid);
                cantidadDupVid = archivoVideo.archivosDuplicados(archivo, extensionesVid);
                archivoVideo.mostrarArchivoVideo(archivo, modeloVideo, extensionesVid);
                
                //declaración para imagen
                cantidadImg = archivoImg.contarArchivo(archivo, extensionesImg);
                tamanioByteImg1 = archivoImg.tamanioArchivosDuplicados(archivo, extensionesImg);
                cantidadDupImg = archivoImg.archivosDuplicados(archivo, extensionesImg);
                archivoImg.mostrarArchivoImagen(archivo, modeloImagen, extensionesImg);
            }
            tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);
            tamanioGBVid1 = tamanioByteVid1 / (1024 * 1024 * 1024);
            tamanioGBImg1 = tamanioByteImg1 / (1024 * 1024 * 1024);
            
            if(nombre == null || nombre.getName().equals("")){
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
            }
            else{
                
                 //mostrar txt de música
                txtRuta.setText(nombre.getAbsolutePath());
                txtPesoTotalMusica.setText(String.format("%.2f GB" , tamanioGB));
                txtDuplicadosMusica.setText(String.valueOf(cantidadDup));
                txtTamañoDuplicadosMusica.setText(String.format("%.2f GB" , tamanioGB1));
                txtCantidadArchivosMusica.setText(String.valueOf(cantidad));
                txtDuplicadosMusica1.setText(String.valueOf(cantidadDup));
                txtTamañoDuplicadosMusica1.setText(String.format("%.2f GB" , tamanioGB1));
                
                //mostrar txt de video
                txtRuta2.setText(nombre.getAbsolutePath());
                txtPesoTotalVideo.setText(String.format("%.2f GB" , tamanioGBVid));
                txtDuplicadosVideo.setText(String.valueOf(cantidadDupVid));
                txtTamañoDuplicadosVideo.setText(String.format("%.2f GB" , tamanioGBVid1));
                txtCantidadArchivosVideo.setText(String.valueOf(cantidadVid));
                txtDuplicadosVideo1.setText(String.valueOf(cantidadDupVid));
                txtTamañoDuplicadosVideo1.setText(String.format("%.2f GB" , tamanioGBVid1));
                lblGestorPro.setText("VIDEO");
                
                //mostrar txt Imagen
                txtRuta3.setText(nombre.getAbsolutePath());
                txtPesoTotalImg.setText(String.format("%.2f GB" , tamanioGBImg));
                txtDuplicadosImg.setText(String.valueOf(cantidadDupImg));
                txtTamañoDuplicadosImg.setText(String.format("%.2f GB" , tamanioGBImg1));
                txtCantidadArchivosImg.setText(String.valueOf(cantidadImg));
                txtDuplicadosImg1.setText(String.valueOf(cantidadDupImg));
                txtTamañoDuplicadosImg1.setText(String.format("%.2f GB" , tamanioGBImg1));
                
            }
        }
    }//GEN-LAST:event_btnAgregarRutaActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
       jTabbedPane1.setSelectedIndex(1);//No manda a la pestaña 2 del tabbedPane
       lblGestorPro.setText("MÚSICA");
    }//GEN-LAST:event_btnMusicaActionPerformed

    private void btnVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoActionPerformed
        jTabbedPane1.setSelectedIndex(0);//No manda a la pestaña 1 del tabbedPane
        lblGestorPro.setText("VIDEO");
    }//GEN-LAST:event_btnVideoActionPerformed

    private void btnDetenerCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerCancionActionPerformed
        cancion.pararAudio();
    }//GEN-LAST:event_btnDetenerCancionActionPerformed
    
    //Boton para eliminar musica
    private void btnEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCancionActionPerformed
        if(!"".equals(txtPrueba.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null,"Esta seguro de que quiere eliminar esta canción?");
            if(pregunta == 0){
                Archivos archivoMusica = new Archivos(archivoSeleccionado);
                archivoMusica.eliminarArchivo(txtPrueba);
                
                //Métodos para actualizar la tabla despues de elimimar
                limpiarTable();
                cargarDatosTablaMusica();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna canción");
        }
    }//GEN-LAST:event_btnEliminarCancionActionPerformed

    private void btnReproducirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReproducirMouseClicked
        String ruta = txtPrueba.getText();
        System.out.println("Ruta del archivo: " + ruta);
        cancion.pararAudio();
        cancion = new RepMusica(ruta);
        cancion.reproducirAudio();
    }//GEN-LAST:event_btnReproducirMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.rowAtPoint(evt.getPoint());
        txtPrueba.setText(jTable1.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnReproducirVidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReproducirVidMouseClicked
        System.out.println("inicia");
        File file = new File(txtPruebaVid.getText());
        System.out.println(file.isFile());
        Media media = new Media(file.toURI().toString());
        System.out.println(file);
        VentanaVideo v = new VentanaVideo(media);

        v.setVisible(true);
    }//GEN-LAST:event_btnReproducirVidMouseClicked

    private void tableVideosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVideosMouseClicked
        int fila = tableVideos.rowAtPoint(evt.getPoint());
        txtPruebaVid.setText(tableVideos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tableVideosMouseClicked

    private void btnEliminarVidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarVidMouseClicked
        //este se agrego solo y no puedo borrarlo :'C
    }//GEN-LAST:event_btnEliminarVidMouseClicked

    private void btnEliminarVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVidActionPerformed
       if(!"".equals(txtPruebaVid.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null,"Esta seguro de que quiere eliminar este video?");
            if(pregunta == 0){
                Archivos archivoVid = new Archivos(archivoSeleccionado);
                archivoVid .eliminarArchivo(txtPruebaVid);
                
                cargarDatosTablaVideo();
                limpiarTableVideo();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún video");
        }
    }//GEN-LAST:event_btnEliminarVidActionPerformed

    private void tableImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableImagenMouseClicked
        int fila = tableImagen.rowAtPoint(evt.getPoint());
        txtPrueba3.setText(tableImagen.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tableImagenMouseClicked

    private void btnMostrarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarImgActionPerformed
        // Ruta de la imagen
        String rutaDeImagen = txtPrueba3.getText();
        // Cargar la imagen
        ImageIcon imagen = new ImageIcon(rutaDeImagen);
        // Escalar la imagen al tamaño del JLabel
        Image imagenEscalada = imagen.getImage().getScaledInstance(lblMostrarImagen.getWidth(), lblMostrarImagen.getHeight(), Image.SCALE_SMOOTH);
        // Establecer la imagen redimensionada en el JLabel
        lblMostrarImagen.setIcon(new ImageIcon(imagenEscalada));
        
        //Movernos hacia donde se muestra la imagen
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnMostrarImgActionPerformed

    private void btnImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesActionPerformed
        //Movernos hacia donde esta la tabla de imagenes
        jTabbedPane1.setSelectedIndex(2);
        lblGestorPro.setText("IMAGEN");
    }//GEN-LAST:event_btnImagenesActionPerformed
    
    private void btnEliminarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarImgMouseClicked
        //Se creo y no sé como eliminarlo
    }//GEN-LAST:event_btnEliminarImgMouseClicked
    
    private void btnEliminarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImgActionPerformed
        if(!"".equals(txtPrueba3.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null,"Esta seguro de que quiere eliminar esta Imagen?");
            if(pregunta == 0){
                Archivos archivoImg = new Archivos(archivoSeleccionado);
                archivoImg.eliminarArchivo(txtPrueba3);
                
                limpiarTableImagen();
                cargarDatosTablaImagen(); 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna Imagen");
        }
    }//GEN-LAST:event_btnEliminarImgActionPerformed

    private void tableRepetidosMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRepetidosMusicaMouseClicked
        int fila = tableRepetidosMusica.rowAtPoint(evt.getPoint());
        txtRutaDupMusica1.setText(tableRepetidosMusica.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tableRepetidosMusicaMouseClicked

    private void btnDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuplicadosActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS");
    }//GEN-LAST:event_btnDuplicadosActionPerformed

    private void btnImagenesDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesDupActionPerformed
               
        jTabbedPane1.setSelectedIndex(6);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS IMAGEN");
        String[] extensionesImgR = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
        modeloImagenR.setRowCount(0);
        MostrarImage archivoImgR = new MostrarImage(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoImgR.mostrarImgDup(archivo, modeloImagenR, extensionesImgR);
        }
    }//GEN-LAST:event_btnImagenesDupActionPerformed

    private void btnVideoDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoDupActionPerformed
        
        jTabbedPane1.setSelectedIndex(5);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS VIDEO");
        String[] extensionesVid = {".mp4"};//Declaración de extensiones para video
        modeloVideoR.setRowCount(0);
        RepVideo archivoVideoR = new RepVideo(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoVideoR.mostrarVideosDup(archivo, modeloVideoR, extensionesVid);
        }
    }//GEN-LAST:event_btnVideoDupActionPerformed

    private void btnMusicaDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaDupActionPerformed
        
        jTabbedPane1.setSelectedIndex(4);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS MUSICA");
        String[] extensiones = {".mp3", ".wma", ".flv"}; //Declaración de extensiones para música
        modeloMusicaR.setRowCount(0);
        Archivos archivoMusicaR = new Archivos(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoMusicaR.mostrarMusicaDuplicada(archivo, modeloMusicaR, extensiones);
        }
    }//GEN-LAST:event_btnMusicaDupActionPerformed

    private void btnImagenesDup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesDup1ActionPerformed
        
        jTabbedPane1.setSelectedIndex(6);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS IMAGEN");
        String[] extensionesImgR = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
        modeloImagenR.setRowCount(0);
        MostrarImage archivoImgR = new MostrarImage(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoImgR.mostrarImgDup(archivo, modeloImagenR, extensionesImgR);
        }
    }//GEN-LAST:event_btnImagenesDup1ActionPerformed

    private void btnVideoDup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoDup1ActionPerformed
                
        jTabbedPane1.setSelectedIndex(5);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS VIDEO");
        String[] extensionesVid = {".mp4"};//Declaración de extensiones para video
        modeloVideoR.setRowCount(0);
        RepVideo archivoVideoR = new RepVideo(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoVideoR.mostrarVideosDup(archivo, modeloVideoR, extensionesVid);
        }
    }//GEN-LAST:event_btnVideoDup1ActionPerformed

    private void btnMusicaDup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaDup1ActionPerformed
        
        jTabbedPane1.setSelectedIndex(4);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS MUSICA");
        String[] extensiones = {".mp3", ".wma", ".flv"}; //Declaración de extensiones para música
        modeloMusicaR.setRowCount(0);
        Archivos archivoMusicaR = new Archivos(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoMusicaR.mostrarMusicaDuplicada(archivo, modeloMusicaR, extensiones);
        }
    }//GEN-LAST:event_btnMusicaDup1ActionPerformed

    private void tableRepetidosVidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRepetidosVidMouseClicked
        int fila = tableRepetidosVid.rowAtPoint(evt.getPoint());
        txtRutaDupVideo1.setText(tableRepetidosVid.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tableRepetidosVidMouseClicked

    private void btnImagenesDup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesDup2ActionPerformed
       
        jTabbedPane1.setSelectedIndex(6);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS IMAGEN");
        String[] extensionesImgR = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
        modeloImagenR.setRowCount(0);
        MostrarImage archivoImgR = new MostrarImage(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoImgR.mostrarImgDup(archivo, modeloImagenR, extensionesImgR);
        }
    }//GEN-LAST:event_btnImagenesDup2ActionPerformed

    private void btnVideoDup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoDup2ActionPerformed
        
        jTabbedPane1.setSelectedIndex(5);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS VIDEO");
        String[] extensionesVid = {".mp4"};//Declaración de extensiones para video
        modeloVideoR.setRowCount(0);
        RepVideo archivoVideoR = new RepVideo(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoVideoR.mostrarVideosDup(archivo, modeloVideoR, extensionesVid);
        }
    }//GEN-LAST:event_btnVideoDup2ActionPerformed

    private void btnMusicaDup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaDup2ActionPerformed
       
        jTabbedPane1.setSelectedIndex(4);
        lblGestorPro.setText("ARCHIVOS DUPLICADOS MUSICA");
        String[] extensiones = {".mp3", ".wma", ".flv"}; //Declaración de extensiones para música
        modeloMusicaR.setRowCount(0);
        Archivos archivoMusicaR = new Archivos(archivoSeleccionado);
        
        for(File archivo : archivoSeleccionado){
            archivoMusicaR.mostrarMusicaDuplicada(archivo, modeloMusicaR, extensiones);
        }
    }//GEN-LAST:event_btnMusicaDup2ActionPerformed

    private void tableRepetidosImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRepetidosImgMouseClicked
        int fila = tableRepetidosImg.rowAtPoint(evt.getPoint());
        txtRutaDupImg1.setText(tableRepetidosImg.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tableRepetidosImgMouseClicked

    private void btnEliminarMusicaDupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMusicaDupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMusicaDupMouseClicked

    private void btnEliminarMusicaDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMusicaDupActionPerformed
        if(!"".equals(txtRutaDupMusica1.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null,"Esta seguro de que quiere eliminar esta Canción?");
            if(pregunta == 0){
                Archivos archivoMusica = new Archivos(archivoSeleccionado);
                archivoMusica.eliminarArchivo(txtRutaDupMusica1);
                
                limpiarTableMusicaRep();
                cargarDatosTablaMusicaRep();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna Imagen");
        }
    }//GEN-LAST:event_btnEliminarMusicaDupActionPerformed

    private void btnEliminarVidDupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarVidDupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVidDupMouseClicked

    private void btnEliminarVidDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVidDupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVidDupActionPerformed

    private void btnEliminarImgDupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarImgDupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarImgDupMouseClicked

    private void btnEliminarImgDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImgDupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarImgDupActionPerformed
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }
    
    //Método para agregar imagenes a los labels
    private void SetImageLabel(JLabel labelName, String root){
        //Se utiliza getClass().getResource si está dentro de la misma carpeta raiz
        ImageIcon image = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    }
    
    //Métodos para agregarle Imagenes a los botones
    public Icon setIcono(String url, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth()-5;
        int alto = boton.getHeight()-5;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
        return icono;
    }
    
    public Icon setIconoPresionado(String url, JButton boton, int ancho, int alto){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int anchura = boton.getWidth() - ancho;
        int altura = boton.getHeight()- alto;
         
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(anchura, altura, Image.SCALE_SMOOTH));
        
        return icono;
    }
    
    public void limpiarTable(){
        for(int i = 0; i < modeloT.getRowCount(); i++){
            modeloT.removeRow(i);
            i -= 1;
        }
    }
    
    public void cargarDatosTablaMusica(){
        modeloT.setRowCount(0); // Limpiar la tabla
        File directorio = new File(txtRuta.getText());
        String[] extensiones = {".mp3", ".wma", ".flv"}; // Definimos las extensiones que queremos mostrar
        Archivos archivoMusica = new Archivos(archivoSeleccionado);
        double tamanioByte = archivoMusica.tamanioArchivos(archivoSeleccionado, extensiones);
        double tamanioGB = tamanioByte / (1024 * 1024 * 1024);//Convierte el tamaño a GB
               
        long cantidad = 0;
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            cantidad = archivoMusica.contarArchivo(archivo, extensiones);
            tamanioByte1 = archivoMusica.tamanioArchivosDuplicados(archivo, extensiones);
            cantidadDup = archivoMusica.archivosDuplicados(archivo, extensiones);
            archivoMusica.mostrarArchivosMusica(directorio, modeloT, extensiones); // Llamamos al método existente para llenar la tabla
        }
        
        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtPesoTotalMusica.setText(String.format("%.2f GB" , tamanioGB));
        txtCantidadArchivosMusica.setText(String.valueOf(cantidad));
        txtDuplicadosMusica.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosMusica.setText(String.format("%.2f GB" , tamanioGB1));
    }
    
     public void limpiarTableVideo(){
        for(int i = 0; i < modeloVideo.getRowCount(); i++){
            modeloVideo.removeRow(i);
            i -= 1;
        }
    }
    
    public void cargarDatosTablaVideo(){
        modeloVideo.setRowCount(0); // Limpiar la tabla
        File directorio = new File(txtRuta.getText());
        String[] extensionesVid = {".mp4"};//Declaración de extensiones para video
        RepVideo archivoVideo = new RepVideo(archivoSeleccionado);
        double tamanioByte = archivoVideo.tamanioArchivos(archivoSeleccionado, extensionesVid);
        double tamanioGB = tamanioByte / (1024 * 1024 * 1024);//Convierte el tamaño a GB
               
        long cantidad = 0;
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            cantidad = archivoVideo.contarArchivo(archivo, extensionesVid);
            tamanioByte1 = archivoVideo.tamanioArchivosDuplicados(archivo, extensionesVid);
            cantidadDup = archivoVideo.archivosDuplicados(archivo, extensionesVid);
            archivoVideo.mostrarArchivoVideo(directorio, modeloVideo, extensionesVid); // Llamamos al método existente para llenar la tabla
        }
        
        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtPesoTotalVideo.setText(String.format("%.2f GB" , tamanioGB));
        txtCantidadArchivosVideo.setText(String.valueOf(cantidad));
        txtDuplicadosVideo.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosVideo.setText(String.format("%.2f GB" , tamanioGB1));
    }
    
    public void limpiarTableImagen(){
        for(int i = 0; i < modeloImagen.getRowCount(); i++){
            modeloImagen.removeRow(i);
            i -= 1;
        }
    }
    
    public void cargarDatosTablaImagen(){
        modeloImagen.setRowCount(0); // Limpiar la tabla
        File directorio = new File(txtRuta.getText());
        String[] extensionesImg = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
        MostrarImage archivoImg = new MostrarImage(archivoSeleccionado);
        double tamanioByte = archivoImg.tamanioArchivos(archivoSeleccionado, extensionesImg);
        double tamanioGB = tamanioByte / (1024 * 1024 * 1024);//Convierte el tamaño a GB
               
        long cantidad = 0;
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            cantidad = archivoImg.contarArchivo(archivo, extensionesImg);
            tamanioByte1 = archivoImg.tamanioArchivosDuplicados(archivo, extensionesImg);
            cantidadDup = archivoImg.archivosDuplicados(archivo, extensionesImg);
            archivoImg.mostrarArchivoImagen(directorio, modeloImagen, extensionesImg);// Llamamos al método existente para llenar la tabla    
        }
        
        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtPesoTotalImg.setText(String.format("%.2f GB" , tamanioGB));
        txtCantidadArchivosImg.setText(String.valueOf(cantidad));
        txtDuplicadosImg.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosImg.setText(String.format("%.2f GB" , tamanioGB1));
    }
    
     public void limpiarTableMusicaRep(){
        for(int i = 0; i < modeloMusicaR.getRowCount(); i++){
            modeloMusicaR.removeRow(i);
            i -= 1;
        }
    }
    
    public void cargarDatosTablaMusicaRep(){
        
         String[] extensiones = {".mp3", ".wma", ".flv"}; //Declaración de extensiones para música
        modeloMusicaR.setRowCount(0);
        Archivos archivoMusicaR = new Archivos(archivoSeleccionado);
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            tamanioByte1 = archivoMusicaR.tamanioArchivosDuplicados(archivo, extensiones);
            cantidadDup = archivoMusicaR.archivosDuplicados(archivo, extensiones);
            archivoMusicaR.mostrarMusicaDuplicada(archivo, modeloMusicaR, extensiones);
        }
        
        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtDuplicadosMusica1.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosMusica1.setText(String.format("%.2f GB" , tamanioGB1));
    }
    
    public void limpiarTableVideoRep(){
        for(int i = 0; i < modeloVideoR.getRowCount(); i++){
            modeloVideoR.removeRow(i);
            i -= 1;
        }
    }
    
        public void cargarDatosTablaVideoRep(){
        
         String[] extensionesVid = {".mp4"}; //Declaración de extensiones para video
        modeloVideoR.setRowCount(0);
        RepVideo archivoVideoR = new RepVideo(archivoSeleccionado);
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            tamanioByte1 = archivoVideoR.tamanioArchivosDuplicados(archivo, extensionesVid);
            cantidadDup = archivoVideoR.archivosDuplicados(archivo, extensionesVid);
            archivoVideoR.mostrarVideosDup(archivo, modeloVideoR, extensionesVid);
        }
        
        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtDuplicadosVideo1.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosVideo1.setText(String.format("%.2f GB" , tamanioGB1));
    }
    
    public void limpiarTableImgRep(){
        for(int i = 0; i < modeloImagenR.getRowCount(); i++){
            modeloImagenR.removeRow(i);
            i -= 1;
        }
    }
        
    public void cargarDatosTablaImgRep(){
        
        String[] extensionesImgR = {".jpg", ".jpeg", ".png", ".gif", ".raw", ".svg"};
        modeloImagenR.setRowCount(0);
        MostrarImage archivoImgR = new MostrarImage(archivoSeleccionado);
        
        double tamanioByte1 = 0;
        double tamanioGB1 = 0;
        long cantidadDup = 0;
        
        for(File archivo : archivoSeleccionado){
            tamanioByte1 = archivoImgR.tamanioArchivosDuplicados(archivo, extensionesImgR);
            cantidadDup = archivoImgR.archivosDuplicados(archivo, extensionesImgR);
            archivoImgR.mostrarImgDup(archivo, modeloImagenR, extensionesImgR);
        }

        tamanioGB1 = tamanioByte1 / (1024 * 1024 * 1024);//Convierte el tamaño a GB
        txtDuplicadosImg1.setText(String.valueOf(cantidadDup));
        txtTamañoDuplicadosImg1.setText(String.format("%.2f GB" , tamanioGB1));
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRuta;
    private javax.swing.JButton btnCrearPlaylist;
    private javax.swing.JButton btnDetenerCancion;
    private javax.swing.JButton btnDuplicados;
    private javax.swing.JButton btnEliminarCancion;
    private javax.swing.JButton btnEliminarImg;
    private javax.swing.JButton btnEliminarImgDup;
    private javax.swing.JButton btnEliminarMusicaDup;
    private javax.swing.JButton btnEliminarVid;
    private javax.swing.JButton btnEliminarVidDup;
    private javax.swing.JButton btnImagenes;
    private javax.swing.JButton btnImagenesDup;
    private javax.swing.JButton btnImagenesDup1;
    private javax.swing.JButton btnImagenesDup2;
    private javax.swing.JButton btnMostrarImg;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnMusicaDup;
    private javax.swing.JButton btnMusicaDup1;
    private javax.swing.JButton btnMusicaDup2;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnReproducirVid;
    private javax.swing.JButton btnVideo;
    private javax.swing.JButton btnVideoDup;
    private javax.swing.JButton btnVideoDup1;
    private javax.swing.JButton btnVideoDup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgregarRuta;
    private javax.swing.JLabel lblCarpeta;
    private javax.swing.JLabel lblDuplicados;
    private javax.swing.JLabel lblGestorPro;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMostrarImagen;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JLabel lblVideo;
    private javax.swing.JTable tableImagen;
    private javax.swing.JTable tableRepetidosImg;
    private javax.swing.JTable tableRepetidosMusica;
    private javax.swing.JTable tableRepetidosVid;
    private javax.swing.JTable tableVideos;
    private javax.swing.JTextField txtCantidadArchivosImg;
    private javax.swing.JTextField txtCantidadArchivosMusica;
    private javax.swing.JTextField txtCantidadArchivosVideo;
    private javax.swing.JTextField txtDuplicadosImg;
    private javax.swing.JTextField txtDuplicadosImg1;
    private javax.swing.JTextField txtDuplicadosMusica;
    private javax.swing.JTextField txtDuplicadosMusica1;
    private javax.swing.JTextField txtDuplicadosVideo;
    private javax.swing.JTextField txtDuplicadosVideo1;
    private javax.swing.JTextField txtPesoTotalImg;
    private javax.swing.JTextField txtPesoTotalMusica;
    private javax.swing.JTextField txtPesoTotalVideo;
    private javax.swing.JTextField txtPrueba;
    private javax.swing.JTextField txtPrueba3;
    private javax.swing.JTextField txtPruebaVid;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtRuta2;
    private javax.swing.JTextField txtRuta3;
    private javax.swing.JTextField txtRutaDupImg1;
    private javax.swing.JTextField txtRutaDupMusica1;
    private javax.swing.JTextField txtRutaDupVideo1;
    private javax.swing.JTextField txtTamañoDuplicadosImg;
    private javax.swing.JTextField txtTamañoDuplicadosImg1;
    private javax.swing.JTextField txtTamañoDuplicadosMusica;
    private javax.swing.JTextField txtTamañoDuplicadosMusica1;
    private javax.swing.JTextField txtTamañoDuplicadosVideo;
    private javax.swing.JTextField txtTamañoDuplicadosVideo1;
    // End of variables declaration//GEN-END:variables
}


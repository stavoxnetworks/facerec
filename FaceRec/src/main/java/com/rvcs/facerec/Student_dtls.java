/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pre_FRAMS;

import business_logic.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ray24
 */
public class Student_dtls extends javax.swing.JPanel {

    /**
     * Creates new form Student_dtls
     */
    student st=null;
    user usr=null;
    department dept=null;
    student_sub st_sub=null;
    subject sub=null;
    student_sub stsub=null;
    sub_dept sd=null;
    
//    public TakePhoto tp=null;
    public BufferedImage img=null,defimg=null;
    FaceCam livefeed=null;
    
    public Student_dtls() {
        initComponents();
        btn_takephoto.setEnabled(false);
        this.setBackground(Color.WHITE);
        jPanel1.setBackground(Color.decode("#838EDE"));
        //jPanel2.setBackground(Color.decode("#838EDE"));
        try {
            defimg = ImageIO.read(getClass().getResource("/images/not_available.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Student_dtls.class.getName()).log(Level.SEVERE, null, ex);
        }
            st_img.setText("");
            st_img.setIcon(new ImageIcon(defimg));
            
        sd=new sub_dept();
        st=new student();
        dept=new department();
        usr=new user();
        st_sub=new student_sub();
        sub=new subject();
        stsub=new student_sub();
        
        String deptall[]=dept.getAllDept();
        cmb_dept.removeAllItems();
        cmb_dept.addItem("Select department");
        for(int i=0;i<deptall.length;i++)
        {
            cmb_dept.addItem(deptall[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_userid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        cmb_dept = new javax.swing.JComboBox();
        cmb_sem = new javax.swing.JComboBox();
        txt_div = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_sub = new javax.swing.JList();
        st_img = new javax.swing.JLabel();
        panel_webam = new javax.swing.JPanel();
        btn_takephoto = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_startcam = new javax.swing.JButton();

        setName("Student_dtls"); // NOI18N
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("First Name :");

        jLabel2.setText("Last Name :");

        jLabel3.setText("Department :");

        jLabel4.setText("Semester :");

        jLabel5.setText("Division :");

        jLabel6.setText("Mobile No. :");

        jLabel7.setText("Email ID :");

        jLabel8.setText("User ID :");

        cmb_sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Semester", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cmb_sem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_semItemStateChanged(evt);
            }
        });

        jLabel9.setText("Subjects :");

        list_sub.setToolTipText("Select Subjects");
        jScrollPane1.setViewportView(list_sub);

        st_img.setText("Image of Student");
        st_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_img.setName("Image of Student"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(st_img, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_dept, 0, 204, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(st_img, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_webam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Camera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        panel_webam.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout panel_webamLayout = new javax.swing.GroupLayout(panel_webam);
        panel_webam.setLayout(panel_webamLayout);
        panel_webamLayout.setHorizontalGroup(
            panel_webamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        panel_webamLayout.setVerticalGroup(
            panel_webamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        btn_takephoto.setBackground(new java.awt.Color(131, 142, 222));
        btn_takephoto.setText("Take Photo");
        btn_takephoto.setToolTipText("Capture Photo of Student");
        btn_takephoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takephotoActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(131, 142, 222));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(131, 142, 222));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_view.setBackground(new java.awt.Color(131, 142, 222));
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(131, 142, 222));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(131, 142, 222));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_startcam.setBackground(new java.awt.Color(131, 142, 222));
        btn_startcam.setText("Start Camera");
        btn_startcam.setToolTipText("Capture Photo of Student");
        btn_startcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startcamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_reset)
                        .addGap(33, 33, 33)
                        .addComponent(btn_takephoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_startcam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_webam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_webam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_takephoto)
                            .addComponent(btn_startcam)
                            .addComponent(btn_reset)
                            .addComponent(btn_delete)
                            .addComponent(btn_view)
                            .addComponent(btn_save)
                            .addComponent(btn_update)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Student_dtls");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_takephotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takephotoActionPerformed
        // TODO add your handling code here:
            img=livefeed.CaptureFace();
            st_img.setText("");
            st_img.setIcon(new ImageIcon(img));
            livefeed.closeDown();
            panel_webam.remove(livefeed);
            btn_takephoto.setEnabled(false);
            btn_startcam.setEnabled(true);
            SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_btn_takephotoActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_userid.setText("");
        txt_div.setText("");
        txt_email.setText("");
        txt_fname.setText("");
        txt_lname.setText("");
        txt_mobile.setText("");
        st_img.setText("");
        st_img.setIcon(new ImageIcon(defimg));
        cmb_dept.setSelectedIndex(0);
        cmb_sem.setSelectedIndex(0);
        list_sub.removeAll();
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        if(st_img.getIcon()==null | txt_userid.getText().equals("") | txt_div.getText().equals("") | txt_fname.getText().equals("") | txt_lname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter all the details, And Take Photo of Student...");
        }
        else
        {
            if(list_sub.getSelectedValuesList()!=null)
            {
            List sel = list_sub.getSelectedValuesList();
            for(int i=0;i<sel.size();i++)                
                {
                    stsub.update(txt_div.getText(),sub.getSubID((String) sel.get(i)));
                }
            }
            InputStream is=null;
            int l=0;
            try {
                if(st_img.getIcon()!=null)
                {
                    ImageIcon ic=(ImageIcon)st_img.getIcon();
                    File f=new File("test.jpg");
                    f.createNewFile();
                    ImageIO.write((RenderedImage) ic.getImage(),"jpg", f);
                    FileInputStream fis=new FileInputStream(f);
                    is=(InputStream)fis;
                    l=(int) f.length();
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File error:"+ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(Student_dtls.class.getName()).log(Level.SEVERE, null, ex);
            }
            boolean flg=usr.update(txt_userid.getText(),txt_fname.getText(),txt_lname.getText(),txt_userid.getText(),"Student");
            if(flg==true)
            {
            boolean flag=st.update(txt_userid.getText(),Integer.parseInt((String) cmb_sem.getSelectedItem()),dept.getDeptID((String) cmb_dept.getSelectedItem()),txt_div.getText(),is,l,Long.parseLong(txt_mobile.getText()),txt_email.getText());
            if(flag==false)
            {
                JOptionPane.showMessageDialog(this,"Can't update details, Enter all the details, And Take Photo of Student...");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Update successful");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Can't update details, Enter all the details, And Take Photo of Student...");             
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        String uid=JOptionPane.showInputDialog(this,"Enter StudentID :");
        if(uid!=null)
        {
        InputStream im=st.getImage(uid);
        if(im==null)
        {
            JOptionPane.showMessageDialog(this,"Student ID does not exist...");
        }
        else
        {
            try {
                img=ImageIO.read(im);
            } catch (IOException ex) {
                Logger.getLogger(Student_dtls.class.getName()).log(Level.SEVERE, null, ex);
            }
            st_img.setText("");
            st_img.setIcon(new ImageIcon(img));
            txt_userid.setText(uid);
            txt_div.setText(st.getDivision(uid));
            txt_email.setText(st.getEmail(uid));
            txt_fname.setText(usr.getFName(uid));
            txt_lname.setText(usr.getLName(uid));
            cmb_sem.setSelectedIndex(st.getSemester(uid));
            
            txt_mobile.setText(st.getMobile(uid));
            cmb_dept.setSelectedItem(dept.getDept(st.getDeptID(uid)));
            
            String subid[]=stsub.getSubIDbyStudentID(uid);
            list_sub.removeAll();
            if(subid.length!=0)
            {
            String subj[]=new String[subid.length];
            for(int i=0;i<subid.length;i++)
            {
                subj[i]=sub.getSub(subid[i]);
            }
            list_sub.setListData(subj);
            }
            
        }
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        
        if(st_img.getIcon()==null | list_sub.getSelectedValuesList()==null | txt_userid.getText().equals("") | txt_div.getText().equals("") | txt_fname.getText().equals("") | txt_lname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter all the details, And Take Photo of Student...");
        }
        else
        {
            List sel = list_sub.getSelectedValuesList();
            boolean flg=usr.insert(txt_userid.getText(),txt_fname.getText(),txt_lname.getText(),txt_userid.getText(),"Student");
            if(flg==false)
            {
                JOptionPane.showMessageDialog(this,"Can't save details, Enter all the details, And Take Photo of Student...");
            }
            else
            {
            
            InputStream is=null;
            int l=0;
            try {
                //if(tp.path!=null)
                //{
                    if(st_img.getIcon()!=null)
                    {
                    String dir="Library_Image\\"+cmb_dept.getSelectedItem()+"\\"+cmb_sem.getSelectedItem()+"\\"+txt_div.getText();
                    ImageIcon ic=(ImageIcon)st_img.getIcon();
                    new File(dir).mkdirs();
                    File f=new File(dir+"\\"+txt_userid.getText()+".jpg");
                    f.createNewFile();
                    ImageIO.write((RenderedImage) ic.getImage(),"jpg", f);
                    FileInputStream fis=new FileInputStream(f);
                    is=(InputStream)fis;
                    l=(int) f.length();
                    }
                //}
            } catch (FileNotFoundException ex) {
                System.out.println("File error:"+ex.getMessage());
            }   catch (IOException ex) {
                    Logger.getLogger(Student_dtls.class.getName()).log(Level.SEVERE, null, ex);
                }
            if(l!=0)
            {
            boolean flag=st.insert(txt_userid.getText(), Integer.parseInt((String) cmb_sem.getSelectedItem()),dept.getDeptID((String) cmb_dept.getSelectedItem()),txt_div.getText(),is,l,Long.parseLong(txt_mobile.getText()),txt_email.getText());
            if(flag==false)
            {
                JOptionPane.showMessageDialog(this,"Can't insert details, Enter correct data...");
            }
            else
            {
                for(int i=0;i<sel.size();i++)                
                {
                    stsub.insert(txt_div.getText(),sub.getSubID((String) sel.get(i)));
                }
                JOptionPane.showMessageDialog(this,"Insert successful");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Can't insert image,capture image again...");
            }
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        String uid=JOptionPane.showInputDialog(this,"Enter StudentID :");
        if(uid!=null)
        {
        boolean flg=st.delete(uid);
        
        if(flg==false)
        {
            JOptionPane.showMessageDialog(this,"Student ID does not exist...");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Deleted...");
        }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void cmb_semItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_semItemStateChanged
        // TODO add your handling code here:
        if(cmb_dept.getSelectedIndex()!=0 && cmb_sem.getSelectedIndex()!=0)
        {
            String sub[]=null;
            String[] subid = sd.getSubIDbyDeptandSem(dept.getDeptID((String)cmb_dept.getSelectedItem()),Integer.parseInt((String)cmb_sem.getSelectedItem()));
            if(subid.length!=0)
            {
                sub=new String[subid.length];
                for(int i=0;i<subid.length;i++)
                {
                    sub[i]=this.sub.getSub(subid[i]);
                    //System.out.println(sub[i]);
                }
                list_sub.removeAll();
                list_sub.setListData(sub);
            }
            else
            {
                System.out.println("oops");
            }
        }
    }//GEN-LAST:event_cmb_semItemStateChanged

    private void btn_startcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startcamActionPerformed
        // TODO add your handling code here:
        livefeed=new FaceCam();
        livefeed.setSize(640,480);
        //livefeed.initcam();
        panel_webam.add(livefeed);
        btn_takephoto.setEnabled(true);
        btn_startcam.setEnabled(false);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_btn_startcamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_startcam;
    private javax.swing.JButton btn_takephoto;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox cmb_dept;
    private javax.swing.JComboBox cmb_sem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list_sub;
    private javax.swing.JPanel panel_webam;
    public javax.swing.JLabel st_img;
    private javax.swing.JTextField txt_div;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_userid;
    // End of variables declaration//GEN-END:variables
}

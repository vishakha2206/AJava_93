
import static com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class User_Operation extends javax.swing.JFrame 
{

   
    public User_Operation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Book Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Book Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        User_registration user = new User_registration();
        user.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Book_detail addbook = new Book_detail();
        addbook.setVisible(true);
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        view_table view = new view_table();
        view.setVisible(true);
        
       /*  DefaultTableModel dtm = new DefaultTableModel();
        JTable jTable1 = null;
        FillTable(jTable1, "select * from add_book_detail;");
        jTable1 = new JTable(dtm);*/
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Operation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables

    private void FillTable(JTable jTable1, String select__from_book) 
    {
         /*try
    {
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/16it093","root","");
           Statement stat = conn.createStatement();
             String Query = null;
        
           ResultSet rs = stat.executeQuery(Query);
           System.out.println(Query);

        //To remove previously added rows
        while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
            
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
            
        }

        rs.close();
        stat.close();
        conn.close();
    }
        catch(SQLException e)
        {
        }*/
    }
}


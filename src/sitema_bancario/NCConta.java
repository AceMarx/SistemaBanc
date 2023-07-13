/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitema_bancario;

import Conexao.HibernateUtil;
import classes.Agencia;
import classes.Cliente;
import classes.Conta;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author carlo
 */
public class NCConta extends javax.swing.JInternalFrame {

    /**
     * Creates new form NCConta
     */
    public NCConta() {
        initComponents();
        ComboBox();
    }
    private void Confirmar(){
      CadastrarCliente();
    }
    private void CadastrarCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome(TNome.getText());
        cliente.setCpf(TCPF.getText());
        cliente.setRg(TRG.getText());
        cliente.setEmissor(TEmissor.getText());
        cliente.setExpedicao(TExpedicao.getText());
        cliente.setNascimento(TNascimento.getText());
        cliente.setPai(TPai.getText());
        cliente.setMae(TMae.getText());
        cliente.setNacionalidade(TNacionalidade.getText());
        cliente.setNaturalidade(TNaturalidade.getText());
        cliente.setSexo(TSexo.getSelectedItem().toString());
        cliente.setEstadoCivil(TEstadoCivil.getSelectedItem().toString());
        cliente.setProfissao(TProfissao.getText());
        cliente.setRua(TRua.getText());
        cliente.setComplemento(TComplemento.getText());
        cliente.setBairro(TBairro.getText());
        cliente.setCidade(TCidade.getText());
        cliente.setEstado(TEstado.getText());
        cliente.setCep(TCidade.getText());
        cliente.setTelefone(TTelefone.getText());
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(cliente);
        s.getTransaction().commit();
        CConta();
    }
    private void CConta(){
        Conta conta = new Conta();
        conta.setCliente(PesquisarCliente());
        conta.setAgencia(PequisarAgencia());
        conta.setSenha(TSenha.getText());
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(conta);
        s.getTransaction().commit();
        NConta();
    }
    
     private void NConta(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Conta> lista = (List<Conta>)s.createQuery("From Conta").list();
        for(Conta c : lista){
            if(c.getCliente().getCpf().equals(TCPF.getText())){
                JOptionPane.showMessageDialog(null, "Conta Cadastrada! /n numero da conta é: "+c.getIdConta()+" numero da agencia agencia: "+c.getAgencia());
            }
        }
        s.getTransaction().commit();
    }
    
    private Cliente PesquisarCliente(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Cliente i=null;
        List<Cliente> lista = (List<Cliente>)s.createQuery("From Cliente").list();
        for(Cliente c : lista){
            if(c.getCpf().equals(TCPF.getText())){
                i = c;
                //s.getTransaction().commit();
                break;
            }
        }
        s.getTransaction().commit();
        return i;
    }
    private Agencia PequisarAgencia(){
       Agencia agencia = new Agencia();
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       List<Agencia> lista = (List<Agencia>)s.createQuery("From Agencia").list();
       for(Agencia a: lista){
         if(CAgencia.getSelectedItem().toString().equals(a.getNome())){
             agencia = a;
             break;
         }
       }
       s.getTransaction().commit();
       return agencia; 
    }
    private void ComboBox(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Agencia> lista = (List<Agencia>)s.createQuery("From Agencia").list();
        for(Agencia a: lista){
            CAgencia.addItem(a.getNome());
        }
        s.getTransaction().commit();
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
        TCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TNome = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TRG = new javax.swing.JTextPane();
        LAgencia = new javax.swing.JLabel();
        CAgencia = new javax.swing.JComboBox<>();
        LAgencia1 = new javax.swing.JLabel();
        TSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TEmissor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TExpedicao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TNascimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TPai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TMae = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TNacionalidade = new javax.swing.JTextField();
        TSexo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TEstadoCivil = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        TProfissao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TRua = new javax.swing.JTextField();
        TComplemento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TBairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TCidade = new javax.swing.JTextField();
        TEstado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TCep = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TTelefone = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        BConfirmar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TNaturalidade = new javax.swing.JTextPane();

        setClosable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CPF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 93, -1));

        TCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCPFActionPerformed(evt);
            }
        });
        TCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TCPFKeyPressed(evt);
            }
        });
        jPanel1.add(TCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 181, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 93, 26));

        jScrollPane1.setViewportView(TNome);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 278, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("RG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 64, -1));

        jScrollPane2.setViewportView(TRG);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 148, 30));

        LAgencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LAgencia.setText("Agencia");
        jPanel1.add(LAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 20));

        jPanel1.add(CAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 278, -1));

        LAgencia1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LAgencia1.setText("Senha");
        jPanel1.add(LAgencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 109, 28));
        jPanel1.add(TSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 94, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("ORGAO EMISSOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 164, 28));
        jPanel1.add(TEmissor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 119, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("DATA DE EXPEDICAO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 186, 20));
        jPanel1.add(TExpedicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 186, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("DATA DE NASCIMENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 199, 21));
        jPanel1.add(TNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, 22));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("NOME DO PAI");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 137, 21));
        jPanel1.add(TPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 278, 22));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("NOME DA MAE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 144, 20));
        jPanel1.add(TMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 278, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("NACIONALIDADE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 156, -1));
        jPanel1.add(TNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 278, 30));

        TSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));
        jPanel1.add(TSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 111, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("SEXO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 71, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("ESTADO CIVIL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 127, -1));

        TEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASADO", "SOLTEIRO", "DIVORCIADO" }));
        jPanel1.add(TEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 116, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("PROFISSAO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 107, -1));
        jPanel1.add(TProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 162, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("RUA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 55, -1));
        jPanel1.add(TRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 228, 30));
        jPanel1.add(TComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 86, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("COMPLEMENTO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 138, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("BAIRRO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 80, 20));
        jPanel1.add(TBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 228, 23));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("CIDADE");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 78, 23));
        jPanel1.add(TCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 228, 26));
        jPanel1.add(TEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 228, 26));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("ESTADO");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 82, 23));
        jPanel1.add(TCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 161, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("CEP");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 81, 19));
        jPanel1.add(TTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 161, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("TELEFONE");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 126, -1));

        BConfirmar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BConfirmar.setText("CONFIRMAR");
        BConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(BConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 150, 36));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("NATURALIDADE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 11, -1, 20));

        jScrollPane3.setViewportView(TNaturalidade);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 37, 291, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCPFKeyPressed
        // TODO add your handling code here:
        //        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            //            Pesquisar();
            //        }
    }//GEN-LAST:event_TCPFKeyPressed

    private void TCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCPFActionPerformed

    private void BConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirmarActionPerformed
        // TODO add your handling code here:
        Confirmar();
    }//GEN-LAST:event_BConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirmar;
    private javax.swing.JComboBox<String> CAgencia;
    private javax.swing.JLabel LAgencia;
    private javax.swing.JLabel LAgencia1;
    private javax.swing.JTextField TBairro;
    private javax.swing.JTextField TCPF;
    private javax.swing.JTextField TCep;
    private javax.swing.JTextField TCidade;
    private javax.swing.JTextField TComplemento;
    private javax.swing.JTextField TEmissor;
    private javax.swing.JTextField TEstado;
    private javax.swing.JComboBox<String> TEstadoCivil;
    private javax.swing.JTextField TExpedicao;
    private javax.swing.JTextField TMae;
    private javax.swing.JTextField TNacionalidade;
    private javax.swing.JTextField TNascimento;
    private javax.swing.JTextPane TNaturalidade;
    private javax.swing.JTextPane TNome;
    private javax.swing.JTextField TPai;
    private javax.swing.JTextField TProfissao;
    private javax.swing.JTextPane TRG;
    private javax.swing.JTextField TRua;
    private javax.swing.JTextField TSenha;
    private javax.swing.JComboBox<String> TSexo;
    private javax.swing.JTextField TTelefone;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

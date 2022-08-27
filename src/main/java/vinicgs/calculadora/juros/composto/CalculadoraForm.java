/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicgs.calculadora.juros.composto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public abstract class CalculadoraForm extends JFrame {
    
    private static final int TAMANHO_TXT = 10;

    protected JPanel pnlForm;
    protected JPanel pnlRodape;

    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;

    //Capital
    protected JLabel lblCapital;
    protected JTextField txtCapital;

    //Taxa juros 
    protected JLabel lblTaxaJuros;
    protected JTextField txtTaxaJuros;

    //Periodo
    protected JLabel lblPeriodo;
    protected JTextField txtPeriodo;

    //Montante
    protected JLabel lblMontante;
    protected JTextField txtMontante;

    public CalculadoraForm() {
        this.inicializar();
        this.eventos();
    }

    private void inicializar() {
        this.setTitle("Calculadora Juros Composto");
        this.getContentPane().setLayout(new BorderLayout());
        //operação padrão de fechamento (ao clicar no x).
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        
        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
        this.pack();
    }

    public JPanel getPnlRodape() {
        if (pnlRodape == null) {
            pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");

            pnlRodape.add(btnCalcular);
            pnlRodape.add(btnLimpar);
            pnlRodape.add(btnFechar);
        }
        return pnlRodape;
    }
    
    protected abstract void btnCalcularClick(ActionEvent ev);
    protected abstract void btnLimparCLick(ActionEvent ev);
    protected abstract void btnFecharClick(ActionEvent ev);
    
    private void eventos(){
        btnCalcular.addActionListener(this::btnCalcularClick);
        btnLimpar.addActionListener(this::btnLimparCLick);
        btnFechar.addActionListener(this::btnFecharClick);
        
    }

    public JPanel getPnlForm() {
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(4, 2));

            lblCapital = new JLabel("Capital");
            txtCapital = new JTextField(TAMANHO_TXT);

            lblTaxaJuros = new JLabel("Taxa Juros");
            txtTaxaJuros = new JTextField(TAMANHO_TXT);

            lblPeriodo = new JLabel("Período");
            txtPeriodo = new JTextField(TAMANHO_TXT);

            lblMontante = new JLabel("Montante");
            txtMontante = new JTextField(TAMANHO_TXT);
            txtMontante.setEditable(false);

            pnlForm.add(lblCapital);
            pnlForm.add(txtCapital);

            pnlForm.add(lblTaxaJuros);
            pnlForm.add(txtTaxaJuros);

            pnlForm.add(lblPeriodo);
            pnlForm.add(txtPeriodo);

            pnlForm.add(lblMontante);
            pnlForm.add(txtMontante);

        }

        return pnlForm;
    }

}

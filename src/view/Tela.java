package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import model.Aluno;

public class Tela extends Frame implements ActionListener {
    //__Components__
    Panel pnInterEsq, pnInterDir, pnCadastro;
    Label lbNome, lbEstado, lbCurso, lbInteresses;
    TextField tfNome;
    Choice chEstado;
    CheckboxGroup cbgCursos;
    Checkbox cbCurso1, cbCurso2, cbCurso3;
    List liInterEsq, liInterDir, liCadastro;
    Button btInserir, btAlterar, btConsultar, btSair, btDir, btEsq;
    
    //__Fonts__
    Font fPadrao = new Font("Tahoma", Font.PLAIN, 18);
    Font fUsuario = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
    
    //__Dimensions__
    Dimension dimLb = new Dimension(65, 25);
    Dimension dimBt = new Dimension(80, 40);
    
    //__Layouts__
    GridLayout grid = new GridLayout(1, 1);
    
    //__Alunos__
    Aluno alunos[] = new Aluno[20];
    int cadIndex = 0;
    Boolean alterar = false;

    public Tela() {
        //___Frame___
        this.setTitle("Cadastramento de alunos");
        this.setResizable(false);
        this.setBounds(100,100,575,515);
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        
        //___Labels___
        lbNome = new Label("Nome:");
        lbNome.setLocation(25, 50);
        lbNome.setSize(dimLb);
        lbNome.setFont(fPadrao);
        
        lbEstado = new Label("Estado:");
        lbEstado.setLocation(25, 100);
        lbEstado.setSize(dimLb);
        lbEstado.setFont(fPadrao);
        
        lbCurso = new Label("Curso:");
        lbCurso.setLocation(25, 150);
        lbCurso.setSize(dimLb);
        lbCurso.setFont(fPadrao);
        
        lbInteresses = new Label("Interesses:");
        lbInteresses.setLocation(25, 230);
        lbInteresses.setSize(90, 25);
        lbInteresses.setFont(fPadrao);
        
        //___TextFields___
        tfNome = new TextField();
        tfNome.setLocation(100, 51);
        tfNome.setSize(300, 25);
        tfNome.setFont(fUsuario);
        
        //___Choices___
        chEstado = new Choice();
        chEstado.setLocation(100, 102);
        chEstado.setSize(60, 25);
        chEstado.setFont(fUsuario);
        chEstado.addItem("AC");
        chEstado.addItem("AL");
        chEstado.addItem("AP");
        chEstado.addItem("AM");
        chEstado.addItem("BA");
        chEstado.addItem("CE");
        chEstado.addItem("DF");
        chEstado.addItem("ES");
        chEstado.addItem("GO");
        chEstado.addItem("MA");
        chEstado.addItem("MT");
        chEstado.addItem("MS");
        chEstado.addItem("MG");
        chEstado.addItem("PA");
        chEstado.addItem("PB");
        chEstado.addItem("PR");
        chEstado.addItem("PE");
        chEstado.addItem("PI");
        chEstado.addItem("RJ");
        chEstado.addItem("RN");
        chEstado.addItem("RS");
        chEstado.addItem("RO");
        chEstado.addItem("RR");
        chEstado.addItem("SC");
        chEstado.addItem("SP");
        chEstado.addItem("SE");
        chEstado.addItem("TO");
        
        //___Checkboxes___
        cbgCursos = new CheckboxGroup();
        
        cbCurso1 = new Checkbox("Curso 1", cbgCursos, false);
        cbCurso1.setLocation(100, 152);
        cbCurso1.setSize(60, 25);
        
        cbCurso2 = new Checkbox("Curso 2", cbgCursos, false);
        cbCurso2.setLocation(175, 152);
        cbCurso2.setSize(60, 25);
        
        cbCurso3 = new Checkbox("Curso 3", cbgCursos, false);
        cbCurso3.setLocation(250, 152);
        cbCurso3.setSize(60, 25);
        
        //___Lists___
        liInterEsq = new List();
        liInterEsq.add("Redes");
        liInterEsq.add("Segurança da informação");
        liInterEsq.add("Banco de dados");
        liInterEsq.add("Engenharia de Software");
        liInterEsq.add("Programação");
        liInterEsq.add("Robótica");
        liInterEsq.add("Sistemas para a internet");
        liInterEsq.add("Sistemas de informação");
        liInterEsq.add("Engenharia da computação");
        liInterEsq.add("Jogos digitais");
        
        liInterDir = new List();
        
        liCadastro = new List();

        //___Panels___
        pnInterEsq = new Panel(grid);
        pnInterEsq.setLocation(25, 260);
        pnInterEsq.setSize(200, 100);
        pnInterEsq.add(liInterEsq);
        
        pnInterDir = new Panel(grid);
        pnInterDir.setLocation(350, 260);
        pnInterDir.setSize(200, 100);
        pnInterDir.add(liInterDir);
        
        pnCadastro = new Panel(grid);
        pnCadastro.setLocation(25, 370);
        pnCadastro.setSize(525, 125);
        pnCadastro.add(liCadastro);
        
        //___Buttons___
        btInserir = new Button("Inserir");
        btInserir.setLocation(470, 50);
        btInserir.setSize(dimBt);
        btInserir.addActionListener(this);
        
        btAlterar = new Button("Alterar");
        btAlterar.setLocation(470, 100);
        btAlterar.setSize(dimBt);
        btAlterar.addActionListener(this);
        
        btConsultar = new Button("Consultar");
        btConsultar.setLocation(470, 150);
        btConsultar.setSize(dimBt);
        btConsultar.addActionListener(this);
        
        btSair = new Button("Sair");
        btSair.setLocation(470, 200);
        btSair.setSize(dimBt);
        btSair.addActionListener(this);
        
        btDir = new Button(">>");
        btDir.setLocation(264, 275);
        btDir.setSize(50, 30);
        btDir.addActionListener(this);
        btDir.setFont(fUsuario);
        
        btEsq = new Button("<<");
        btEsq.setLocation(264, 320);
        btEsq.setSize(50, 30);
        btEsq.addActionListener(this);
        btEsq.setFont(fUsuario);
        
        //___adds___
        this.add(lbNome);
        this.add(lbEstado);
        this.add(lbCurso);
        this.add(lbInteresses);
        this.add(tfNome);
        this.add(chEstado);
        this.add(cbCurso1);
        this.add(cbCurso2);
        this.add(cbCurso3);
        this.add(pnInterEsq);
        this.add(pnInterDir);
        this.add(pnCadastro);
        this.add(btInserir);
        this.add(btAlterar);
        this.add(btConsultar);
        this.add(btSair);
        this.add(btDir);
        this.add(btEsq);
    }

    public static void main(String[] args) {
        new Tela().setVisible(true);
    }
    
    private void moverInteresse(String interesse, Object botao) {
        
        if (interesse != null) {
           
            if (botao == btDir) {
                liInterDir.add(interesse);
                liInterEsq.remove(interesse);
            }
            else if (botao == btEsq) {
                liInterEsq.add(interesse);
                liInterDir.remove(interesse);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object componente;
        String nome, estado;
        Checkbox slctdCurso;
        int curso, i, interDirCount;
        
        componente = e.getSource();
        
        if (componente == btInserir) {
            
            if (alterar) {
                alterar = false;
            }
            else {
                cadIndex = liCadastro.getItemCount();
            }
            
            interDirCount = liInterDir.getItemCount();
            
            nome = tfNome.getText();
            estado = chEstado.getSelectedItem();
            
            alunos[cadIndex] = new Aluno(interDirCount);
            alunos[cadIndex].setNome(nome);
            tfNome.setText("");
            alunos[cadIndex].setEstado(estado);
            chEstado.select(0);
            
            slctdCurso = cbgCursos.getSelectedCheckbox();
            
            if (slctdCurso == cbCurso1) {
                alunos[cadIndex].setCurso(1);
                cbgCursos.setSelectedCheckbox(null);
            }
            else if (slctdCurso == cbCurso2) {
                alunos[cadIndex].setCurso(2);
                cbgCursos.setSelectedCheckbox(null);
            }
            else if (slctdCurso == cbCurso3) {
                alunos[cadIndex].setCurso(3);
                cbgCursos.setSelectedCheckbox(null);
            }
            
            for (i = 0; i < interDirCount; i++) {
                
                alunos[cadIndex].setInteresse(liInterDir.getItem(0), i);
                moverInteresse(liInterDir.getItem(0), btEsq);
            }
            
            liCadastro.add(nome, cadIndex);
        }
        else if(componente == btConsultar) {
            
            cadIndex = liCadastro.getSelectedIndex();
            
            if (cadIndex != -1) {
                JOptionPane.showMessageDialog(null, alunos[cadIndex].toString(), "Dados cadastrais", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(componente == btDir) {
            
            moverInteresse(liInterEsq.getSelectedItem(), btDir);
        }
        else if(componente == btEsq) {
            
            moverInteresse(liInterDir.getSelectedItem(), btEsq);
        }
        else if(componente == btAlterar) {
            
            if (!alterar) {
                cadIndex = liCadastro.getSelectedIndex();
            
                if (cadIndex != -1) {

                    nome = alunos[cadIndex].getNome();
                    estado = alunos[cadIndex].getEstado();
                    tfNome.setText(nome);
                    chEstado.select(estado);
                    
                    curso = alunos[cadIndex].getCurso();

                    switch (curso) {
                        case 1: cbgCursos.setSelectedCheckbox(cbCurso1); break;
                        case 2: cbgCursos.setSelectedCheckbox(cbCurso2); break;
                        case 3: cbgCursos.setSelectedCheckbox(cbCurso3); break;
                    }

                    interDirCount = alunos[cadIndex].getInteressesLen();

                    for (i = 0; i < interDirCount; i++) {

                        moverInteresse(alunos[cadIndex].getInteresse(i), btDir);
                    }

                    liCadastro.remove(nome);
                    alterar = true;
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}

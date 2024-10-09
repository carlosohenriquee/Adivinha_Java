import javax.swing.JOptionPane;

public class Adivinha1 {
    public static void main (String args[]){

        int anoNasc, anoAtual, idade, resposta;
        String entrada;

        anoAtual = 2024;

        
    
        JOptionPane.showMessageDialog(null,"Vamos descobrir sua idade!","Idade", 1);
       
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Idade",-1);

        entrada = JOptionPane.showInputDialog(null,"Digite o ano que você nasceu","Idade",-1);
        anoNasc = Integer.parseInt(entrada);

        idade = anoAtual - anoNasc;
    
        resposta = JOptionPane.showConfirmDialog(null, "Você já fez aniversário esse ano? Sim/Não", "Idade", JOptionPane.YES_NO_OPTION);

        if(resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,nome+", Você tem "+idade+" anos ", "idade",-1);
        } else {
            idade = idade - 1;
            JOptionPane.showMessageDialog(null,nome+", você tem "+idade+" anos", "idade",-1);
        }
            
        }

    }


    
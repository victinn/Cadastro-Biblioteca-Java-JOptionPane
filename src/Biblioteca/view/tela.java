package Biblioteca.view;
import Biblioteca.entities.Livros;
import Biblioteca.entities.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class tela {
    static ArrayList<Livros> arrayLivros = new ArrayList(); 
    static ArrayList<Usuarios> arrayUsuarios = new ArrayList();
 
    public static void main(String[] args) {
       
        
        Object[] escolhas = {"Cadastrar Livro", "Cadastrar Usuário", "Vizualizar Livros", "Vizualizar Usuários", "Remover Livros", "Remover Usuários", "Alterar Livros", "Alterar Usuários", "Sair"};
        int menu = 0;
        while(menu != 8 && menu != -1){
            menu = JOptionPane.showOptionDialog(null, "Selecione uma Ação", "Menu", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, escolhas, escolhas[0]);
            
            switch(menu){
            case 0:
                cadastrarLivros();
               break;
            case 1:
                cadastarUsuarios();
                break;   
            case 2:
                listarLivros();
                break;
            case 3:
                listarUsuarios();
                break;
            case 4:
                removerLivros();                  
                break;
            case 5:
                removerUsuarios();
                break;
            case 6:
                alterarLivros();
                break;
            case 7:
                alterarUsuarios();
                break;
            }    
       }

    }

      public static void cadastrarLivros(){
        Object[] generos = {"Romance", "Ficção", "Terror"};
        Livros l = new Livros();
                    
        l.setTitulo(JOptionPane.showInputDialog(null, "Digite o novo título"));  
        l.setPaginas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo número de páginas")));
        l.setNomeAutor(JOptionPane.showInputDialog(null, "Digite o novo nome do autor"));
        l.setGenero((String) JOptionPane.showInputDialog(null, "Selecione um novo gênero", "Gêneros", JOptionPane.INFORMATION_MESSAGE, null, generos, generos[0]));
        l.setEditora(JOptionPane.showInputDialog(null, "Digite a nova editora"));
        l.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo número de páginas")));
        
        arrayLivros.add(l);
     
    }

        public static void cadastarUsuarios(){
            Usuarios u = new Usuarios();
            
            u.setNome(JOptionPane.showInputDialog("Digite o nome do Usuário"));
            u.setEmail(JOptionPane.showInputDialog("Digite o email"));
            u.setSenha(JOptionPane.showInputDialog("Digite a senha"));
            u.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
            u.setCurso(JOptionPane.showInputDialog("Digite o curso"));
            
            arrayUsuarios.add(u);

        }

        public static Livros listarLivros(){
            Livros escolha = (Livros) JOptionPane.showInputDialog(null, "Livros", "Vizualizar-Livos", JOptionPane.INFORMATION_MESSAGE, null, arrayLivros.toArray(), arrayLivros.get(0));
            
            return escolha;
        }
        
        public static Usuarios listarUsuarios(){
            Usuarios escolha = (Usuarios) JOptionPane.showInputDialog(null, "Usuarios", "Vizualizar-Usuarios", JOptionPane.INFORMATION_MESSAGE, null, arrayUsuarios.toArray(), arrayUsuarios.get(0));
            
            return escolha;
        }

        public static void removerLivros(){
            Livros escolha = listarLivros();
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse livro?");
            if (opcao == 0) {
                arrayLivros.remove(escolha);
            }
            else{

            }

        }
        
        public static void removerUsuarios(){
            Usuarios escolha = listarUsuarios();
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse usuário?");
            if (opcao == 0){
                arrayUsuarios.remove(escolha);
            }
            else{
                
            }
        }
        
        public static void alterarLivros(){
            Object[] generos = {"Romance", "Ficção", "Terror"};
            Livros escolha = listarLivros();
            escolha.setTitulo(JOptionPane.showInputDialog(null, "Digite o novo título"));  
            escolha.setPaginas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo número de páginas")));
            escolha.setNomeAutor(JOptionPane.showInputDialog(null, "Digite o novo nome do autor"));
            escolha.setGenero((String) JOptionPane.showInputDialog(null, "Selecione um novo gênero", "Gêneros", JOptionPane.INFORMATION_MESSAGE, null, generos, generos[0]));
            escolha.setEditora(JOptionPane.showInputDialog(null, "Digite a nova editora"));
            escolha.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo número de páginas")));
            
        }
        
        public static void alterarUsuarios(){
            Usuarios escolha = listarUsuarios();
            
            escolha.setNome(JOptionPane.showInputDialog("Digite o nome do Usuário"));
            escolha.setEmail(JOptionPane.showInputDialog("Digite o email"));
            escolha.setSenha(JOptionPane.showInputDialog("Digite a senha"));
            escolha.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
            escolha.setCurso(JOptionPane.showInputDialog("Digite o curso"));
        }
}





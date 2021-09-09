package tde;

public class TdeEx3 {
    public class Funcionario {
        private String nome;
        private int id;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getId() {
            return id;
        }

        public class Gerente extends Funcionario {
            private String usuario;
            private String senha;

            public String getUsuario() {
                return usuario;
            }

            public void setUsuario(String usuario) {
                this.usuario = usuario;
            }

            public String getSenha() {
                return senha;
            }

            public void setSenha(String senha) {
                this.senha = senha;
            }

            public  double getId(){
                return this.getId();
            }

        }

    }
  
}

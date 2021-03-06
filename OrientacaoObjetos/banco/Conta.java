    package OrientacaoObjetos.banco;

    /**
     * Conta
     * @author Peter Thomas
     *
     */
    public class Conta {

        private String agencia;
        private int numero;
        private double saldo;
        private double limite;
        protected Cliente titular;
        private static int totalDeContas;


        public int geNumero() { return this.numero; }

        public void setNumero(int numero) { this.numero = numero; }

        public double getSaldo() {
            return this.saldo + this.limite;
        }

        public void setLimite(double limite) {
            this.limite = limite;
        }

        public String getTitular() {
            return this.titular.getNome();
        }

        public void setTitular(Cliente c) {
            this.titular = c ;
        }

        public static int totalDeContas() {
            return Conta.totalDeContas;
        }

        public Conta() {
            super();
        }
        public Conta(Cliente titular, int numero, double saldo, double limite) {
            super();
            this.totalDeContas = this.totalDeContas + 1;
            this.titular = titular;
            this.numero = numero;
            this.saldo = saldo;
            this.limite = limite;
        }

        boolean saque(double quantidade) {
            if (this.saldo < quantidade || quantidade > this.saldo + this.limite) {
                System.out.println("Saldo insuficiente");
                return false;
            } else {
                this.saldo = this.saldo - quantidade;
                return true;
            }
        }


        /*
        * Metodo que incrementa o saldo.
        * @param quantidade
        * */
        void deposita(double quantidade) {
            if (quantidade % 2 == 0) {
                this.saldo += quantidade;
            }
        }

        boolean tranferePara(Conta destino, double valor) {
            if (!this.saque(valor)) {
                return false;
            } else {
                destino.deposita(valor);
                return true;
            }
        }
    }
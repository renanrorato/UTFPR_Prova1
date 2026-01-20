public abstract class ClienteBanco implements Verifica {

    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    @Override
    public void verifDoc() {
        if (this instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) this;

            // Verificação de CPF
            if (pf.getCpf() >= 10 && pf.getCpf() <= 20) {
                System.out.println("CPF válido!");
            } else {
                System.out.println("CPF inválido!");
            }
        } else if (this instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) this;

            // Verificação de nome do responsável
            if (pj.getResponsavel() != null && pj.getResponsavel().getNome().length() > 30) {
                System.out.println("Nome inválido para Responsável!");
            } else {
                System.out.println("Nome válido para Responsável!");
            }
        }
    }

    public void validar() {
        if (numeroConta % 2 == 0) {
            System.out.println("*CONTA PAR*");
        } else {
            System.out.println("*CONTA IMPAR*");
        }
    }

    // Getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta < 0) {
            throw new NumException();
        } else {
            this.numeroConta = numeroConta;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }
}

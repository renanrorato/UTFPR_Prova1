public class TstConta {

    public static void main(String[] args) throws NumException {

        PessoaJuridica pj = new PessoaJuridica();
        PessoaFisica pf = new PessoaFisica();
        Endereco endPJ = new Endereco();
        PessoaFisica resp = new PessoaFisica();

        pj.setResponsavel(resp);

        try {
            // F1) Entrada de dados
            // PJ
            pj.setNumeroConta(4321); // conta negativa dispara exceção
            pj.setCnpj(1000);
            endPJ.setRua("Times Square");

            // PF
            pf.setCpf(15);
            resp.setNome("Tony Stark");
            pf.setEnder(endPJ);

            // F2) Saída de dados na ordem obrigatória
            // PJ
            System.out.println("\nConta: " + pj.getNumeroConta());
            pj.validar();
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Rua: " + endPJ.getRua());

            // PF
            System.out.println("CPF do responsável: " + pf.getCpf());
            pf.verifDoc();   // Método de verificação de CPF agora na classe ClienteBanco
            System.out.println("Responsável: " + resp.getNome());
            pj.verifDoc();   // Método de verificação de Nome do Responsável agora na classe ClienteBanco

        } catch (NumException e) {
            e.impMsg();
        }
    }
}

public class PrincipalTelefone {
    public static void main(String args[]) {
        Telefone[] telefones = new Telefone[2];

        telefones[0] = new Telefone(55,47,996305089);
        telefones[1] = new Telefone(55,47,988324428);

        telefones[0].exibir();
        telefones[1].exibir();
    }
}
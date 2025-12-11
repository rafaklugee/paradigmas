public class Principal {
    public static void main(String[] args) {
        // Polimorfismo (Ad Hoc) de coerção upcast
        Monitor monitorEdital = new MonitorEdital("Rafael", "Paradigmas de Programação", 20244439);
        Monitor monitorGenerico = new MonitorPET("Alejandro", "Circuitos Digitais", 20240000);
        monitorEdital.metodo();
        monitorEdital.relatorioAtividades();

        // Polimorfismo (Ad Hoc) de coerção downcast
        if (monitorGenerico instanceof MonitorPET) {
            MonitorPET monitorPET = (MonitorPET) monitorGenerico;
            monitorPET.metodo();
            monitorPET.relatorioAtividades();
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Filme filme = new Filme();
   // IO.println(filme.getNome());
        filme.setNome("lagoa azul");
    IO.println(filme.getNome());
filme.setDuracao(-200);
    IO.println(filme.getDuracao());

    filme.setDataestreia(LocalDate.of(2020, 1, 1));
    }


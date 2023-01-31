package financas.modulos;

import financas.modulos.model.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class PessoaService {

    public Pessoa buscarPessoaPorId(Long id){
        return Pessoa.findById(id);
    }

    @Transactional
    public void salvarPessoa(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "FULANO DA SILVA";
        pessoa1.persist();
    }
}

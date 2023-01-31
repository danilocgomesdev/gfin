package financas.modulos;

import financas.modulos.model.Pessoa;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/teste")
public class Teste {

    @Inject
    PessoaService pessoaService;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response teste(@PathParam("id") Long id){
        Pessoa pessoa = pessoaService.buscarPessoaPorId(id);
        return Response.ok().entity(pessoa).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response teste(){
        pessoaService.salvarPessoa();
        return Response.ok().build();
    }
}

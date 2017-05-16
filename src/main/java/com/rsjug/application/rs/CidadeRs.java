package com.rsjug.application.rs;

import com.rsjug.application.persistence.entity.Cidade;
import com.rsjug.application.persistence.entity.Uf;
import com.rsjug.application.service.CidadeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by mateus on 13/05/17.
 */
@Path("cidade/")
@Api(value = "cidade", description = "Busca cidades", tags = "cidades")
public class CidadeRs {

    @Inject
    private CidadeService cidadeService;

    @GET
    @Path("buscaPorUf")
    @Produces("application/json")
    @ApiOperation(value = "Busca todos as cidades do Uf",
            response = Cidade.class,
            responseContainer = "List")
    public Response buscaTodos(@QueryParam("uf") String uf) {
        return Response.ok(cidadeService.findByUf(uf)).build();
    }
}

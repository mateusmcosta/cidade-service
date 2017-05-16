package com.rsjug.application.rs;

import com.rsjug.application.persistence.entity.Uf;
import com.rsjug.application.service.UfService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by mateus on 12/05/17.
 */
@Path("uf/")
@Api(value = "uf", description = "Busca UFs", tags = "uf")
public class UfRs {

    @Inject
    private UfService ufService;

    @GET
    @Path("buscaTodos")
    @Produces("application/json")
    @ApiOperation(value = "Busca todos os Estados",
            response = Uf.class,
            responseContainer = "List")
    public Response buscaTodos() {
        return Response.ok(ufService.buscaTodos()).build();
    }
}
